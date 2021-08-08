function calcular(btn){
	var final="";
	var x1=$("#x1").val().replace(/  /g,"");
	var x2=$("#x2").val().replace(/  /g,"");
	var y1=$("#y1").val().replace(/  /g,"");
	var y2=$("#y2").val().replace(/  /g,"");

	final+="√ [ ( X2 - X1 )^2 + ( Y2 - Y1 )^2  ]<br><br>"+
			"√ [  ( "+x2+" - "+x1+" )^2 + ( "+y2+" - "+y1+" )^2 ]<br><br>"+
			"√ [ ( "+(Number(x2)-Number(x1))+" )^2 + ( "+(Number(y2)-Number(y1))+" )^2 ]<br><br>"+
			"√ [ ( "+Math.pow(Number(x2)-Number(x1),2)+" ) + ( "+Math.pow(Number(y2)-Number(y1),2)+" ) ]<br><br>"+
			"√ [ "+(Math.pow(Number(x2)-Number(x1),2)+Math.pow(Number(y2)-Number(y1),2))+" ]<br><br>"+
			"Distancia: "+Math.sqrt(Math.pow(Number(x2)-Number(x1),2))+(Math.pow(Number(y2)-Number(y1),2))+"<br><br>";

	$("#content_result").html(final);
}