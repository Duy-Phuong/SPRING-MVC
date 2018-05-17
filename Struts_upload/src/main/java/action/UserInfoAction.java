package action;

import com.opensymphony.xwork2.ActionSupport;

public class UserInfoAction extends ActionSupport {
 
    private static final long serialVersionUID = 7299264265184515893L;
     
     
    @Override
    public String execute() {
     
        return "userInfoPage";
    }
 
}
