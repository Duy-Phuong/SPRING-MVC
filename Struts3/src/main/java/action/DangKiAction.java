package action;

import com.opensymphony.xwork2.ActionSupport;

public class DangKiAction extends ActionSupport {
 
    private static final long serialVersionUID = 7299264265184515893L;
     
     private String username;
     public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;
     private String message;
    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
    public String execute() {
    	if(username.equalsIgnoreCase("phuong") == true && password.equalsIgnoreCase("123") == true) {
    		return "success";
    	}else {
    		this.message = "thông tin k hợp lệ";
    		return "fail";
    	}
    }
 
}
