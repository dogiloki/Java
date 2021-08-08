var elementos=[];

function getId(){
	var caracteres="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".split("");
	var final="";
	for(var a=1; a<=12; a++){
		final+=caracteres[Math.floor(Math.random()*caracteres.length)];
	}
	return final;
}
function add_(event){
	if(event.keyCode==13){
		add("");
	}
}

function add(btn){
	if($("#caja_add_elemento").val().replace(/ /g,"")==""){
		return 0;
	}
	var elemento=$("#caja_add_elemento").val();
	var id="";
	var final="";

	var rep=false;
	do{
		id=getId();
		rep=false;
		for(var a=0; a<elementos.length; a++){
			if(id==elemento[a]){
				rep=true;
			}
		}
	}while(rep==true);

	final="<li class='elemento' id='elemento_"+id+"' title='"+elemento+"'>"+
				"<div class='block'>"+
					"<div class='name' id='texto_"+id+"'>"+elemento+"</div>"+
					"<button class='btn2' style='color: red;' onclick=\"remove(this,'"+id+"')\">Eliminar</button>"+
				"</div>"+
			"</li>";

	elementos.push(id);
	$("#caja_add_elemento").val("");
	$("#content_elementos").html(final+$("#content_elementos").html());
}

function remove(btn,id){
	for(var a=0; a<elementos.length; a++){
		if(id==elementos[a]){
			if(a==0){
				elementos.splice(0,1);
			}else{
				elementos.splice(a,1);
			}
		}
	}
	$("#elemento_"+id).remove();
}

function mostrar(){
	var final="";
	for(var a=0; a<elementos.length; a++){
		final+=elementos[a]+" - ";
	}
	alert(final);
}

var orden_gobal="";
var vista=1;
function ordenar(btn,orden){
	if(orden!=""){
		order_gobal=orden;
	}else{
		vista++;
	}

	var final="";
	var elementos_ordenar=[];
	for(var a=0; a<elementos.length; a++){
		elementos_ordenar.push($("#texto_"+elementos[a]).html());
	}
	$("#vista").css("display","");

	elementos_ordenar.sort(
		function (a,b){
			return a-b;
		}
	);

	switch(vista){
		case 1: $("#vista").html("[ lista ] VISTA");
				if(order_gobal=='asc'){
					for(var a=0; a<elementos_ordenar.length; a++){
						final+=(Number(a)+1)+".- "+elementos_ordenar[a]+"<br>";
					}
				}
				if(order_gobal=='desc'){
					for(var a=elementos_ordenar.length-1; a>=0; a--){
						final+=(Number(a)+1)+".- "+elementos_ordenar[a]+"<br>";
					}
				}
				break;
		case 2: $("#vista").html("[ comas ] VISTA");
				if(order_gobal=='asc'){
					for(var a=0; a<elementos_ordenar.length; a++){
						final+=elementos_ordenar[a]+", ";
					}
				}
				if(order_gobal=='desc'){
					for(var a=elementos_ordenar.length-1; a>=0; a--){
						final+=elementos_ordenar[a]+", ";
					}
				}
				final=final.substr(0,final.length-2);
				break;
		case 3: $("#vista").html("[ guiones ] VISTA");
				if(order_gobal=='asc'){
					for(var a=0; a<elementos_ordenar.length; a++){
						final+=elementos_ordenar[a]+" - ";
					}
				}
				if(order_gobal=='desc'){
					for(var a=elementos_ordenar.length-1; a>=0; a--){
						final+=elementos_ordenar[a]+" - ";
					}
				}
				final=final.substr(0,final.length-3);
				break;
		case 4: vista=0; ordenar(btn,""); return 0; break;
	}

	$("#content_elementos_ordenados").html(final);
}