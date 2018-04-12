package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import NhanVienDAOImp.NhanVienImp;
import entity.NhanVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NhanVienDAO implements NhanVienImp{
	
	//video 40
	@Autowired
	SessionFactory mySessionFactory;
	
	public boolean kiemTraDangNhap(String name, String pass) {
		Session session = mySessionFactory.getCurrentSession();
		//trả về gtri đơn
		try {
			NhanVien nv = (NhanVien)session.createQuery("from nhanvien where tendangnhap = '" + name + "' and " + "matkhau = '" + pass + "'").getSingleResult();
			
			if(nv != null) {
			
			
			}
		}catch(Exception e){
			///tranh bi loi khi dang nhap
			
			return false;
		}
		return true;
	}
}
