package action;




import com.opensymphony.xwork2.ActionSupport;

public class CaclAction extends ActionSupport {
 
   private int operator;
   public int getOperator() {
	return operator;
}
public void setOperator(int operator) {
	this.operator = operator;
}
public int getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}
private int num1;
   private int num2;
   private int result;
	@Override
    public String execute() {
    	switch(operator) {
    	case 1:
    		result = num1 + num2;
    		break;
    	case 2:
    		result = num1 - num2;
    		break;
    	default:
    		return "fail";
    	}
    	return "success";
    }
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
 
}
