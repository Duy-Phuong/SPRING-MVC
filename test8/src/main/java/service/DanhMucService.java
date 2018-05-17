package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.DanhMucDAO;
import NhanVienDAOImp.*;
import entity.DanhMucSanPham;

@Service
public class DanhMucService implements DanhMucImp{

	@Autowired
	DanhMucDAO danhMucDAO;
	

	public List<DanhMucSanPham> LayDanhMuc() {
		return danhMucDAO.LayDanhMuc();
	}

}
