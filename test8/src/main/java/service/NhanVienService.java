package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.NhanVienDAO;
import NhanVienDAOImp.NhanVienImp;

@Service
public class NhanVienService implements NhanVienImp{
	
	@Autowired
	NhanVienDAO nhanVienDAO;
	


	public boolean kiemTraDangNhap(String name, String pass) {
		boolean kt = nhanVienDAO.kiemTraDangNhap(name, pass);
		return kt;
	}
}
