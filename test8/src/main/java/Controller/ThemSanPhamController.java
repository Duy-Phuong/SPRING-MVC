package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.*;
import service.*;

@Controller
@RequestMapping("/themsanpham")
public class ThemSanPhamController {

	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucService danhMucService;
	
//	@Autowired
//	MauSanPhamService mauSanPhamService;
//	
//	@Autowired
//	SizeSanPhamService sizeSanPhamService;
	
	@GetMapping
	public String Default(ModelMap modelMap){
		List<SanPham> listSanPhams =  sanPhamService.LayDanhSachSanPhamLimit(0);
		List<SanPham> allSanPham = sanPhamService.LayDanhSachSanPhamLimit(-1); //laays all sp
		List<DanhMucSanPham> danhMucSanPhams = danhMucService.LayDanhMuc();
//		List<MauSanPham> listMauSanPham = mauSanPhamService.LayDanhSachMau();
//		List<SizeSanPham> listSizeSanPham = sizeSanPhamService.LayDanhSachSize();
		
		double tongsopage = Math.ceil((double) allSanPham.size() / 6);
		System.out.println("so sp: " + allSanPham.size());
		System.out.println("tongsopage: " + tongsopage);

		modelMap.addAttribute("listSanPham", listSanPhams);
		modelMap.addAttribute("allSanPham", allSanPham);
		modelMap.addAttribute("tongsopage", tongsopage);
		modelMap.addAttribute("danhmuc",danhMucSanPhams);
//		modelMap.addAttribute("listsize",listSizeSanPham);
//		modelMap.addAttribute("listmau",listMauSanPham);
		
		return "themsanpham";
	}
}
