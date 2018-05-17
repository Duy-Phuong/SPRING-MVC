package test1;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
	public String Display(@Valid NhanVien nv, ModelMap modelmap, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("- Form doesn't validate!");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error: errors) {
				System.out.println(error.getDefaultMessage());
			}
		}
		else {
			System.out.println("- Form validate!");
			modelmap.addAttribute("nv", nv);

		}
		return "chitiet";
	}

	
}
