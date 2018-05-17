package entity;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:jdbc.properties")
public class Robot {
	private String name;
	private int tuoi;
		
	public Robot(String name, int tuoi) {
		this.name = name;
		this.tuoi = tuoi;
	}
	public Robot() {
		
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("${jdbc.user}")String name) {
		this.name = name;
	}
	public int getTuoi() {
		return tuoi;
	}
	@Autowired
	public void setTuoi(@Value("#{2+3}") int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		String str = "Robot[-name: "+ name + " - tuoi: " + tuoi  + "]";
		return str;
	}
	

}
