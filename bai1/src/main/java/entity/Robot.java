package entity;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	private String name;
	private int tuoi;
	private Head head;
		
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
	public void setName(@Value("Nam")String name) {
		this.name = name;
	}
	public int getTuoi() {
		return tuoi;
	}
	@Autowired
	public void setTuoi(@Value("#{1+1}") int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		String str = "Robot[-name: "+ name + " - tuoi: " + tuoi + " - Head name: " + head.getHead() + "]";
		return str;
	}
	public Head getHead() {
		return head;
	}
	@Inject
	@Named(value="head")
	public void setHead(Head head) {
		this.head = head;
	}

}
