package Controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.NhanVien;
import service.NhanVienService;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.hibernate.Session;
@Controller
@RequestMapping("dangnhap/")
public class DangNhap {

	@GetMapping
	public String Default() {
		
		return "dangnhap";
	}
	
//	//video 40
//	@Autowired
//	SessionFactory mySessionFactory;
	
	//video 62 ; //bai 64 dong
//		@Autowired
//		NhanVienService nhanVienService;
	
	//gia tri truyen vao voi phuong thuc post
//	@PostMapping
//	@Transactional
//	public String XuLysDangNhap(@RequestParam String name, @RequestParam String pass ) {
////		if(name.equals("abc") == true && pass.equals("123") == true) {
////			return "redirect:/";
////			
////		}else {
////			return "dangnhap";
////		}
//		
//		Session session = mySessionFactory.getCurrentSession();
//		//trả v�? gtri đơn
//		try {
//			NhanVien nv = (NhanVien)session.createQuery("from nhanvien where tendangnhap = '" + name + "' and " + "matkhau = '" + pass + "'").getSingleResult();
//			
//			if(nv != null) {
//			//System.out.println("ten nv: " + nv.getHoten());
//				System.out.println("dang nhap thanh cong");
//			}
//		}catch(Exception e){
//			///tranh bi loi khi dang nhap
//			System.out.println("dang nhap that bai");
//		}
//		
//		return "dangnhap";
//	}
	
	//bai 64 dong
//	@PostMapping
//	@Transactional
//	public String XuLyService(@RequestParam String name, @RequestParam String pass, ModelMap model) {
//		
//		//phai dat cai tren vao chu thich neu k 2 ham giong nhau err
//		boolean kt = nhanVienService.kiemTraDangNhap(name, pass);
//		if(kt == true) {
//			System.out.println("dang nhap thanh cong");
//			model.addAttribute("msg", "dang nhap thanh cong");
//		}else {
//			System.out.println("dang nhap that bai");
//			model.addAttribute("msg", "dang nhap that bai");
//		}
//		return "dangnhap";
//	}
}
