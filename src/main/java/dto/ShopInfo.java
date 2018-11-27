package dto;

import entity.Shop;

/**
 *
 * @author malik
 */
public class ShopInfo {
    private String shopName;
    private String shopAddress;
    private int shopPostalCode;
    private int phone;
    private String email;

    public ShopInfo(Shop shop)
    {
        this.shopName = shop.getShopName();
        this.shopAddress = shop.getShopAddress();
        this.shopPostalCode = shop.getShopPostalCode();
        this.phone = shop.getPhone();
        this.email = shop.getEmail();
    }
    
//    public ShopInfo(String shopName, String shopAddress, int shopPostalCode, int phone, String email) {
//        this.shopName = shopName;
//        this.shopAddress = shopAddress;
//        this.shopPostalCode = shopPostalCode;
//        this.phone = phone;
//        this.email = email;
//    }

    @Override
    public String toString() {
        return "ShopInfo{" + "shopName=" + shopName + ", shopAddress=" + shopAddress + ", shopPostalCode=" + shopPostalCode + ", phone=" + phone + ", email=" + email + '}';
    }
}