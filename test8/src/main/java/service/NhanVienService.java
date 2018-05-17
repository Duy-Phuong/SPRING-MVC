package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.NhanVienDAO;
import NhanVienDAOImp.NhanVienImp;
import entity.NhanVien;

@Service
public class NhanVienService implements NhanVienImp{
	
	@Autowired
	NhanVienDAO nhanVienDAO;
	


	public boolean kiemTraDangNhap(String name, String pass) {
		boolean kt = nhanVienDAO.kiemTraDangNhap(name, pass);
		return kt;
	}



	public boolean ThemNhanVien(NhanVien nhanVien) {
		boolean kt = nhanVienDAO.ThemNhanVien(nhanVien);
		return kt;
	}
}
