package test1;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.DatabaseThoiTrang;
import entity.NhanVien;




@Controller
@RequestMapping("/")
public class AddController {

	@GetMapping()
	public String display(ModelMap model) {
		String a = "phuong";
		model.addAttribute("tendangnhap", a);
		
		//tao list cho c:foreach
		NhanVien nv = new  NhanVien();
		nv.setTenNhanVien("Trần Duy Phương");
		model.addAttribute("nhanvien", nv);
		NhanVien nv1 = new  NhanVien();
		nv1.setTenNhanVien("Trần Duy Phương1");
		model.addAttribute("nhanvien1", nv1);
		List<NhanVien> list = new ArrayList<NhanVien>();
		list.add(nv);
		list.add(nv1);
		model.addAttribute("listnhanvien", list);
		
		//video 39  jdbc
	//	DatabaseThoiTrang d = new DatabaseThoiTrang(); => sai null
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		
		DatabaseThoiTrang d = (DatabaseThoiTrang) context.getBean("databaseThoiTrang");
		d.layDanhSachNhanVien();
		
		return "trangchu";
	}
	
	
	//neu nhap them http://localhost:8080/test3/asdf no se tim den day
	@GetMapping("/{name}")
	public String nhanThamSo(@PathVariable String name, ModelMap model) {
		model.addAttribute("name", name);
		
		

		return "trangchu";
	}
	
	
}
