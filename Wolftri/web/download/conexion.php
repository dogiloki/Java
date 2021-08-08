<?php

	$conexion=mysqli_connect("localhost","root","") or die ("404");
	mysqli_select_db($conexion,"wolftri") or die ("500");

	function getDir(){
		return str_replace("\\","/","http://".$_SERVER["HTTP_HOST"]."/wolftri");
	}

	/*Class db extends SQLite3{
		function __construct(){
			$this->open("../../db/db.sql");
		}
	}

	veryData();

	function veryData(){
		$db=new db();
		$rs=$db->exec("CREATE TABLE IF NOT EXISTS versions(version VARCHAR(50) not null)");
		$rs=$db->query("SELECT * FROM versions");
		while($row=$rs->fetchArray()){
			return 0;
		}
		$rs=$db->exec("INSERT INTO versions VALUES ('1.0.0')");
	}*/

?>