package entity;

public class GiamDoc extends NhanVien{
	String chucVu;
//	//SD cho inner bean khi g�n cho att
	public GiamDoc() {
		
	}
	public GiamDoc(String tenNhanVien, int tuoi, String diaChi, String chucVu) {
		super(tenNhanVien, tuoi, diaChi);
		this.chucVu = chucVu;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
}
