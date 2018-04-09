package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.GiamDoc;
import entity.NhanVien;

@Controller
public class AddController {

	@RequestMapping("/")	
	@ResponseBody
	public String display() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		NhanVien nv = (NhanVien) context.getBean("nhanvien");
		
		//nv.getInfo();
		nv.setTenNhanVien("Tran Duy Phuong");
		System.out.println("ten nv1: " + nv.getTenNhanVien());
		System.out.println("giam doc nv1: " + nv.getGiamDoc().getChucVu());
//		NhanVien nv2 = (NhanVien) context.getBean("nhanvien");
//		
//		System.out.println("ten nv2: " + nv2.getTenNhanVien());
	
	return "trangchu";
	}
	
}