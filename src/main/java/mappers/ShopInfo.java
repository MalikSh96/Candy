package mappers;

public class ShopInfo {
    private String shopName;
    private String shopAddress;
    private int shopPostalCode;
    private int shopPrice;

    public ShopInfo(String shopName, String shopAddress, int shopPostalCode) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopPostalCode = shopPostalCode;
    }
    
    public ShopInfo(int price) {
        this.shopPrice = price;
    }

    @Override
    public String toString() {
        return "ShopInf: " + "shopName: " + shopName + ", shopAddress: " + shopAddress + ", shopPostalCode: " + shopPostalCode + '\n';
    }
}
