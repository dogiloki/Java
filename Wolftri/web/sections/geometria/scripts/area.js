window.onload=function(){
	seleccionarFormula();
	seleccionarFigura();
}

var figura="";
var formula="";

function seleccionarFigura(){
	figura=$("#caja_figuras").val();
	var result="";

	if(figura=='triangulo'){
		result+="<div style='width: 0px; height 0px; margin: 10px; border-right: 100px solid transparent; border-right: 100px solid transparent; border-left: 100px solid transparent; border-bottom: 100px solid #17b948;'></div><br>";
		if(formula=='area'){
			result+="<div>"+
						"Base: <input type='number' class='caja' placeholder='CM' id='base'><br><br>"+
						"Altura: <input type='number' class='caja' placeholder='CM' id='altura'>"+
					"</div>";
		}
		if(formula=='perimetro'){
			result+="<div>"+
						"Lado 1: <input type='number' class='caja' placeholder='CM' id='lado1'><br><br>"+
						"Lado 2: <input type='number' class='caja' placeholder='CM' id='lado2'><br><br>"+
						"Lado 3: <input type='number' class='caja' placeholder='CM' id='lado3'>"+
					"</div>";
		}
	}

	if(figura=='cuadrado'){
		result+="<div style='width: 100px; height: 100px; margin: 10px; background: #17b948;'></div><br>";
		if(formula=='area' || formula=='perimetro' || formula=='volumen'){
			result+="<div>"+
						"Lado: <input type='number' class='caja' placeholder='CM' id='lado'>"+
					"</div>";
		}
	}

	if(figura=='rectangulo'){
		result+="<div style='width: 200px; height: 100px; margin: 10px; background: #17b948;'></div><br>";
		if(formula=='area'){
			result+="<div>"+
						"Base: <input type='number' class='caja' placeholder='CM' id='base'><br><br>"+
						"Altura: <input type='number' class='caja' placeholder='CM' id='altura'>"+
					"</div>";
		}
		if(formula=='perimetro'){
			result+="<div>"+
						"Lado 1: <input type='number' class='caja' placeholder='CM' id='lado1'><br><br>"+
						"Lado 2: <input type='number' class='caja' placeholder='CM' id='lado2'><br><br>"+
						"Lado 3: <input type='number' class='caja' placeholder='CM' id='lado3'><br><br>"+
						"Lado 4: <input type='number' class='caja' placeholder='CM' id='lado4'>"+
					"</div>";
		}
		if(formula=='volumen'){
			result+="<div>"+
						"Ancho: <input type='number' class='caja' placeholder='CM' id='ancho'><br><br>"+
						"Base: <input type='number' class='caja' placeholder='CM' id='base'><br><br>"+
						"Altura: <input type='number' class='caja' placeholder='CM' id='altura'>"
					"</div>";
		}
	}

	if(figura=='rombo'){
		result+="<div style='width: 100px; height: 100px; margin: 10px; background: #17b948; -webkit-transform: rotate(45deg); -moz-transform: rotate(45deg); -ms-transform: rotate(45deg); -o-transform: rotate(45deg); transform: rotate(45deg);'></div><br>";
		if(formula=='area'){
			result+="<div>"+
						"Diagonal mayor: <input type='number' class='caja' placeholder='CM' id='D'><br><br>"+
						"Diagonal menor: <input type='number' class='caja' placeholder='CM' id='d'>"+
					"</div>";
		}
		if(formula=='perimetro'){
			result+="<div>"+
						"Lado: <input type='number' class='caja' placeholder='CM' id='lado'>"+
					"</div>";
		}
	}

	$("#content_figura").html(result);
	$("#content_result").html("");
}
function seleccionarFormula(){
	formula=$("#caja_formula").val();
	seleccionarFigura();
}

function calcular(){
	var result="";

	if(figura=='triangulo'){
		if(formula=='area'){
			result+="Área = base * altura / 2<br><br>"+
				"Área = "+$("#base").val()+" * "+$("#altura").val()+" / 2<br><br>"+
				"Área = "+($("#base").val()*$("#altura").val())+" / 2<br><br>"+
				"Área = "+(($("#base").val()*$("#altura").val())/2)+" cm^2";
		}
		if(formula=='perimetro'){
			result+="Perímetro = L1 + L2 + L3<br><br>"+
				"Perímetro = "+$("#lado1").val()+" + "+$("#lado2").val()+" + "+$("#lado3").val()+"<br><br>"+
				"Perímetro = "+(Number($("#lado1").val())+Number($("#lado2").val())+Number($("#lado3").val()))+" cm";
		}
	}

	if(figura=='cuadrado'){
		if(formula=='area'){
			result+="Área = Lado^2<br><br>"+
				"Área = "+$("#lado").val()+"^2<br><br>"+
				"Área = "+(Math.pow(Number($("#lado").val()),2));
		}
		if(formula=='perimetro'){
			result+="Perímetro = Lado + Lado + Lado + Lado<br><br>"+
				"Perímetro = "+$("#lado").val()+" + "+$("#lado").val()+" + "+$("#lado").val()+" + "+$("#lado").val()+"<br><br>"+
				"Perímetro = "+(Number($("#lado").val())*4)+" cm";
		}
		if(formula=='volumen'){
			result+="Volumén = Lado^3<br><br>"+
				"Volumén = "+$("#lado").val()+"^3<br><br>"+
				"Volumén = "+(Math.pow(Number($("#lado").val()),3));
		}
	}

	if(figura=='rectangulo'){
		if(formula=='area'){
			result+="Área = base * altura<br><br>"+
				"Área = "+$("#base").val()+" * "+$("#altura").val()+"<br><br>"+
				"Área = "+(Number($("#base").val())*Number($("#altura").val()))+" cm^2";
		}
		if(formula=='perimetro'){
			result+="Perímetro = Lado1 + Lado2 + Lado3 + Lado4<br><br>"+
				"Perímetro = "+$("#lado1").val()+" + "+$("#lado2").val()+" + "+$("#lado3").val()+" + "+$("#lado4").val()+"<br><br>"+
				"Perímetro = "+(Number($("#lado1").val())+Number($("#lado2").val())+Number($("#lado3").val())+Number($("#lado4").val()))+" cm";
		}
		if(formula=='volumen'){
			result+="Volumén = ancho * base * altura<br><br>"+
				"Volumén = "+$("#ancho").val()+" * "+$("#base").val()+" * "+$("#altura").val()+"<br><br>"+
				"Volumén = "+(Number($("#ancho").val())*Number($("#base").val())*Number($("#altura").val()))+" cm^3";
		}
	}

	if(figura=='rombo'){
		if(formula=='area'){
			result+="Área: D * d / 2<br><br>"+
				"Área: "+$("#D").val()+" * "+$("#d").val()+" / 2<br><br>"+
				"Área: "+(Number($("#D").val())*Number($("#d").val())/2)+" cm^2";
		}
		if(formula=='perimetro'){
			result+="Perímetro: Lado + Lado + Lado + Lado<br><br>"+
				"Perímetro: "+$("#lado").val()+" + "+$("#lado").val()+" + "+$("#lado").val()+" + "+$("#lado").val()+"<br><br>"+
				"Perímetro: "+(Number($("#lado").val())*4)+" cm";
		}
	}

	$("#content_result").html(result);
}