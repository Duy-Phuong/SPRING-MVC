package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="sizesanpham")
public class SizeSanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idsizesanpham;
	String tensize;
	public int getMasize() {
		return idsizesanpham;
	}
	public void setMasize(int masize) {
		this.idsizesanpham = masize;
	}
	public String getSize() {
		return tensize;
	}
	public void setSize(String size) {
		this.tensize = size;
	}
	
	
}
