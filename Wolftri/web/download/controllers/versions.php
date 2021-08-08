<?php

include("../conexion.php");

if(isset($_GET['v'])){
	$return="";

	if($_GET['v']=='getData'){

		$rs_software=mysqli_query($conexion,"SELECT * FROM software");
		while($row_software=mysqli_fetch_array($rs_software)){
			$return.="<div class='version'>Wolftri ".$row_software['version']."</div>".
						"<div class='flex'>".

							"<a download='' href='".getDir()."/download/version/".$row_software['instalador']."' class='btn' style='background: #ffffff; color: #17b948; margin: 5px;'>Instalador</a>".

							"<a download='' href='".getDir()."/download/version/".$row_software['portable']."' class='btn' style='background: #ffffff; color: #17b948; margin: 5px;'>Portable</a>";
					
		}
		$rs_version=mysqli_query($conexion,"SELECT * FROM versions ORDER BY version DESC LIMIT 1");
		while($row_version=mysqli_fetch_array($rs_version)){
			$return.="<a download='' href='".getDir()."/download/version/".$row_software['instalador']."' class='btn' style='background: #ffffff; color: #17b948; margin: 5px;'>Actualizar ".$row_version['version']."</a>";
		}
		$return.="</div></div>";

	}

	echo $return;
	return 0;
}

?>