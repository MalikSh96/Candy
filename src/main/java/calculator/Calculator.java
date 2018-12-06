package calculator;

import entity.Orderline;
import entity.Shop;
import facade.ReviewFacade;
import java.util.List;

/**
 *
 * @author malik
 */
public class Calculator {
    
    private int unitPrice;
    private int totalPrice;
    private ReviewFacade rf;
    public int unitP(int weight, Shop s)
    {
        unitPrice = (weight * (s.getPrice() / 100));
        return unitPrice;
    }

    public int getTotalP(List<Orderline> ol)
    {
        for (Orderline orderline : ol) {
            totalPrice += orderline.getTotalPricePrCandyType();
        }
        return totalPrice;
    }
    
//    public double totalReviewScore(List<Integer> list){
//    
//      
//        return null;
//    }
}
