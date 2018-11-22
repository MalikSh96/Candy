package mappers;

/**
 *
 * @author malik
 */
public class CandyInfo {
    
    private String candyName;

    public CandyInfo(String candyName) {
        this.candyName = candyName;
    }

    @Override
    public String toString() {
        return "CandyInfo{" + "candyName=" + candyName + '}';
    }
}
