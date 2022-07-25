package web.stroymart.services.entity.kafka;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "response"
})
public class ResponseKafka {

    @JsonProperty("status")
    private boolean status;

    @JsonIgnore
    private Map<String, Object> response = new HashMap<String, Object>();

    @JsonProperty("status")
    public boolean getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(boolean status) {
        this.status = status;
    }

    @JsonAnyGetter
    public Map<String, Object> getResponse() {
        return this.response;
    }

    @JsonAnySetter
    public void setResponse(String name, Object value) {
        this.response.put(name, value);
    }

}
