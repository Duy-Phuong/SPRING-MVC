package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDonId implements Serializable{
	
	int idhoadon;
	int idsanpham;
	
	public int getMahoadon() {
		return idhoadon;
	}
	public void setMahoadon(int idhoadon) {
		this.idhoadon = idhoadon;
	}
	public int getMachitietsanpham() {
		return idsanpham;
	}
	public void setMachitietsanpham(int idsanpham) {
		this.idsanpham = idsanpham;
	}
	
	
}
