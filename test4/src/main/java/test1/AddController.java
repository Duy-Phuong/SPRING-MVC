package test1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class AddController {


	
	
	@RequestMapping(path="/", method=RequestMethod.GET)	
	public ModelAndView display(ModelMap modelMap) {
		ModelAndView view = new ModelAndView();
		view.setViewName("trangchu");

	return view;
	}
	
//	@RequestMapping("/chitiet")	
//	public String display2(@RequestParam("id") int id, @RequestParam("name") String name, ModelMap modelMap) {
//		modelMap.addAttribute("id", id);
//		modelMap.addAttribute("name", name);
//	return "chitiet";
//	}
	
//	//bai 20
//	@RequestMapping("/chitiet/{id}/{name}")	
//	public String display2(@PathVariable("id") int id, @PathVariable("name") String name, ModelMap modelMap) {
//		modelMap.addAttribute("id", id);
//		modelMap.addAttribute("name", name);
//	return "chitiet";
//	}

	
	//bai 21 http://localhost:8080/test3/chitiet/123;name=aa
	@RequestMapping("/chitiet/{id}")	
	public String display2(@PathVariable int id,@MatrixVariable String name, ModelMap modelMap) {
		modelMap.addAttribute("id", id);
		modelMap.addAttribute("name", name);
	return "chitiet";
	}
	
	//bai 22 http://localhost:8080/test3/chitiet/123;name=aa
		@RequestMapping(path="/chitiet", method=RequestMethod.POST)	
		public String display3(@RequestParam String name, ModelMap modelMap) {
			
			modelMap.addAttribute("name", name);
		return "chitiet";
		}
}
