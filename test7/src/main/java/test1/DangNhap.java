package test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("dangnhap/")
public class DangNhap {

	@GetMapping
	public String Default() {
		
		return "dangnhap";
	}
	
	@PostMapping
	public String XuLysDangNhap(@RequestParam String name, @RequestParam String pass ) {
		if(name.equals("abc") == true && pass.equals("123") == true) {
			return "redirect:/";
			
		}else {
			return "dangnhap";
		}
		
	}
}
