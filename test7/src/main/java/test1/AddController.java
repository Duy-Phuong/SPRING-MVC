package test1;





import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.*;




@Controller
@RequestMapping("/")
public class AddController {

	//video 40
			@Autowired
			SessionFactory mySessionFactory;
	
	@GetMapping()
	@Transactional			//tự động close
	public String display(ModelMap model) {
//		String a = "phuong";
//		model.addAttribute("tendangnhap", a);
//		
//		//
//		Session session = mySessionFactory.getCurrentSession();
//		String sql ="from nhanvien";
//		List<NhanVien> list = session.createQuery(sql).getResultList();
//		for(NhanVien nc: list) {
//			System.out.println("ten: " + nc.getTenNhanVien() + " - tuoi: " + nc.getTuoi());
//		}
		
		//bai 55 update
//		Session session = mySessionFactory.getCurrentSession();
//		NhanVien nv = (NhanVien) session.createQuery("from nhanvien where id = 4").getSingleResult(); //tra ve 1 doi tuong cu the
//		nv.setTenNhanVien("TenMoi");
//		session.update(nv);
		
//		Session session = mySessionFactory.getCurrentSession();
//		NhanVien nv =  session.get(NhanVien.class, 3); //tra ve 1 doi tuong cu the
//		nv.setTenNhanVien("TenMoi");
//		session.update(nv);
		
// video one to one bai 56
//		Session session = mySessionFactory.getCurrentSession();
//		SanPham s = new SanPham();
//		s.setName("VanHoc");
//		s.setGia(100);
//	
//		
//		NhanVien nv1 =  new NhanVien();
//		nv1.setTenNhanVien("One");
//		nv1.setTuoi(21);
//		
//		s.setNhanvien(nv1);
//		
//		session.save(s);
		
//		// video  one to many bai 56	
//		
//		Session session = mySessionFactory.getCurrentSession();
//		SanPham s = new SanPham();
//		s.setName("sp0");
//		s.setGia(10);
//		
//		SanPham s1 = new SanPham();
//		s1.setName("sp1");
//		s1.setGia(11);
//		
//		SanPham s2 = new SanPham();
//		s2.setName("sp2");
//		s2.setGia(10);
//		
//		
//		Set<SanPham> san = new HashSet<SanPham>();
//		san.add(s);
//		san.add(s1);
//		san.add(s2);
//		
//		
//		NhanVien nv1 =  new NhanVien();
//		nv1.setTenNhanVien("many");
//		nv1.setTuoi(21);
//		nv1.setSanphams(san);
		
		
//		session.save(nv1);
		return "trangchu";
	}
	
	
	//neu nhap them http://localhost:8080/test3/asdf no se tim den day
	@GetMapping("/{name}")
	public String nhanThamSo(@PathVariable String name, ModelMap model) {
		model.addAttribute("name", name);
		
		

		return "trangchu";
	}
	
//them nhan vien bai 54
	
//	@PostMapping
//	@Transactional	
//	public String themNhanVien(@RequestParam String name, @RequestParam int tuoi,ModelMap model) {
//		NhanVien nv = new NhanVien(name, tuoi);
//		Session session = mySessionFactory.getCurrentSession();
//		session.save(nv);
//
//		return "trangchu";
//	}
	
	
//update nhan vien bai 54
	
	@PostMapping
	@Transactional	
	public String themNhanVien(@RequestParam String name, @RequestParam int tuoi,ModelMap model) {
		
		Session session = mySessionFactory.getCurrentSession();
		NhanVien nv = (NhanVien) session.createQuery("from nhanvien where id = 4").getSingleResult(); //tra ve 1 doi tuong cu the
		nv.setTenNhanVien("TenMoi");
		session.update(nv);
		return "trangchu";
	}
	
}
