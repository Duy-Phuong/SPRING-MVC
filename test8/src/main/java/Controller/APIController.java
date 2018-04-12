package Controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.NhanVien;
import service.NhanVienService;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.hibernate.Session;

@Controller
@RequestMapping("api/")
public class APIController {
		
	//video 62
	@Autowired
	NhanVienService nhanVienService;
	
		@GetMapping("kiemtradangnhap")
		@ResponseBody
		public String kiemTraDangNhap(@RequestParam String name, @RequestParam String pass) {
			
			//phai dat cai tren vao chu thich neu k 2 ham giong nhau err
			//boolean kt = nhanVienService.kiemTraDangNhap(name, pass);
			
			return "ok run api"; //http://localhost:8080/test3/api/kiemtradangnhap?name=%22a%22&pass=%22b%22 tesst
		}
}
