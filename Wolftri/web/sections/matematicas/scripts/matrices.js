var variables=[];
var operacion="";
var sele_operador="";

function addMatriz(btn){
	if($("#f").val().replace(/ /g,"")=="" || $("#c").val().replace(/ /g,"")=="" || $("#v").val().replace(/ /g,"")==""){
		return 0;
	}
	var filas=$("#f").val().replace(/ /g,"");
	var columnas=$("#c").val().replace(/ /g,"");
	var variable=$("#v").val().replace(/ /g,"");
	if(variable=="x" || variable=="X" || variable=="|" || variable=="," || variable=="-" || variable=="+" || variable=="*" || variable=="resultado_"){
		return 0;
	}
	var matriz="";
	for(var a=0; a<variables.length; a++){
		if(variable==variables[a]){
			return 0;
		}
	}
	matriz="<fieldset id='matriz_"+variable+"'>"+
				"<legend>"+variable+") "+
					"<input type='text' class='caja' id='filas_"+variable+"' disabled='true' style='width: 30px; text-align: center;' value='"+filas+"'>"+" X "+
					"<input type='text' class='caja' id='columnas_"+variable+"' disabled='true' style='width: 30px; text-align: center;' value='"+columnas+"'>"+
				"</legend>"+
				"<table border='1'>";
	for(var f=1; f<=filas; f++){
		matriz+="<tr>";
		for(var c=1; c<=columnas; c++){
			matriz+="<td>";
				matriz+="<input type='number' class='caja' style='width: 60px' id='"+variable+"f"+f+"c"+c+"'>";
			matriz+="</td>";
		}
		matriz+="</tr>";
	}
	matriz+="</table>"+
			"<button class='btn2' onclick=\"deleteMatriz(this,'"+variable+"')\" style='color: red;'>Eliminar</button>"+
			"</fieldset>";
	$("#content_matrices").html($("#content_matrices").html()+matriz);
	variables.push(variable);
	$("#f").val("");
	$("#c").val("");
	$("#v").val("");
	showVariables();
	showOperadores("");
	deleteOperacion();
}

function deleteMatriz(btn,variable){
	for(var a=0; a<variables.length; a++){
		if(variable==variables[a]){
			if(a==0){
				variables.splice(0,1);
			}else{
				variables.splice(a,1);
			}
		}
	}
	$("#matriz_"+variable).remove();
	showVariables();
	showOperadores("");
	deleteOperacion();
}

function showVariables(){
	$("#content_resultado").html("");
	var content="Variables: ";
	for(var a=0; a<variables.length; a++){
		content+="<button class='btn' id='variable_"+variables[a]+"' style='background: #ffffff; color: #353535; margin-right: 5px; display: inline-flex;' onclick=\"seleVariable('"+variables[a]+"')\">"+variables[a]+"</button>";
	}
	$("#content_variables").html(content);
}

function showOperadores(operador){
	$("#content_resultado").html("");
	if(operador==""){
		$("#content_operadores").html("Operadores: "+
			"<button class='btn' style='width: 30px; background: #ffffff; color: #353535; margin-right: 5px; display: inline-flex;' onclick=\"seleOperador('x')\">x</button>"+
			"<button class='btn' style='width: 30px; background: #ffffff; color: #353535; margin-right: 5px; display: inline-flex;' onclick=\"seleOperador('+')\">+</button>"+
			"<button class='btn' style='width: 30px; background: #ffffff; color: #353535; margin-right: 5px; display: inline-flex;' onclick=\"seleOperador('-')\">-</button>"
		);
		sele_operador="";
	}else{
		$("#content_operadores").html("Operadores: "+
			"<button class='btn' style='width: 30px; background: #ffffff; color: #353535; margin-right: 5px; display: inline-flex;' onclick=\"seleOperador('"+operador+"')\">"+operador+"</button>"
		);
		sele_operador=operador;
	}
}

function seleVariable(variable){
	if(operacion=="" ||
			operacion.substr(operacion.length-3,operacion.length)==" x " ||
			operacion.substr(operacion.length-3,operacion.length)==" + " ||
			operacion.substr(operacion.length-3,operacion.length)==" - "){
		operacion+=" "+variable+" ";
		showOperacion();
	}
}

function seleOperador(operador){
	if(operacion==""){
		return 0;
	}else{
		showOperadores(operador);
	}
	if(operacion.substr(operacion.length-3,operacion.length)==" x " ||
			operacion.substr(operacion.length-3,operacion.length)==" + " ||
			operacion.substr(operacion.length-3,operacion.length)==" - "){
		operacion=operacion.substr(0,operacion.length-3);
	}else{
		operacion+=" "+operador+" ";
	}
	showOperacion();
}

function deleteOperacion(){
	operacion="";
	showOperadores("");
	$("#content_operacion").html("Operación:");
}

function showOperacion(){
	$("#content_resultado").html("");
	$("#content_operacion").html("Operación:"+operacion);
}

function calcular(){
	$("#content_resultado").html("CARGANDO...");
	if(operacion=="" || sele_operador=="" ||
			operacion.substr(operacion.length-3,operacion.length)==" x " ||
			operacion.substr(operacion.length-3,operacion.length)==" + " ||
			operacion.substr(operacion.length-3,operacion.length)==" - "){
		$("#content_resultado").html("DATOS NO VALIDOS");
		return 0;
	}
	operacion=operacion.replace(/ /g,"");
	var cadena_operacion=operacion.split(sele_operador);
	var resultado_mostrar="";
	var resultado_final="";

	var filas_operacion=$("#filas_"+cadena_operacion[0]).val();
	var columnas_operacion=$("#columnas_"+cadena_operacion[1]).val();

	//Hace la operación multiplicación
	if(sele_operador=="x"){
		if(cadena_operacion.length>2 || $("#columnas_"+cadena_operacion[0]).val()!=$("#filas_"+cadena_operacion[1]).val()){
			deleteOperacion();
			$("#content_resultado").html("NO HAY SOLUCCIÓN");
			return 0;
		}else{
			for(var f=1; f<=filas_operacion; f++){
				for(var c=1; c<=columnas_operacion; c++){
					resultado_mostrar+="[ "+f+" ] [ "+c+" ] = ";
					var suma_tmp=0;
					for(var o=1; o<=$("#columnas_"+cadena_operacion[0]).val(); o++){
						suma_tmp+=(Number($("#"+cadena_operacion[0]+"f"+f+"c"+o).val())*Number($("#"+cadena_operacion[1]+"f"+o+"c"+c).val()));
						resultado_mostrar+="("+(Number($("#"+cadena_operacion[0]+"f"+f+"c"+o).val())*Number($("#"+cadena_operacion[1]+"f"+o+"c"+c).val()))+") + ";
					}
					resultado_mostrar=resultado_mostrar.substr(0,resultado_mostrar.length-2);
					resultado_mostrar+="= "+suma_tmp+"<br><br>";
					resultado_final+=suma_tmp+",";
				}
			}
		}
	}

	//Hace la operación de suma
	if(sele_operador=="+"){
		for(var a=0; a<cadena_operacion.length; a++){
			if($("#filas_"+cadena_operacion[0]).val()!=$("#filas_"+cadena_operacion[a]).val() || $("#columnas_"+cadena_operacion[0]).val()!=$("#columnas_"+cadena_operacion[a]).val()){
				$("#content_resultado").html("DATOS NO VALIDOS");
				return 0;
			}
		}
		for(var f=1; f<=filas_operacion; f++){
			for(var c=1; c<=columnas_operacion; c++){
				resultado_mostrar+=" [ "+f+" ] [ "+c+" ] = ";
				var suma_tmp=0;
				for(var o=0; o<cadena_operacion.length; o++){
					suma_tmp+=Number($("#"+cadena_operacion[o]+"f"+f+"c"+c).val());
					resultado_mostrar+="("+$("#"+cadena_operacion[o]+"f"+f+"c"+c).val()+") + ";
				}
				resultado_mostrar=resultado_mostrar.substr(0,resultado_mostrar.length-2);
				resultado_mostrar+="= "+suma_tmp+"<br><br>";
				resultado_final+=suma_tmp+",";
			}
		}
	}

	//Hace la operación de resta
	if(sele_operador=="-"){
		for(var a=0; a<cadena_operacion.length; a++){
			if($("#filas_"+cadena_operacion[0]).val()!=$("#filas_"+cadena_operacion[a]).val() || $("#columnas_"+cadena_operacion[0]).val()!=$("#columnas_"+cadena_operacion[a]).val()){
				$("#content_resultado").html("DATOS NO VALIDOS");
				return 0;
			}
		}
		for(var f=1; f<=filas_operacion; f++){
			for(var c=1; c<=columnas_operacion; c++){
				resultado_mostrar+=" [ "+f+" ] [ "+c+" ] = ";
				var resta_tmp=0;
				for(var o=0; o<cadena_operacion.length; o++){
					if(o==0){
						resta_tmp=Number($("#"+cadena_operacion[o]+"f"+f+"c"+c).val());
					}else{
						resta_tmp-=Number($("#"+cadena_operacion[o]+"f"+f+"c"+c).val());
					}
					resultado_mostrar+="("+$("#"+cadena_operacion[o]+"f"+f+"c"+c).val()+") - ";
				}
				resultado_mostrar=resultado_mostrar.substr(0,resultado_mostrar.length-2);
				resultado_mostrar+="= "+resta_tmp+"<br><br>";
				resultado_final+=resta_tmp+",";
			}
		}
	}

	//Muestra el resultado
	$("#content_resultado").html(resultado_mostrar);
	llenarResultado(filas_operacion,columnas_operacion,resultado_final);
}

function llenarResultado(filas_operacion,columnas_operacion,resultado_final){
	var cadena_resultado=resultado_final.split(",");
	var resultado_mostrar="";
	var conta=0;
	resultado_mostrar+="<fieldset>"+
							"<legend>RESULTADO) "+
								"<input type='text' class='caja' disabled='true' style='width: 30px; text-align: center;' value='"+filas_operacion+"'>"+" X "+
								"<input type='text' class='caja' disabled='true' style='width: 30px; text-align: center;' value='"+columnas_operacion+"'>"+
							"</legend>"+
						"<table border='1'>";
	for(var f=1; f<=filas_operacion; f++){
		resultado_mostrar+="<tr>";
		for(var c=1; c<=columnas_operacion; c++){
			resultado_mostrar+="<td>";
				resultado_mostrar+="<input type='number' class='caja' disabled='true' style='width: 60px' value='"+cadena_resultado[conta]+"'>";
				conta++;
			resultado_mostrar+="</td>";
		}
		resultado_mostrar+="</tr>";
	}
	resultado_mostrar+="</table></fieldset>";
	$("#content_resultado").html($("#content_resultado").html()+resultado_mostrar);
}