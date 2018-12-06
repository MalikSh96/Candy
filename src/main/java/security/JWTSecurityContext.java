
package security;
import java.security.Principal;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.SecurityContext;
public class JWTSecurityContext implements SecurityContext {
   UserPrincipal user;
   ContainerRequestContext request;

   public JWTSecurityContext(UserPrincipal user,ContainerRequestContext request) {
       System.out.println("Brøndby"+ user);
       this.user = user;
       this.request = request;
   }
   @Override
   public boolean isUserInRole(String role) {
       System.out.println("Hello");
       return user.isUserInRole(role);
   }
   @Override
   public boolean isSecure() {
       return request.getUriInfo().getBaseUri().getScheme().equals("https");
   }
   @Override
   public Principal getUserPrincipal() {
       return user;
   }
   @Override
   public String getAuthenticationScheme() {
       return "JWT"; //Only for INFO
   }
}

