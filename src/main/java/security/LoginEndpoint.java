package security;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import entity.User;
import facade.UserFacade;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import exceptions.AuthenticationException;

@Path("login")
public class LoginEndpoint {

    public static final int TOKEN_EXPIRE_TIME = 1000 * 60 * 30; //30 min
    UserFacade us;
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(String jsonString) throws AuthenticationException {
        System.out.println("String" + jsonString);
        JsonObject json = new JsonParser().parse(jsonString).getAsJsonObject();
        String email = json.get("email").getAsString();
        String password = json.get("password").getAsString();   
        //Todo refactor into facade
        try {
            User user = UserFacade.getInstance().getVerifiedUser(email, password);
            System.out.println("candy user: " + user.getRolesAsStrings() );
            
            String token = createToken(email, user.getRolesAsStrings(), user.getFirstName(), user.getLastName(), user.getPhone(), user.getAddress(), user.getCity() ,user.getZip());
            JsonObject responseJson = new JsonObject();
            responseJson.addProperty("email", email);
            responseJson.addProperty("token", token);
            return Response.ok(new Gson().toJson(responseJson)).build();

        } catch (Exception ex) {
            if (ex instanceof AuthenticationException) {
                throw (AuthenticationException) ex;
            }
            ex.printStackTrace();
        }
        throw new AuthenticationException("Invalid email or password! Please try again");
    }

    private String createToken(String email,List<String> roles, String firstName,String lastName, String phone,String address,String city, int zip) throws JOSEException {

        StringBuilder res = new StringBuilder();
        for (String string : roles) {
            res.append(string);
            res.append(",");
        }
        String rolesAsString = res.length() > 0 ? res.substring(0, res.length() - 1) : "";
        String issuer = "semesterdemo_security_course"; //redo this to your own
        JWSSigner signer = new MACSigner(SharedSecret.getSharedKey());
        Date date = new Date();
        JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
                .subject(email)
                .claim("email", email)
                .claim("roles", rolesAsString)
                .claim("firstName", firstName)
                .claim("lastName", lastName)
                .claim("phone", phone)
                .claim("address", address)
                .claim("city", city)
                .claim("zip", zip)
                .claim("issuer", issuer)
                .issueTime(date)
                .expirationTime(new Date(date.getTime() + TOKEN_EXPIRE_TIME))
                .build();
        SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);
        signedJWT.sign(signer);
        return signedJWT.serialize();

    }
}
