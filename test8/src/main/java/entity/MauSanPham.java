package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="mausanpham")
public class MauSanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idmausanpham;
	String tenmau;
	public int getMamau() {
		return idmausanpham;
	}
	public void setMamau(int mausanpham) {
		this.idmausanpham = mausanpham;
	}
	public String getTenmau() {
		return tenmau;
	}
	public void setTenmau(String tenmau) {
		this.tenmau = tenmau;
	}
	
	
}
