package entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity(name = "sanpham")
public class SanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idsanpham;
	@OneToOne
	@JoinColumn(name="iddanhmucsanpham")
	DanhMucSanPham iddanhmucsanpham;
	String tensanpham;
	String gia;
	String mota;
	String hinhsanpham;
	String gianhcho;
	
	@OneToMany(fetch=FetchType.EAGER ,cascade=CascadeType.ALL) // bai 73 //@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idsanpham")
	Set<ChiTietSanPham> chitietsanpham;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="chitietkhuyenmai",
	joinColumns={@JoinColumn(name="idsanpham",referencedColumnName="idsanpham")},
	inverseJoinColumns={@JoinColumn(name="idkhuyenmai",referencedColumnName="idkhuyenmai")})
	Set<KhuyenMai> danhsachkhuyenmai;
	
	
	
	public String getGianhcho() {
		return gianhcho;
	}
	public void setGianhcho(String gianhcho) {
		this.gianhcho = gianhcho;
	}
	public Set<ChiTietSanPham> getChitietsanpham() {
		return chitietsanpham;
	}
	public void setChitietsanpham(Set<ChiTietSanPham> chitietsanpham) {
		this.chitietsanpham = chitietsanpham;
	}
	public Set<KhuyenMai> getDanhsachkhuyenmai() {
		return danhsachkhuyenmai;
	}
	public void setDanhsachkhuyenmai(Set<KhuyenMai> danhsachkhuyenmai) {
		this.danhsachkhuyenmai = danhsachkhuyenmai;
	}
	public DanhMucSanPham getDanhmucsanpham() {
		return iddanhmucsanpham;
	}
	public void setDanhmucsanpham(DanhMucSanPham danhmucsanpham) {
		this.iddanhmucsanpham = danhmucsanpham;
	}
	public int getMasanpham() {
		return idsanpham;
	}
	public void setMasanpham(int masanpham) {
		this.idsanpham = masanpham;
	}
	
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getGiatien() {
		return gia;
	}
	public void setGiatien(String giatien) {
		this.gia = giatien;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getHinhsanpham() {
		return hinhsanpham;
	}
	public void setHinhsanpham(String hinhsanpham) {
		this.hinhsanpham = hinhsanpham;
	}
	
	
	
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
//		@ManyToMany(cascade=CascadeType.ALL)
//		@JoinTable(name="nv_sp",
//								joinColumns = {@JoinColumn(name = "idsanpham", referencedColumnName="id")},
//								inverseJoinColumns = {@JoinColumn(name = "idnhanvien", referencedColumnName="id")})
//		Set<NhanVien> nhanviens;
//		
//		public Set<NhanVien> getNhanviens() {
//			return nhanviens;
//		}
//		public void setNhanviens(Set<NhanVien> nhanviens) {
//			this.nhanviens = nhanviens;
//		}
	
	
}
