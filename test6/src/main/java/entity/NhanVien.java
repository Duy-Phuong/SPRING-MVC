package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

@Entity(name="nhanvien")
public class NhanVien {
	
	@Id
	int id;
	int tuoi;
	String name;

	
	public NhanVien(String name, int tuoi) {
		super();
		this.name = name;
		this.tuoi = tuoi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getTenNhanVien() {
		return name;
	}
	public void setTenNhanVien(String name) {
		this.name = name;
	}
	
	
	public NhanVien() {
		
	}
	public void getInfo() {
		System.out.println("Thong bao tu nhan vien");
		System.out.println("Hello: " + name + " tuoi " + tuoi);
	}
	
	//video 5
	public void start() {
		System.out.println("init");
	}
	public void destroy() {
		System.out.println("destroy");
	}
	
	//video6
	public static NhanVien createNhanVien() {
		NhanVien nv = new NhanVien();
		nv.setTenNhanVien("demo create method: factory");
		return nv;
	}
}
