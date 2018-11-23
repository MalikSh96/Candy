package mappers;

import entity.CandyType;

/**
 *
 * @author malik
 */
public class CandyInfo {

    private int id;
    private String candyName;

    public CandyInfo(String candyName) {
        this.candyName = candyName;
    }

    public CandyInfo(int id, String candyName) {
        this.id = id;
        this.candyName = candyName;
    }

    public CandyInfo(CandyType c) {

       this.id = c.getId();
       this.candyName = c.getCandyName();
        
//         new CandyInfo(id, candyName);
    }

    @Override
    public String toString() {
        return "{" + "id: " + id + ", candyName: " + candyName + '}';
    }

}
