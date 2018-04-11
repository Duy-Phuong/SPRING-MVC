package entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name = "sanpham")
public class SanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	public SanPham() {
		
	}
	String name;
	int gia;
	
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="idnhanvien")
//	NhanVien nhanvien; //bo cai id nhan vien ra neu  se loi
	
	
	
	
//	public NhanVien getNhanvien() {
//		return nhanvien;
//	}
//	public void setNhanvien(NhanVien nhanvien) {
//		this.nhanvien = nhanvien;
//	}
	
	
	//bai 58
		@ManyToMany(cascade=CascadeType.ALL)
		@JoinTable(name="nv_sp",
								joinColumns = {@JoinColumn(name = "idsanpham", referencedColumnName="id")},
								inverseJoinColumns = {@JoinColumn(name = "idnhanvien", referencedColumnName="id")})
		Set<NhanVien> nhanviens;
		
		public Set<NhanVien> getNhanviens() {
			return nhanviens;
		}
		public void setNhanviens(Set<NhanVien> nhanviens) {
			this.nhanviens = nhanviens;
		}
	//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	
	
}
