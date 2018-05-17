package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
 
import org.apache.struts2.ServletActionContext;
 
import com.opensymphony.xwork2.ActionSupport;

import entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginAction extends ActionSupport {
 
    private static final long serialVersionUID = 7299264265184515893L;
 
    private static String DB_URL = "jdbc:mysql://localhost:3306/example";
    private static String USER_NAME = "root";
    private static String PASSWORD = "1234";
    
    private List<Student> listStudents;

    private String username;
    private String password;
//    private List<Student> list = new ArrayList<Student>();
// 
//    public List<Student> getList() {
//		return list;
//	}
//
//	public void setList(List<Student> list) {
//		this.list = list;
//	}

	@Override
    public String execute() {
 
        HttpServletRequest request = ServletActionContext.getRequest();
 
        if (this.username != null && this.password != null && this.username.equals("admin")
                && this.password.equals("admin123")) {
 
            HttpSession session = request.getSession();
             
            // Lưu trữ userName vào trong trong session.
            session.setAttribute("loginedUsername", this.username);
            //doc tu csdl
          
    	 
    	    try {
	            // connnect to database 'testdb'
	            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
	            // crate statement
	            Statement stmt = conn.createStatement();
	            // get data from table 'student'
	            ResultSet rs = stmt.executeQuery("select * from student");
	            // show data
	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
	                        + "  " + rs.getString(3));
	                //list.add(new Student(rs.getInt(1), rs.getString(2) , rs.getString(3)));
	            }
	            // close connection
	            conn.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
    	    
    	    PreparedStatement stsm = null;
    	    try {
	            // connnect to database 'testdb'
	            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
	            // crate statement
	            stsm = conn.prepareStatement("select * from student where id=? and name=?");
	            // get data from table 'student'
	           stsm.setInt(1, 2);
	           stsm.setString(2, "Dung");
	            // show data
	           ResultSet rs = stsm.executeQuery();
	           int dem=0;
	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
	                        + "  " + rs.getString(3));
	                dem++;
	            }
	            if(dem==1)
	            	System.out.println("khop!");
	            // close connection
	            conn.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
    	 
    	 
    	 
    	    listStudents = new ArrayList<Student>();
            listStudents.add(new Student(1, "Vinh", "Male", "vinh@gmail.com", 
                    "0981231234", "Ha Noi", false));
            listStudents.add(new Student(2, "Hoa", "Female", "hoa@gmail.com", 
                    "0981241234", "Ha Noi", false));
            listStudents.add(new Student(3, "Phu", "Male", "phu@gmail.com", 
                    "0981258888", "Ha Noi", false));
            listStudents.add(new Student(4, "Quy", "Male", "quy@gmail.com", 
                    "0981268888", "Ha Noi", false));
            listStudents.add(new Student(5, "Phong", "Male", "phong@gmail.com", 
                    "0981278888", "Ha Noi", false));
            return "success";
        } else {
            addActionError(getText("error.login"));
            return "error";
        }
    }
    
    public List<Student> getListStudents() {
		return listStudents;
	}

	public void setListStudents(List<Student> listStudents) {
		this.listStudents = listStudents;
	}

	//
    public static Connection getConnection(String dbURL, String userName, 
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
    //
 
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
}