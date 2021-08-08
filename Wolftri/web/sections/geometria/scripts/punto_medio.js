function calcular(btn){
	var final="";
	var x1=$("#x1").val().replace(/  /g,"");
	var x2=$("#x2").val().replace(/  /g,"");
	var y1=$("#y1").val().replace(/  /g,"");
	var y2=$("#y2").val().replace(/  /g,"");

	final+="( X1 + X2 / 2 ) , ( X2 + Y2 / 2 )<br><br>"+
			"( "+x1+" + "+x2+" / 2 ) , ( "+y1+" + "+y2+" / 2 )<br><br>"+
			"( "+(Number(x1)+Number(x2))+" / 2 ) , ( "+(Number(y1)+Number(y2))+" / 2 )<br><br>"+
			"Punto Medio: ( "+((Number(x1)+Number(x2))/2)+" , "+((Number(y1)+Number(y2))/2)+" )";

	$("#content_result").html(final);
}