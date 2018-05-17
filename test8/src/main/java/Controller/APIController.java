package Controller;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import entity.*;

import entity.SanPham;

import entity.GioHang;

import service.*;

@Controller
@RequestMapping("api/")
//@SessionAttributes({"email","giohang"})//bai 79 bo //
@SessionAttributes("email")  //bai 65
public class APIController {
		
	//video 62
	@Autowired
	NhanVienService nhanVienService;
	
	@Autowired
	SanPhamService sanPhamService;
	
		@GetMapping("kiemtradangnhap")
		@ResponseBody
		@Transactional  //phai có cái này ms chạy
		public String kiemTraDangNhap(@RequestParam String name, @RequestParam String pass, ModelMap model) {
			//baai 65
				model.addAttribute("name", name);
				model.addAttribute("pass", pass);
			//end
			//bai 65;
				model.addAttribute("email", name);
			
			//phai dat cai tren vao chu thich neu k 2 ham giong nhau err
			boolean kt = nhanVienService.kiemTraDangNhap(name, pass);

			//return "ok"; //http://localhost:8080/test3/api/kiemtradangnhap?name=%22a%22&pass=%22b%22 tesst
			return ""+kt; //phai tra ve String
		}
		
		private int KiemTraSanPhamDaTonTaiGioHang(List<GioHang> listGioHangs,HttpSession httpSession,int masp,int masize,int mamau){
			for (int i = 0; i < listGioHangs.size(); i++) {
				if(listGioHangs.get(i).getMasp() == masp && listGioHangs.get(i).getMasize() == masize && listGioHangs.get(i).getMamau() == mamau){
					return i;
				}
			}
			return -1;
		}
		
		@GetMapping("ThemGioHang")
		@ResponseBody
		@Transactional  //phai có cái này ms chạy
		public String ThemGioHang(@RequestParam int masp,@RequestParam int masize ,@RequestParam int mamau,@RequestParam String tensp ,@RequestParam String giatien,@RequestParam String tenmau,@RequestParam String tensize ,@RequestParam int soluong, @RequestParam int machitiet,HttpSession httpSession){
			System.out.println("Them gio hang");
			if(httpSession.getAttribute("giohang") == null ){
				List<GioHang> gioHangs = new ArrayList<GioHang>();
				GioHang gioHang = new GioHang();
				gioHang.setMasp(masp);
				gioHang.setMasize(masize);
				gioHang.setMamau(mamau);
				gioHang.setTensp(tensp);
				gioHang.setGiatien(giatien);
				gioHang.setTenmau(tenmau);
				gioHang.setTensize(tensize);
				gioHang.setSoluong(1);
				gioHang.setMachitiet(machitiet);
				
				gioHangs.add(gioHang);
				httpSession.setAttribute("giohang", gioHangs);
				System.out.println("gio hang size: " + gioHangs.size());
				return gioHangs.size() + "";
				
			}else{
				List<GioHang> listGioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
				int vitri = KiemTraSanPhamDaTonTaiGioHang(listGioHangs,httpSession, masp, masize, mamau);
				if(vitri == -1){
					GioHang gioHang = new GioHang();
					gioHang.setMasp(masp);
					gioHang.setMasize(masize);
					gioHang.setMamau(mamau);
					gioHang.setTensp(tensp);
					gioHang.setGiatien(giatien);
					gioHang.setTenmau(tenmau);
					gioHang.setTensize(tensize);
					gioHang.setSoluong(1);
					gioHang.setMachitiet(machitiet);
					
					listGioHangs.add(gioHang);
				}else{
					int soluongmoi = listGioHangs.get(vitri).getSoluong() + 1;
					listGioHangs.get(vitri).setSoluong(soluongmoi);
				}
				
				return listGioHangs.size() + "";
			}
		}
		

		@GetMapping(path="LaySanPhamLimit", produces="text/plain; charset=utf-8")
		@ResponseBody
		@Transactional  //phai có cái này ms chạy
		public String LaySanPhamLimit(@RequestParam int spbatdau){
			
			String html = "";
			
			List<SanPham> listSanPhams = sanPhamService.LayDanhSachSanPhamLimit(spbatdau);
			for (SanPham sanPham : listSanPhams) {
				
				html += "<tr>";
				html += "<td><div class='checkbox'><label><input class='checkboxsanpham' type='checkbox' value='"+sanPham.getMasanpham()+"'></label></div></td>"; //value khi xoa
				html += "<td class='tensp' data-masp='" + sanPham.getMasanpham() +"'>" + sanPham.getTensanpham() +"</td>";
				html += "<td class='giatien' >" +sanPham.getGiatien()  +"</td>";
				html += "<td class='gianhcho'>"+sanPham.getGianhcho() +"</td>";
				html += "<td style='color:white' class='btn btn-warning capnhatsanpham' data-id=" + sanPham.getMasanpham() + ">Sửa</td>";
				html += "</tr>";
				System.out.println(sanPham.getMasanpham());

			}
			
			return html;
			
		}
		
		//bai 88

		@GetMapping("XoaSanPham")
		@ResponseBody
		@Transactional  //phai có cái này ms chạy
		public String XoaSanPhamTheoMaSanPham(@RequestParam int masp){
			System.out.println("ma sp xoa: " + masp);
			sanPhamService.XoaSanPhamTheoMaSanPham(masp);
			return "true";
		}
		
		@Autowired
		ServletContext context; //bien dc tao san trong bean
		
		@PostMapping("UploadFile")
		@ResponseBody
		public String UploadFile(MultipartHttpServletRequest request){
			
			String path_save_file = context.getRealPath("/resources/img/sanpham/"); //luu vao folder
			Iterator<String> listNames = request.getFileNames();
			MultipartFile mpf = request.getFile(listNames.next()); //co 1 file nen k can for
			
			File file_save = new File(path_save_file + mpf.getOriginalFilename());
			try {
				mpf.transferTo(file_save);//chuyen file vao thu muc cua minh
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(file_save);
			return "true";
		}
//		
//		@PostMapping("themsanpham")
//		@ResponseBody
//		public void themsanpham(@RequestParam String dataJson){
//			ObjectMapper objectMapper = new ObjectMapper();
//			
//			JsonNode jsonObject;
//			try {
//				SanPham sanPham = new SanPham();
//				jsonObject = objectMapper.readTree(dataJson);
//				
//				DanhMucSanPham danhMucSanPham = new DanhMucSanPham();
//				danhMucSanPham.setMadanhmuc(jsonObject.get("danhmucsanpham").asInt());
//			
//				
//				JsonNode jsonChitiet = jsonObject.get("chitietsanpham");
//				Set<ChiTietSanPham> listChiTiet = new HashSet<ChiTietSanPham>();
//				for (JsonNode objectChitiet : jsonChitiet) {
//					ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
//					
//					MauSanPham mauSanPham = new MauSanPham();
//					mauSanPham.setMamau(objectChitiet.get("mausanpham").asInt());
//					
//					SizeSanPham sizeSanPham = new SizeSanPham();
//					sizeSanPham.setMasize(objectChitiet.get("sizesanpham").asInt());
//					
//					
//					chiTietSanPham.setMausanpham(mauSanPham);
//					chiTietSanPham.setSizesanpham(sizeSanPham);
//					chiTietSanPham.setSoluong(objectChitiet.get("soluong").asInt());
//					
//					listChiTiet.add(chiTietSanPham);
//					
//				}
//				
//				
//				String tensanpham = jsonObject.get("tensanpham").asText();
//				String giatien = jsonObject.get("giatien").asText();
//				String mota = jsonObject.get("mota").asText();
//				String hinhsanpham = jsonObject.get("hinhsanpham").asText();
//				String gianhcho = jsonObject.get("gianhcho").asText();
//				
//				sanPham.setChitietsanpham(listChiTiet);
//				sanPham.setDanhmucsanpham(danhMucSanPham);
//				sanPham.setTensanpham(tensanpham);
//				sanPham.setGiatien(giatien);
//				sanPham.setMota(mota);
//				sanPham.setHinhsanpham(hinhsanpham);
//				sanPham.setGianhcho(gianhcho);
//				
//				sanPhamService.ThemSanPham(sanPham);
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		}
//		
//		@PostMapping("capnhatsanpham")
//		@ResponseBody
//		public void capnhatsanpham(@RequestParam String dataJson){
//			ObjectMapper objectMapper = new ObjectMapper();
//			
//			JsonNode jsonObject;
//			try {
//				SanPham sanPham = new SanPham();
//				jsonObject = objectMapper.readTree(dataJson);
//				
//				DanhMucSanPham danhMucSanPham = new DanhMucSanPham();
//				danhMucSanPham.setMadanhmuc(jsonObject.get("danhmucsanpham").asInt());
//			
//				
//				JsonNode jsonChitiet = jsonObject.get("chitietsanpham");
//				Set<ChiTietSanPham> listChiTiet = new HashSet<ChiTietSanPham>();
//				for (JsonNode objectChitiet : jsonChitiet) {
//					ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
//					
//					MauSanPham mauSanPham = new MauSanPham();
//					mauSanPham.setMamau(objectChitiet.get("mausanpham").asInt());
//					
//					SizeSanPham sizeSanPham = new SizeSanPham();
//					sizeSanPham.setMasize(objectChitiet.get("sizesanpham").asInt());
//					
//					
//					chiTietSanPham.setMausanpham(mauSanPham);
//					chiTietSanPham.setSizesanpham(sizeSanPham);
//					chiTietSanPham.setSoluong(objectChitiet.get("soluong").asInt());
//					
//					listChiTiet.add(chiTietSanPham);
//					
//				}
//				
//				
//				String tensanpham = jsonObject.get("tensanpham").asText();
//				String giatien = jsonObject.get("giatien").asText();
//				String mota = jsonObject.get("mota").asText();
//				String hinhsanpham = jsonObject.get("hinhsanpham").asText();
//				String gianhcho = jsonObject.get("gianhcho").asText();
//				int masanpham = jsonObject.get("masanpham").asInt();
//				
//				sanPham.setChitietsanpham(listChiTiet);
//				sanPham.setDanhmucsanpham(danhMucSanPham);
//				sanPham.setTensanpham(tensanpham);
//				sanPham.setGiatien(giatien);
//				sanPham.setMota(mota);
//				sanPham.setHinhsanpham(hinhsanpham);
//				sanPham.setGianhcho(gianhcho);
//				sanPham.setMasanpham(masanpham);
//				
//				sanPhamService.CatNhatSanPham(sanPham);
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		}
//		
//		@PostMapping(path="LayDanhSachSanPhamTheoMa", produces="application/json; charset=utf-8")
//		@ResponseBody
//		public JSON_SanPham LayDanhSachSanPhamTheoMa(@RequestParam int masanpham){
//			JSON_SanPham json_SanPham = new JSON_SanPham();
//			
//			SanPham sanPhams = sanPhamService.LayDanhSachChiTietSanPhamTheoMa(masanpham);
//			
//			json_SanPham.setMasanpham(sanPhams.getMasanpham());
//			json_SanPham.setTensanpham(sanPhams.getTensanpham());
//			json_SanPham.setGiatien(sanPhams.getGiatien());
//			json_SanPham.setMota(sanPhams.getMota());
//			json_SanPham.setHinhsanpham(sanPhams.getHinhsanpham());
//			json_SanPham.setGianhcho(sanPhams.getGianhcho());
//			
//			DanhMucSanPham danhMucSanPham = new DanhMucSanPham();
//			danhMucSanPham.setMadanhmuc(sanPhams.getDanhmucsanpham().getMadanhmuc());
//			danhMucSanPham.setTendanhmuc(sanPhams.getDanhmucsanpham().getTendanhmuc());
//			
//			Set<ChiTietSanPham> chiTietSanPhams = new HashSet<ChiTietSanPham>();
//			
//			for (ChiTietSanPham value : sanPhams.getChitietsanpham()) {
//				ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
//				
//				chiTietSanPham.setMachitietsanpham(value.getMachitietsanpham());
//				
//				MauSanPham mausanpham = new MauSanPham();
//				mausanpham.setMamau(value.getMausanpham().getMamau());
//				mausanpham.setTenmau(value.getMausanpham().getTenmau());
//				
//				chiTietSanPham.setMausanpham(mausanpham);
//				
//				SizeSanPham sizesanpham = new SizeSanPham();
//				sizesanpham.setMasize(value.getSizesanpham().getMasize());
//				sizesanpham.setSize(value.getSizesanpham().getSize());
//				
//				chiTietSanPham.setSizesanpham(sizesanpham);
//				chiTietSanPham.setSoluong(value.getSoluong());
//				
//				chiTietSanPhams.add(chiTietSanPham);
//			}
//			
//			json_SanPham.setDanhmucsanpham(danhMucSanPham);
//			json_SanPham.setChitietsanpham(chiTietSanPhams);
//			
//			return json_SanPham;
//		}
			
}
