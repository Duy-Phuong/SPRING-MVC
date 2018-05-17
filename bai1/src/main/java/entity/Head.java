package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("head")
public class Head {
	private String head;

	public Head(String head) {
		super();
		this.head = head;
	}
	
	public Head() {
		
	}

	public String getHead() {
		return head;
	}
	@Autowired
	public void setHead(@Value("head") String head) {
		this.head = head;
	}
	
}
