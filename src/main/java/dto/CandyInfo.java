package dto;

import entity.CandyType;

/**
 *
 * @author malik
 */
public class CandyInfo {
    
    
    private int id;
    private String candyName;
    private String flavour;
    private String type;

    public CandyInfo(CandyType candy) {
        this.id = candy.getId();
        this.candyName = candy.getCandyName();
        this.flavour = candy.getFlavour();
        this.type = candy.getType();
    }

//    public CandyInfo(String candyName) {
//        this.candyName = candyName;
//    }

    @Override
    public String toString() {
        return "CandyInfo{" + "id=" + id + ", candyName=" + candyName + ", flavour=" + flavour + ", type=" + type + '}';
    }
}
