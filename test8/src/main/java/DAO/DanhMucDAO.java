package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import NhanVienDAOImp.*;
import entity.DanhMucSanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DanhMucDAO implements DanhMucImp{

	@Autowired
	SessionFactory sessionFactory;
	

	@Transactional
	public List<DanhMucSanPham> LayDanhMuc() {
		Session session = sessionFactory.getCurrentSession();
		String query = "from danhmucsanpham";
		List<DanhMucSanPham> danhMucSanPhams =  session.createQuery(query).getResultList();
		System.out.println(danhMucSanPhams.size());
		return danhMucSanPhams;
	}

}
