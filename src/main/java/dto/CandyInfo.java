package dto;

import entity.CandyType;

/**
 *
 * @author malik
 */
public class CandyInfo {
    
    private String candyName;

    public CandyInfo(CandyType candy) {
        this.candyName = candy.getCandyName();
    }

//    public CandyInfo(String candyName) {
//        this.candyName = candyName;
//    }

    @Override
    public String toString() {
        return "CandyInfo{" + "candyName=" + candyName + '}';
    }
}
