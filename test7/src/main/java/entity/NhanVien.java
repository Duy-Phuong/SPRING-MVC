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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Columns;

@Entity(name="nhanvien")
public class NhanVien {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	int tuoi;
	String name;
	
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="idnhanvien")
//	Set<SanPham> sanphams;
	
	//bai 58
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="nv_sp",
							joinColumns = {@JoinColumn(name = "idnhanvien", referencedColumnName="id")},
							inverseJoinColumns = {@JoinColumn(name = "idsanpham", referencedColumnName="id")})
	Set<SanPham> sanphams;
	
	public Set<SanPham> getSanphams() {
		return sanphams;
	}
	public void setSanphams(Set<SanPham> sanphams) {
		this.sanphams = sanphams;
	}
	//
	
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
