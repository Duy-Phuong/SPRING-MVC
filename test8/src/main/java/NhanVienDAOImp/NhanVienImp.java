package NhanVienDAOImp;

import entity.NhanVien;

public interface NhanVienImp {
	public boolean kiemTraDangNhap(String name, String pass);
	boolean ThemNhanVien(NhanVien nhanVien);
}
