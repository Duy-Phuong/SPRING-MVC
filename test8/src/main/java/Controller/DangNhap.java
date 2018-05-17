package Controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import entity.NhanVien;
import service.NhanVienService;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;

@Controller
@RequestMapping("dangnhap/")
@SessionAttributes("email")  //bai 65
public class DangNhap {

	@GetMapping
	public String Default( HttpSession httpSession, ModelMap model) {
		//@SessionAttribute("name") String temp thêm tham số  
		if(httpSession.getAttribute("name") != null) {  
			System.out.println(httpSession.getAttribute("name")); //xuat ra null thay vi loi
			model.addAttribute("name", httpSession.getAttribute("name"));
		}
//		//System.out.println(temp); //cách 2 neu null se loi
		return "dangnhap";
	}
	
//	//video 40
//	@Autowired
//	SessionFactory mySessionFactory;
	
	//video 62 ; //bai 64 dong
		@Autowired
		NhanVienService nhanVienService;
	
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
	
	
	//bai 68
	@PostMapping
	@Transactional
	public String XuLyDangKi(@RequestParam String name1, @RequestParam String pass1, @RequestParam String pass2, ModelMap model) {
		System.out.println(name1);
		boolean ktmail = validate(name1); // name1 ở đây là tên email
		if(ktmail){
			if(pass1.equals(pass2)){
				NhanVien nhanVien = new NhanVien();
				nhanVien.setEmail(name1);
				nhanVien.setTendangnhap(name1);
				nhanVien.setMatkhau(pass1);
				
				boolean ktThem = nhanVienService.ThemNhanVien(nhanVien);
				if(ktThem){
					model.addAttribute("kiemtradangnhap", "Tạo tài khoản thành công  "); 
				}else{
					model.addAttribute("kiemtradangnhap", "Tạo tài khoản thất bại "); 
				}
			}else{
				model.addAttribute("kiemtradangnhap", "Mật khẩu không trừng khớp "); 
			}
		}else{
			model.addAttribute("kiemtradangnhap", "Vui lòng nhập chính email "); 
		}
		return "dangnhap";
	}
	

	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
		 Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		 return matcher.find();
	}
}
