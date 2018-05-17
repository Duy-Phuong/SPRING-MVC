$(document).ready(function(){
	
	
//    $("p").click(function(){
//       // $(this).hide();
//    	 $(this).addClass("red");
//    });
    
     $("#dangnhap").click(function(){
        // alert("click");
    	 var ten = $("#name").val();
    	 var password = $("#pass").val();
    	 //alert(ten + " - - " + password)
        $.ajax({
           url: "/test3/api/kiemtradangnhap",  //http://localhost:8080
           type: "GET", ///ben api controller
           data: { name: ten, pass: password },
           success: function( value ) {
             //alert( "Data Saved: " + value );
        	   if(value == "true"){
        		   //alert("đăng nhập thành công");
        		   $("#ketqua").text("Đăng nhập thành công")
        		   var duongdanHT = window.location.href;
         		  var duongdan = duongdanHT.replace("dangnhap/", "");
         		  window.location =  duongdan;
        	   }else{
        		   //alert("đăng nhập thất bại");
        		   $("#ketqua").text("Đăng nhập thất bại")
        		  // $("#ketqua").text(duongdan)
        		  
        	   }
           }
         })
     });
   
     
   $("#header-top-left").click(function(){
	   	$(this).addClass("active");
	    $(".dangkitk").removeClass("active");
	   $(".dangnhaptk").css("display", "block");
	    $(".dangkitk").css("display", "none");
   });
   
   $("#header-top-right").click(function(){
		$(this).addClass("active");
		 $(".dangnhaptk").removeClass("active");
	    $(".dangnhaptk").css("display", "none");
	    $(".dangkitk").css("display", "block");
  });
   
   //bai 79
   $(".btn-giohang").click(function(){
		var machitiet = $(this).attr("data-machitiet");
		var mamau = $(this).closest("tr").find(".mau").attr("data-mamau");
		var tenmau = $(this).closest("tr").find(".mau").text();
		var masize = $(this).closest("tr").find(".size").attr("data-masize");
		var tensize = $(this).closest("tr").find(".size").text();
		var soluong = $(this).closest("tr").find(".soluong").text();
		var tensp = $("#tensp").text();
		var masp = $("#tensp").attr("data-masp");
		var giatien = $("#giatien").attr("data-value");
		
		//alert("ma mau " + mamau + " ten mau: " + tenmau + " tensize: " + tensize);
		$.ajax({
			url:"/test3/api/ThemGioHang",
		    type:"GET",
		    data:{
		    	masp:masp,    //dat ten ben phai giong nhu ten tt ben gio hang
		    	masize:masize,
		    	mamau:mamau,
		    	tensp: tensp,
		    	giatien:giatien,
		    	tenmau:tenmau,
		    	tensize:tensize,
		    	soluong:soluong,
		    	machitiet:machitiet
		    	
		    },
			success: function(value){
				$("#giohang").find("div").addClass("circle-giohang");
				$("#giohang").find("div").html("<span>" + value + "</span>") ;
			}
		})    
	});
   
//bai 87
	$("body").on("click",".paging-item",function(){
	//alert($(this).text());
		$(".paging-item").removeClass("active");
		$(this).addClass("active");
		var sotrang = $(this).text();
		var spbatdau = (sotrang - 1) * 6;
		
		$.ajax({
			url:"/test3/api/LaySanPhamLimit",
		    type:"GET",
		    data:{
		    	spbatdau:spbatdau,
		    	
		    },
			success: function(value){
				var tbodysanpham = $("#table-sanpham").find("tbody");
				tbodysanpham.empty();
				tbodysanpham.append(value);
			}
		})
	})
	
	//bai 88
	
	$("#checkall").change(function(){
		if(this.checked){
			$("#table-sanpham input").each(function(){
				$(this).attr("checked",true);
			})
		}else{
			$("#table-sanpham input").each(function(){
				$(this).attr("checked",false);
			})
		}
	})
	
	$("#xoa-sanpham").click(function(){
		$("#table-sanpham > tbody input:checked").each(function(){
			var masanpham = $(this).val();
			//alert("xoa: " + masanpham);
			var This = $(this);
			This.closest("tr").remove();
			$.ajax({
				url:"/test3/api/XoaSanPham",
			    type:"GET",
			    data:{
			    	masp:masanpham,
			    	
			    },
				success: function(value){
					This.closest("tr").remove();
				}
			})
		})
	})
	
	var files = [];
	var tenhinh = "";
	$("#hinhanh").change(function(event){
		files = event.target.files;
		tenhinh = files[0].name;
		forms = new FormData(); //nhai cn cua form
		forms.append("file",files[0]);
		
		$.ajax({
			url:"/test3/api/UploadFile",
		    type:"POST", //k gioi han gtri
		    data:forms,
		    contentType:false,
		    processData:false,
		    enctype: "multipart/form-data",
			success: function(value){
				
			}
		})
		
	})
});