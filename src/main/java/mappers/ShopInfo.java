/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

/**
 *
 * @author malik
 */
public class ShopInfo {
    private String shopName;
    private String shopAddress;
    private int shopPostalCode;

    public ShopInfo(String shopName, String shopAddress, int shopPostalCode) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopPostalCode = shopPostalCode;
    }

    @Override
    public String toString() {
        return "ShopInf: " + "shopName: " + shopName + ", shopAddress: " + shopAddress + ", shopPostalCode: " + shopPostalCode + '\n';
    }
}
