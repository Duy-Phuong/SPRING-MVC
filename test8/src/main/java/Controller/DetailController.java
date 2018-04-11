package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.NhanVien;

@Controller
@RequestMapping("/chitiet")
public class DetailController {
	@GetMapping
	public String Default() {
		
		return "chitiet";
	}
	
	
	///phai SD cai nay: viet k dau
	@PostMapping
	public String Display(@ModelAttribute NhanVien nv, ModelMap modelmap) {
		modelmap.addAttribute("nv", nv);
		return "chitiet";
	}

	
}
