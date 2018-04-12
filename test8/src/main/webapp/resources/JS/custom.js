$(document).ready(function(){
	
	
//    $("p").click(function(){
//       // $(this).hide();
//    	 $(this).addClass("red");
//    });
    
     $("#dangnhap").click(function(){
        // alert("click");

        $.ajax({
           url: "http://localhost:8080/test3/api/kiemtradangnhap",
           type: "GET", ///ben api controller
           data: { name: "John", pass: "123" },
           success: function( value ) {
             alert( "Data Saved: " + value );
           }
         })
     });
   
});