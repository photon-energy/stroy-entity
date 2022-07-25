package web.stroymart.services.entity.reports;

import java.util.List;

public class ResponsePriceReports {

    private boolean success;
    private String message;
    private Integer total;
    private List<PriceReportsList> data;

    public ResponsePriceReports(){}

    public ResponsePriceReports(boolean success, String message, Integer total, List<PriceReportsList> data){
        this.success = success;
        this.message = message;
        this.total = total;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<PriceReportsList> getData() {
        return data;
    }

    public void setData(List<PriceReportsList> data) {
        this.data = data;
    }
}
