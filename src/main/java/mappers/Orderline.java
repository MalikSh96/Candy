
package mappers;

public class Orderline {

        private String candyName; 
        private int totalWeight;
        private int totalPricePrCandyType;

    public Orderline(String candyName, int totalWeight, int totalPricePrCandyType) {
        this.candyName = candyName;
        this.totalWeight = totalWeight;
        this.totalPricePrCandyType = totalPricePrCandyType;
    }

    @Override
    public String toString() {
        return "Orderline{" + "candyName=" + candyName + ", totalWeight=" + totalWeight + ", totalPricePrCandyType=" + totalPricePrCandyType + '}';
    }



        
}
