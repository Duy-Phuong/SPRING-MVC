package test1;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import entity.NhanVien;


@Controller
public class AddController {

//	@RequestMapping("/")	
//	public String display() {
//
//	
//	return "trangchu";
//	}
	
//	@RequestMapping("/")	
//	public ModelAndView display() {
//		ModelAndView viewTrangChu = new ModelAndView(); 
//		viewTrangChu.setViewName("trangchu");
//		
//		String username = "gv";
//		String pass = "123";
//		
//		viewTrangChu.addObject("tendangnhap", username);
//		viewTrangChu.addObject("matkhau", pass);
//	return viewTrangChu;
//	}
	
	
	@RequestMapping("/")	
	public String display(ModelMap modelMap) {
		
		String username = "gv";
		String pass = "123";
		
		modelMap.addAttribute("tendangnhap", username);
		modelMap.addAttribute("matkhau", pass);
		
		NhanVien nv = new  NhanVien();
		nv.setTenNhanVien("Trần Duy Phương");
		modelMap.addAttribute("nhanvien", nv);
		NhanVien nv1 = new  NhanVien();
		nv1.setTenNhanVien("Trần Duy Phương1");
		modelMap.addAttribute("nhanvien1", nv1);
		
		List<NhanVien> list = new ArrayList<NhanVien>();
		list.add(nv);
		list.add(nv1);
		modelMap.addAttribute("listnhanvien", list);
	return "trangchu";
	}
}
