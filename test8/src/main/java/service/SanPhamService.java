package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.SanPhamDAO;
import NhanVienDAOImp.*;
import entity.SanPham;

@Service
public class SanPhamService implements SanPhamImp{

	@Autowired
	SanPhamDAO sanPhamDAO;
	

	public List<SanPham> LayDanhSachSanPhamLimit(int spbatdau) {
		
		return sanPhamDAO.LayDanhSachSanPhamLimit(spbatdau);
	}


	public SanPham LayDanhSachChiTietSanPhamTheoMa(int idsanpham) {
		return sanPhamDAO.LayDanhSachChiTietSanPhamTheoMa(idsanpham);
		
	}

	public List<SanPham> LayDanhSachSanPhamTheoMaDanhMuc(int iddanhmuc) {
		return sanPhamDAO.LayDanhSachSanPhamTheoMaDanhMuc(iddanhmuc);
	}


	public boolean XoaSanPhamTheoMaSanPham(int idsanpham) {
		
		return sanPhamDAO.XoaSanPhamTheoMaSanPham(idsanpham);
	}


	public boolean ThemSanPham(SanPham sanPham) {
		// TODO Auto-generated method stub
		return sanPhamDAO.ThemSanPham(sanPham);
	}


	public boolean CatNhatSanPham(SanPham sanPham) {
		// TODO Auto-generated method stub
		return sanPhamDAO.CatNhatSanPham(sanPham);
	}

}
