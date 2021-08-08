window.onload=function(){
	showElementos();
}

var simbolos=["","h","he","li","be","b","c","n","o","f","ne","na","mg","al","si","p","s","cl","ar","k","ca","sc","ti","v","cr","mn",
			"fe","co","ni","cu","zn","ga","ge","as","se","br","kr","rb","sr","y","zr","nb","mo","tc","ru","rh","pd","ag","cd","in",
			"sn","sb","te","i","cs","ba"];

var elementos=[];
for(var a=1; a<=simbolos.length+2; a++){
	elementos.push(["",""]);
}

elementos[1][1]="1";
elementos[1][2]="1.00794";
elementos[1][3]="Hidrógeno";

elementos[2][1]="2";
elementos[2][2]="4.002602"
elementos[2][3]="Helio";

elementos[3][1]="3";
elementos[3][2]="6.941";
elementos[3][3]="Litio";

elementos[4][1]="4";
elementos[4][2]="9.012182";
elementos[4][3]="Berilio";

elementos[5][1]="5";
elementos[5][2]="10.811";
elementos[5][3]="Boro";

elementos[6][1]="6";
elementos[6][2]="12.0107";
elementos[6][3]="Cárbono";

elementos[7][1]="7";
elementos[7][2]="14.0067";
elementos[7][3]="Nitrógeno";

elementos[8][1]="8";
elementos[8][2]="15.9994";
elementos[8][3]="Oxígeno";

elementos[9][1]="9";
elementos[9][2]="18.998403";
elementos[9][3]="Flúor";

elementos[10][1]="10";
elementos[10][2]="20.1797";
elementos[10][3]="Neón";

elementos[11][1]="11";
elementos[11][2]="22.98976";
elementos[11][3]="Sodio";

elementos[12][1]="12";
elementos[12][2]="24.3050";
elementos[12][3]="Magnesio";

elementos[13][1]="13";
elementos[13][2]="26.98153";
elementos[13][3]="Aluminio";

elementos[14][1]="14";
elementos[14][2]="28.0855";
elementos[14][3]="Silicio";

elementos[15][1]="15";
elementos[15][2]="30.97696";
elementos[15][3]="Fósforo";

elementos[16][1]="16";
elementos[16][2]="32.065";
elementos[16][3]="Azufre";

elementos[17][1]="17";
elementos[17][2]="35.453";
elementos[17][3]="Cloro";

elementos[18][1]="18";
elementos[18][2]="39.948";
elementos[18][3]="Argón";

elementos[19][1]="19";
elementos[19][2]="39.0983";
elementos[19][3]="Potasio";

elementos[20][1]="20";
elementos[20][2]="40.078";
elementos[20][3]="Calcio";

elementos[21][1]="21";
elementos[21][2]="44.95591";
elementos[21][3]="Escandio";

elementos[22][1]="22";
elementos[22][2]="47.867";
elementos[22][3]="Titanio";

elementos[23][1]="23";
elementos[23][2]="50.9415";
elementos[23][3]="Vanadio";

elementos[24][1]="24";
elementos[24][2]="51.9962";
elementos[24][3]="Cromo";

elementos[25][1]="25";
elementos[25][2]="54.93804";
elementos[25][3]="Manganeso";

elementos[26][1]="26";
elementos[26][2]="55.854";
elementos[26][3]="Hierro";

elementos[27][1]="27";
elementos[27][2]="58.93319";
elementos[27][3]="Cobalto";

elementos[28][1]="28";
elementos[28][2]="58.6934";
elementos[28][3]="Níquel";

elementos[29][1]="29";
elementos[29][2]="63.546";
elementos[29][3]="Cobre";

elementos[30][1]="30";
elementos[30][2]="65.38";
elementos[30][3]="Zinc";

elementos[31][1]="31";
elementos[31][2]="69.723";
elementos[31][3]="Galio";

elementos[32][1]="32";
elementos[32][2]="69.723";
elementos[32][3]="Germanio";

elementos[33][1]="33";
elementos[33][2]="74.92160";
elementos[33][3]="Arsénico";

elementos[34][1]="34";
elementos[34][2]="78.96";
elementos[34][3]="Selenio";

elementos[35][1]="35";
elementos[35][2]="79.904";
elementos[35][3]="Bromo";

elementos[36][1]="36";
elementos[36][2]="83.798";
elementos[36][3]="Kriptón";

elementos[37][1]="37";
elementos[37][2]="85.4678";
elementos[37][3]="Rubidio";

elementos[38][1]="38";
elementos[38][2]="87.62";
elementos[38][3]="Estroncio";

elementos[39][1]="39";
elementos[39][2]="88.90585";
elementos[39][3]="Itrio";

elementos[40][1]="40";
elementos[40][2]="91.224";
elementos[40][3]="Zirconio";

elementos[41][1]="41";
elementos[41][2]="92.90638";
elementos[41][3]="Niobio";

elementos[42][1]="42";
elementos[42][2]="95.96";
elementos[42][3]="Molibdeno";

elementos[43][1]="43";
elementos[43][2]="98";
elementos[43][3]="Tecnecio";

elementos[44][1]="44";
elementos[44][2]="101.07";
elementos[44][3]="Rutenio";

elementos[45][1]="45";
elementos[45][2]="102.9055";
elementos[45][3]="Rodio";

elementos[46][1]="46";
elementos[46][2]="106.42";
elementos[46][3]="Paladio";

elementos[47][1]="47";
elementos[47][2]="107.8682";
elementos[47][3]="Plata";

elementos[48][1]="48";
elementos[48][2]="112.441";
elementos[48][3]="Cadmio";

elementos[49][1]="49";
elementos[49][2]="114.818";
elementos[49][3]="Indio";

elementos[50][1]="50";
elementos[50][2]="118.710";
elementos[50][3]="Estaño";

elementos[51][1]="51";
elementos[51][2]="121.760";
elementos[51][3]="Antimonio";

elementos[52][1]="52";
elementos[52][2]="127.60";
elementos[52][3]="Telurio";

elementos[53][1]="53";
elementos[53][2]="126.9044";
elementos[53][3]="Yodo";

elementos[45][1]="54";
elementos[45][2]="131.293";
elementos[54][3]="Xeón";

elementos[55][1]="55";
elementos[55][2]="132.9054";
elementos[55][3]="Cesio";

elementos[56][1]="56";
elementos[56][2]="137.327";
elementos[56][3]="Bario";

function showElementos(){
	var final="";
	for(var a=1; a<simbolos.length; a++){
		final+="<li class='elemento' onclick=\"seleElemento('"+a+"')\" title='"+elementos[a][3]+"'>"+
					"<div class='simbolo'>"+simbolos[a].replace(/\b[a-z]/g,c=>c.toUpperCase())+"</div>"+
					"<div class='nombre'>"+elementos[a][3]+"</div>"+
				"</li>";
	}
	showTable(true);
	$("#content_elementos").html(final);
}

function showTable(op){
	if(op==false){
		$("#btn_show_table").html("MOSTRAR TABLA");
		$("#btn_show_table").attr("onclick","showTable(true)");
		$("#content_elementos").css("display","none");
	}else{
		$("#btn_show_table").html("OCULTAR TABLA");
		$("#btn_show_table").attr("onclick","showTable(false)");
		$("#content_elementos").css("display","");
	}
}

var formula_tmp="";
var formula_final="";
var conta_elementos=0;
function seleElemento(op){
	conta_elementos++;
	formula_tmp+="<input class='caja' id='elemento_"+conta_elementos+"' type='text' style='width: 60px; margin: 0px 5px 0px 5px;' value='"+simbolos[op].replace(/\b[a-z]/g,c=>c.toUpperCase())+"' disabled='false'>";
	formula_tmp+="<input class='caja' id='numero_"+conta_elementos+"' type='number' value='1' style='width: 60px; margin: 5px;' placeholder='No.'>";
	$("#content_formula_tmp").html(formula_tmp);
}

function deleteFormula(){
	conta_elementos=0;
	formula_tmp="";
	formula_final="";
	$("#content_formula_tmp").html(formula_tmp);
	$("#content_formula_final").html(formula_final);
}

function confirmarFormula(){
	formula_final="";
	for(var a=1; a<=conta_elementos; a++){
		formula_final+=$("#elemento_"+a).val()+","+$("#numero_"+a).val()+",";
	}
	$("#content_formula_final").html(formula_final.replace(/,/g,""));
}

function calcularMolaridad(){
	confirmarFormula();
	var final="";
	var m=$("#caja_masa").val().replace(/ /g,"");
	var v=$("#caja_volumen").val().replace(/ /g,"");
	var n=$("#caja_moles").val().replace(/ /g,"");
	var cadena_formula=formula_final.split(",");

	if(m!=""){
		final+="m = "+m+"<br>";
	}
	if(v!=""){
		final+="v = "+v+"<br>";
	}
	if(n!=""){
		final+="n = "+n+"<br>";
	}
	final+="<br>";
	if(n==""){
		final+="M = m / (pm)v<br><br>";
		var elemento_anterior="";
		var pm=0;
		for(var a=0; a<cadena_formula.length-1; a++){
			if(isNaN(cadena_formula[a])==true){
				final+=""+cadena_formula[a]+" = "+elementos[getIndiceElemento(cadena_formula[a])][2]+" X ";
				elemento_anterior=cadena_formula[a];
			}else{
				final+=""+cadena_formula[a]+" = "+((elementos[getIndiceElemento(elemento_anterior)][2])*(cadena_formula[a]))+"<br>";
				pm+=Number((elementos[getIndiceElemento(elemento_anterior)][2])*(cadena_formula[a]));
			}
		}
		final+="<br>pm = "+pm+"<br><br>";
		final+="M = "+m+" / ("+pm+")"+v+"<br>";
		final+="M = "+m+" / "+Number(pm*v)+"<br>";
		final+="M = "+(Number(m)/Number(pm*v))+" M<br><br>";
	}else{
		final+="M = n / v<br><br>";
		final+="M = "+n+" / "+v+"<br>";
		final+="M = "+Number(n/v)+" M<br><br>";
	}

	$("#content_resultado").html(final);
}

function getIndiceElemento(value){
	for(var a=1; a<=simbolos.length+2; a++){
		if(simbolos[a]==value.toLowerCase()){
			return a;
		}
	}
}