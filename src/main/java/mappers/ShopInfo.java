/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import entity.Shop;



public class ShopInfo {
    private int id;
    private String shopName;
    private String shopAddress;
    private int shopPostalCode;

    public ShopInfo(int id, String shopName, String shopAddress, int shopPostalCode) {
        this.id = id;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopPostalCode = shopPostalCode;
    }
    
    
    public ShopInfo(Shop s){
        this.id = s.getId();
        this.shopName = s.getShopName();
        this.shopAddress = s.getShopAddress();
        this.shopPostalCode = s.getShopPostalCode();
    
    }
    

    @Override
    public String toString() {
        return "{" + "shopName: " + shopName + ", shopAddress: " + shopAddress + ", shopPostalCode: " + shopPostalCode + '}';
    }

    
}
