package Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import service.DanhMucService;
import service.SanPhamService;

import entity.DanhMucSanPham;

import entity.SanPham;

import entity.NhanVien;

@Controller
@RequestMapping("/chitiet")
public class DetailController {
	
	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucService danhMucService;
	//bai 72 truyen tham so dang path var..
	@GetMapping("/{masanpham}")
	public String Default(@PathVariable int masanpham ,ModelMap modelMap,HttpSession httpSession){
		SanPham sanpham = sanPhamService.LayDanhSachChiTietSanPhamTheoMa(masanpham);
		
		System.out.println("ma san pham: " + masanpham);
		List<DanhMucSanPham> danhMucSanPhams = danhMucService.LayDanhMuc();
		
//		if(null != httpSession.getAttribute("giohang")){
//			List<GioHang> gioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
//			modelMap.addAttribute("soluongsanphamgiohang",gioHangs.size());
//		}
		
		
		modelMap.addAttribute("sanpham", sanpham);
	modelMap.addAttribute("danhmuc",danhMucSanPhams);
		
		
		
		return "chitiet";
	}
	
	
	///phai SD cai nay: viet k dau
//	@PostMapping
//	public String Display(@ModelAttribute NhanVien nv, ModelMap modelmap) {
//		modelmap.addAttribute("nv", nv);
//		return "chitiet";
//	}

	
}
