package web.stroymart.services.entity.reports;

public class PriceReportsList {

    private String product_id;
    private String product_items_id;
    private String price_id;
    private String product_name;
    private Integer purchase_price;
    private Integer price;
    private Integer promotion_price;
    private Integer discount;
    private Integer is_promotion;
    private String expire_date_promotion;
    private String created_time;

    public PriceReportsList(){}

    public PriceReportsList(String product_id, String product_items_id, String price_id, String product_name, Integer purchase_price, Integer price,
                            Integer promotion_price, Integer discount, Integer is_promotion, String expire_date_promotion, String created_time){
        this.product_id = product_id;
        this.product_items_id = product_items_id;
        this.price_id = price_id;
        this.product_name = product_name;
        this.purchase_price = purchase_price;
        this.price = price;
        this.promotion_price = promotion_price;
        this.discount = discount;
        this.is_promotion = is_promotion;
        this.expire_date_promotion = expire_date_promotion;
        this.created_time = created_time;
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

    public String getPrice_id() {
        return price_id;
    }

    public void setPrice_id(String price_id) {
        this.price_id = price_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
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
