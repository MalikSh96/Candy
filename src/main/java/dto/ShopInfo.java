package dto;

import entity.Shop;

/**
 *
 * @author malik
 */
public class ShopInfo {
    private int id;
    private String shopName;
    private String shopAddress;
    private int shopPostalCode;
    private int shopPrice;
    private int phone;
    private String email;

    public ShopInfo() {
        
    }
    public ShopInfo(Shop shop)
    {
        this.id = shop.getId();
        this.shopName = shop.getShopName();
        this.shopAddress = shop.getShopAddress();
        this.shopPostalCode = shop.getShopPostalCode();
        this.phone = shop.getPhone();
        this.email = shop.getEmail();
        this.shopPrice = shop.getPrice();
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
        return "ShopInfo{" + "id=" + id + ", shopName=" + shopName + ", shopAddress=" + shopAddress + ", shopPostalCode=" + shopPostalCode + ", phone=" + phone + ", email=" + email + '}';
    }

   
}
