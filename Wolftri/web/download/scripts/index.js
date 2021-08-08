window.onload=function(){
	getData();
}

var version_actual="";

function getData(){
	$.ajax({
		url:"controllers/versions.php?v=getData",
		method:"post",
		data:{},
		success:function(value){
			if(value=="404"){
				alert("Error en servidor, compuebe conexión internet");
			}else
			if(value=="500"){
				alert("Error en base de datos, intente más tarde");
			}else{
				$("#content_data").html(value);
			}
		}
	})
}