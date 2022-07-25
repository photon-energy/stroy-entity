package web.stroymart.services.entity.reports;

public class PriceReport {

    private String price_report_id;
    private String product_id;
    private String product_items_id;
    private Integer purchase_price;
    private Integer price;
    private Integer promotion_price;
    private Integer discount;
    private Integer is_promotion;
    private String expire_date_promotion;
    private String created_time;

    public PriceReport(){}

    public PriceReport(String price_report_id, String product_id, String product_items_id, Integer purchase_price, Integer price,
                       Integer promotion_price, Integer discount, Integer is_promotion, String expire_date_promotion, String created_time){
        this.price_report_id = price_report_id;
        this.product_id = product_id;
        this.product_items_id = product_items_id;
        this.purchase_price = purchase_price;
        this.price = price;
        this.promotion_price = promotion_price;
        this.discount = discount;
        this.is_promotion = is_promotion;
        this.expire_date_promotion = expire_date_promotion;
        this.created_time = created_time;
    }

    public String getPrice_report_id() {
        return price_report_id;
    }

    public void setPrice_report_id(String price_report_id) {
        this.price_report_id = price_report_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_items_id() {
        return product_items_id;
    }

    public void setProduct_items_id(String product_items_id) {
        this.product_items_id = product_items_id;
    }

    public Integer getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Integer purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPromotion_price() {
        return promotion_price;
    }

    public void setPromotion_price(Integer promotion_price) {
        this.promotion_price = promotion_price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getIs_promotion() {
        return is_promotion;
    }

    public void setIs_promotion(Integer is_promotion) {
        this.is_promotion = is_promotion;
    }

    public String getExpire_date_promotion() {
        return expire_date_promotion;
    }

    public void setExpire_date_promotion(String expire_date_promotion) {
        this.expire_date_promotion = expire_date_promotion;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
