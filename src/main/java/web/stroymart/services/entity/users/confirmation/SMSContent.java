package web.stroymart.services.entity.users.confirmation;

public class SMSContent {

    private String text;

    public SMSContent(){}

    public SMSContent(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
