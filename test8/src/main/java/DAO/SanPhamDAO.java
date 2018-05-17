package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import NhanVienDAOImp.SanPhamImp;
import entity.ChiTietHoaDon;
import entity.ChiTietHoaDonId;
import entity.ChiTietSanPham;
import entity.SanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SanPhamDAO implements SanPhamImp{

	@Autowired
	SessionFactory sessionFactory;
	
	
	//phaibo overide ms chay
	
	@Transactional
	public List<SanPham> LayDanhSachSanPhamLimit(int spbatdau) {
		Session session = sessionFactory.getCurrentSession();
		List<SanPham> listSanPhams = new ArrayList<SanPham>();
		if(spbatdau < 0){
			String query = "from sanpham";
			listSanPhams = (List<SanPham>)  session.createQuery(query).getResultList();
		}else{
			listSanPhams = (List<SanPham>) session.createQuery("from sanpham").setFirstResult(spbatdau).setMaxResults(6).getResultList();
		}
		
		return listSanPhams;
	}

	@Transactional
	public SanPham LayDanhSachChiTietSanPhamTheoMa(int masanpham){
		
		Session session = sessionFactory.getCurrentSession();
		String query = "from sanpham sp where sp.idsanpham="+masanpham;
		SanPham sanPhams = (SanPham) session.createQuery(query).getSingleResult();
		
		//in ra
		System.out.println("ma sp: " + sanPhams.getMasanpham());
		for(ChiTietSanPham c : sanPhams.getChitietsanpham() ) {
			System.out.println("so luong: " + c.getSoluong());
		}
		return sanPhams;
	}


	@Transactional
	public List<SanPham> LayDanhSachSanPhamTheoMaDanhMuc(int madanhmuc) {
		Session session = sessionFactory.getCurrentSession();
		String query = "from sanpham sp where sp.danhmucsanpham.iddanhmuc="+madanhmuc;
		List<SanPham> listSanPhams = (List<SanPham>)  session.createQuery(query).getResultList();
		return listSanPhams;
	}


	@Transactional
	public boolean XoaSanPhamTheoMaSanPham(int idsanpham) {
		Session session = sessionFactory.getCurrentSession();
		SanPham sanPham = session.get(SanPham.class, idsanpham);
		System.out.println("san pham DAO xoa: " + sanPham.getTensanpham());
		Set<ChiTietSanPham> chiTietSanPhams = sanPham.getChitietsanpham();
		for (ChiTietSanPham chiTietSanPham : chiTietSanPhams) {
			System.out.println("idchitietsanpham: " + chiTietSanPham.getMachitietsanpham());
			session.createQuery("delete chitiethoadon WHERE idchitietsanpham="+chiTietSanPham.getMachitietsanpham()).executeUpdate();
			
			
		}
		//session.createQuery("delete chitietkhuyenmai WHERE idsanpham="+idsanpham).executeUpdate();
		session.createQuery("delete chitietsanpham WHERE idsanpham="+idsanpham).executeUpdate();
		session.createQuery("delete sanpham WHERE idsanpham="+idsanpham).executeUpdate();
		
		return false;
	}


	@Transactional
	public boolean ThemSanPham(SanPham sanPham) {
		Session session = sessionFactory.getCurrentSession();
		int id = (Integer) session.save(sanPham);
		
		return false;
	}


	@Transactional
	public boolean CatNhatSanPham(SanPham sanPham) {
		Session session = sessionFactory.getCurrentSession();
		session.update(sanPham);
		
		return false;
	}

}
