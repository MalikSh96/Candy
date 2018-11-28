package dto;

import entity.Reviews;

/**
 *
 * @author malik
 */
public class ReviewsInfo {
    private Integer id;
    private int shopId;
    private String review;
    private int rating;

    public ReviewsInfo(Reviews reviews) {
        this.id = reviews.getId();
        this.shopId = reviews.getShop().getId();
        this.review = reviews.getReview();
        this.rating = reviews.getRating();
    }

    @Override
    public String toString() {
        return "ReviewsInfo{" + "id=" + id + ", review=" + review + ", rating=" + rating + '}';
    }
}
