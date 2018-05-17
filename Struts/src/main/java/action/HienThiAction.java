package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.TaiKhoan;

public class HienThiAction extends ActionSupport {
 
    private static final long serialVersionUID = 7299264265184515893L;
    
    private String username;
    private TaiKhoan tk = new TaiKhoan();
    
    List<TaiKhoan> list = new ArrayList<TaiKhoan>();

//phai co get set no ms nhan dk
     
    public TaiKhoan getTk() {
		return tk;
	}


	public List<TaiKhoan> getList() {
		return list;
	}


	public void setList(List<TaiKhoan> list) {
		this.list = list;
	}


	public void setTk(TaiKhoan tk) {
		this.tk = tk;
	}


	@Override
    public String execute() {
		this.tk = new TaiKhoan("Phuong", "password");
		
        this.list.add(new TaiKhoan("Phuong1", "1"));
        this.list.add(new TaiKhoan("Phuong2", "2"));
        this.list.add(new TaiKhoan("Phuong3", "3"));

        
        return "success";
    }
 

    public String hienthi() {
        this.username = "Hello Phuong";
        
        
        return "hienthi";
    }
    

    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
}