package entity;



public class NhanVien {
	String tenNhanVien;
	
	public NhanVien(String tenNhanVien, int tuoi, String diaChi) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
		DiaChi = diaChi;
		
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
