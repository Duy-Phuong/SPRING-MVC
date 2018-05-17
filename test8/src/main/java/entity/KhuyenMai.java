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

@Entity(name="khuyenmai")
public class KhuyenMai {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idkhuyenmai;
	int giagiam;
	String tenkhuyenmai;
	String ngaybatdau;
	String ngayketthuc;
	
	String mota;
	String hinhthuckhuyenmai;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="chitietkhuyenmai",
	joinColumns={@JoinColumn(name="idkhuyenmai",referencedColumnName="idkhuyenmai")},
	inverseJoinColumns={@JoinColumn(name="idsanpham",referencedColumnName="idsanpham")})
	Set<SanPham> danhsachsanpham;
	
	public int getIdkhuyenmai() {
		return idkhuyenmai;
	}

	public void setIdkhuyenmai(int idkhuyenmai) {
		this.idkhuyenmai = idkhuyenmai;
	}

	public int getGiagiam() {
		return giagiam;
	}

	public void setGiagiam(int giagiam) {
		this.giagiam = giagiam;
	}

	public String getTenkhuyenmai() {
		return tenkhuyenmai;
	}

	public void setTenkhuyenmai(String tenkhuyenmai) {
		this.tenkhuyenmai = tenkhuyenmai;
	}

	public String getNgaybatdau() {
		return ngaybatdau;
	}

	public void setNgaybatdau(String ngaybatdau) {
		this.ngaybatdau = ngaybatdau;
	}

	public String getNgayketthuc() {
		return ngayketthuc;
	}

	public void setNgayketthuc(String ngayketthuc) {
		this.ngayketthuc = ngayketthuc;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getHinhkhuyenmai() {
		return hinhthuckhuyenmai;
	}

	public void setHinhkhuyenmai(String hinhkhuyenmai) {
		this.hinhthuckhuyenmai = hinhkhuyenmai;
	}

	public Set<SanPham> getDanhsachsanpham() {
		return danhsachsanpham;
	}

	public void setDanhsachsanpham(Set<SanPham> danhsachsanpham) {
		this.danhsachsanpham = danhsachsanpham;
	}

	

	
}
