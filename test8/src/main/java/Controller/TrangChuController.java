package Controller;





import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import entity.SanPham;

import service.SanPhamService;

import entity.*;




@Controller
@RequestMapping("/") //@SessionAttributes("name")  //bai 65
@SessionAttributes("email")  //bai 65
public class TrangChuController {

	//video 40
			@Autowired
			SessionFactory mySessionFactory;
			
	//bai 69
			@Autowired
			SanPhamService sanPhamService;
	
	@GetMapping()
	@Transactional			//tự động close
	public String display(  ModelMap model) { //bai 67 mmoi them 2 cai dau 

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
		
		
		//bai 67 chỉnh sửa chỗ đang nhập  @SessionAttribute("name") String temp, HttpSession httpSession,
//		if(httpSession.getAttribute("name") != null) {
//			System.out.println(httpSession.getAttribute("name")); //xuat ra null thay vi loi
//			String s = (String) httpSession.getAttribute("name");
//			model.addAttribute("chucaidau", s);
//		}
		
		
		//bai 69
		List<SanPham> listSanPhams = sanPhamService.LayDanhSachSanPhamLimit(0);
		for (SanPham sp :  listSanPhams) {
			System.out.println(sp.getTensanpham());
		}
		model.addAttribute("listSanPham", listSanPhams);
		//modelMap.addAttribute("danhmuc",danhMucSanPhams);

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
		
//		Session session = mySessionFactory.getCurrentSession();
//		NhanVien nv = (NhanVien) session.createQuery("from nhanvien where id = 4").getSingleResult(); //tra ve 1 doi tuong cu the
//		nv.setTenNhanVien("TenMoi");
//		session.update(nv);
		return "trangchu";
	}
	
}
