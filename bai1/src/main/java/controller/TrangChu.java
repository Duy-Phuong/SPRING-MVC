package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.*;

@Controller
public class TrangChu {
	@RequestMapping(path="/", method= RequestMethod.GET)
	public String Default() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		NhanVien nv =  (NhanVien) context.getBean("nhanvien");
		GiamDoc doc = new GiamDoc();
		doc.setChucvu("xep");
		nv.setDoc(doc);
		System.out.println(nv);
		
		NhanVien nv2  =  (NhanVien) context.getBean("nhanvien");
		System.out.println("chuc vu la boss khi sd mau prototype: " + nv2);
		
		//inner bean
		nv.Xuat();
		
		//@autowired
		SinhVien hs =  (SinhVien) context.getBean("sinhvien");
		System.out.println("@autowwired sinh vien truoc constructor, setter, thuoc tinh");
		System.out.println(hs);
		
		SinhVien2 hs2 =  (SinhVien2) context.getBean("sinhvien2");
		System.out.println("@resource");
		System.out.println(hs2);
		
		Robot r = (Robot)context.getBean("robot");
		System.out.println(r);
		
		((ClassPathXmlApplicationContext)context).close(); 	
		return "trangchu";
	}
}
