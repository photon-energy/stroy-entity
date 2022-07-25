package web.stroymart.services.entity.kafka;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "requestType",
        "responseData",
})
public class RequestKafka {

    @JsonProperty("requestType")
    private String requestType;

    @JsonIgnore
    private Map<String, Object> responseData = new HashMap<String, Object>();

    @JsonProperty("requestType")
    public String getRequestType() {
        return requestType;
    }

    @JsonProperty("requestType")
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }


    @JsonAnyGetter
    public Map<String, Object> getResponseData() {
        return this.responseData;
    }

    @JsonAnySetter
    public void setResponseData(String name, Object value) {
        this.responseData.put(name, value);
    }

}
