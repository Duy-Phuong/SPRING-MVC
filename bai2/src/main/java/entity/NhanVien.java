package entity;

import javax.validation.constraints.Size;

public class NhanVien {
	@Size(min=5, max=100, message="min > 5 ")
	String tenNhanVien;
	
	public NhanVien(String tenNhanVien, int tuoi, String diaChi) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		
	}
	
	
	//video 7
	GiamDoc giamdoc;
	public GiamDoc getGiamDoc() {
		return giamdoc;
	}
	public void setGiamDoc(GiamDoc doc) {
		this.giamdoc = doc;
	}
	
	public NhanVien(GiamDoc doc) {
		this.giamdoc = doc;
		
	}
	//
	
	
	
	public NhanVien(String tenNhanVien, int tuoi) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
	}
	
	int tuoi;
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		diaChi = diaChi;
	}
	String diaChi;
	public NhanVien() {
		
	}
	public void getInfo() {
		System.out.println("Thong bao tu nhan vien");
		System.out.println("Hello: " + tenNhanVien + " tuoi " + tuoi);
	}
	
	//video 5

}
