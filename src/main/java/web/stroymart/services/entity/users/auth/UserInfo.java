package web.stroymart.services.entity.users.auth;

public class UserInfo {

    private String sub;
    private String[] roles;
    private String preferred_username;

    public UserInfo(){}

    public UserInfo(String sub, String[] roles, String preferred_username){
        this.sub = sub;
        this.roles = roles;
        this.preferred_username = preferred_username;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getPreferred_username() {
        return preferred_username;
    }

    public void setPreferred_username(String preferred_username) {
        this.preferred_username = preferred_username;
    }
}
