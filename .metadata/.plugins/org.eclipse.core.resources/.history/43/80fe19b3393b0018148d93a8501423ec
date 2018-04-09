package entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class NhanVien {
	String tenNhanVien;
	
	public NhanVien(String tenNhanVien, int tuoi, String diaChi) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
		DiaChi = diaChi;
		
	}
	
	
	//video 7
	GiamDoc doc;
	public GiamDoc getGiamDoc() {
		return doc;
	}
	public void setGiamDoc(GiamDoc doc) {
		this.doc = doc;
	}
	
	public NhanVien(GiamDoc doc) {
		this.doc = doc;
		
	}
	//
	
	//video 8
	List<String> list;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
	List<GiamDoc> listGiamDoc;
	
	public List<GiamDoc> getListGiamDoc() {
		return listGiamDoc;
	}
	public void setListGiamDoc(List<GiamDoc> listGiamDoc) {
		this.listGiamDoc = listGiamDoc;
	}
	
	// video 9 map
	Map<String, Object> map;
	
	
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	//video 10
	Properties properties;
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
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
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	String DiaChi;
	public NhanVien() {
		
	}
	public void getInfo() {
		System.out.println("Thong bao tu nhan vien");
		System.out.println("Hello: " + tenNhanVien + " tuoi " + tuoi);
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
