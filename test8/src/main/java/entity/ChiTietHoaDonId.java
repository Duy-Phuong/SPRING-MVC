package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDonId implements Serializable{
	
	int idhoadon;
	int idchitietsanpham;
	
	public int getMahoadon() {
		return idhoadon;
	}
	public void setMahoadon(int idhoadon) {
		this.idhoadon = idhoadon;
	}
	public int getMachitietsanpham() {
		return idchitietsanpham;
	}
	public void setMachitietsanpham(int idchitietsanpham) {
		this.idchitietsanpham = idchitietsanpham;
	}
	
	
}
