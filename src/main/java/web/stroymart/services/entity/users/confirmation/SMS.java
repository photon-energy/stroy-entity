package web.stroymart.services.entity.users.confirmation;

public class SMS {

    private String originator;
    private SMSContent content;

    public SMS(){}

    public SMS(String originator, SMSContent content){
        this.originator = originator;
        this.content = content;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public SMSContent getContent() {
        return content;
    }

    public void setContent(SMSContent content) {
        this.content = content;
    }
}
