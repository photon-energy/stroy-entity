package web.stroymart.services.entity.users.confirmation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Messages {

    private String recipient;
    @JsonProperty("message-id")
    private String message_id;
    private SMS sms;

    public Messages(){}

    public Messages(String recipient, String message_id, SMS sms){
        this.recipient = recipient;
        this.message_id = message_id;
        this.sms = sms;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    public SMS getSms() {
        return sms;
    }

    public void setSms(SMS sms) {
        this.sms = sms;
    }
}
