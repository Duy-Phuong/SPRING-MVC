package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.Resource;
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
		
		//link https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#resources
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		NhanVien nv = (NhanVien) context.getBean("nhanvien");
		
		//nv.getInfo();
		nv.setTenNhanVien("Tran Duy Phuong");
		System.out.println("ten nv1: " + nv.getTenNhanVien());
		System.out.println("giam doc nv1: " + nv.getGiamDoc().getChucVu());
//		NhanVien nv2 = (NhanVien) context.getBean("nhanvien");
//		
//		System.out.println("ten nv2: " + nv2.getTenNhanVien());
		
		
		//phan resource
//		CustomLoader cus = new CustomLoader();
//		cus.setResourceLoader(context);
		//c2
		CustomLoader cus =(CustomLoader) context.getBean("cus");
		
		Resource resource = cus.getResource("classpath:data.txt");
		
		//Resource resource = context.getResource("classpath:data.txt");
		//neu bo data ra o ngoai thi thay la file://data.txt
		InputStream inputstream;
		try {
			inputstream =  resource.getInputStream();
			InputStreamReader reader = new InputStreamReader(inputstream);
			BufferedReader buf = new BufferedReader(reader);
			String line = "";
			StringBuffer st = new StringBuffer();
			while((line = buf.readLine())!=null) {
				st.append(line).append("\n");
			}
			System.out.println("Noi dung trong file là: " + st);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	return "trangchu";
	}
	
}
