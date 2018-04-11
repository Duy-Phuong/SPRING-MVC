package test1;





import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import entity.NhanVien;




@Controller
@RequestMapping("/")
public class AddController {

	//video 40
			@Autowired
			SessionFactory mySessionFactory;
	
	@GetMapping()
	@Transactional			//tự động close
	public String display(ModelMap model) {
		String a = "phuong";
		model.addAttribute("tendangnhap", a);
		
		//
		Session session = mySessionFactory.getCurrentSession();
		String sql ="from nhanvien";
		List<NhanVien> list = session.createQuery(sql).getResultList();
		for(NhanVien nc: list) {
			System.out.println("ten: " + nc.getTenNhanVien() + " - tuoi: " + nc.getTuoi());
		}
		return "trangchu";
	}
	
	
	//neu nhap them http://localhost:8080/test3/asdf no se tim den day
	@GetMapping("/{name}")
	public String nhanThamSo(@PathVariable String name, ModelMap model) {
		model.addAttribute("name", name);
		
		

		return "trangchu";
	}
	
	
}
