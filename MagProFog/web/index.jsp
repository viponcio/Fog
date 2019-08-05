<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900|Quicksand:400,700|Questrial" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />

</head>
<body>
<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1><a href="index.jsp">MagProFOG</a></h1>
		</div>
		<div id="menu">
			<ul>
                                <li class="active"> <a href="index.jsp">Dashboard</a></li>
				<li><a href="coletor.jsp">Coletor</a></li>
				<li><a href="poderComp.jsp">Poder Computacional</a></li>
                                <li><a href="redundancia.jsp">Redundância</a></li>
                                <li><a href="politicas.jsp">politicas</a></li>
			</ul>
		</div>
	</div>
</div>
<div class="wrapper">
	<div id="welcome" class="container">
        <br/>
        <br/>
        <br/>
<div class="title">
         
	  <h3>Monitoramento Proativo de Fog subsidiado por uma análise computacional dos nodos Fog</h3>
		</div>
		<p> Essa ferramenta tem o objetivo de gerenciar nodos Fog proativamente, 
                    para isso está subvidido em quatro interfaces: Coletor, PoderComputacional, Redundância 
                    e Politicas.
                    Para ter mais informações dessas páginas basta acessa-lás que um guia de auxilio será 
                    apresentado para você administrador desse ambiente IoT com Fog.
                </p>
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <script>
            
	$(document).ready(function () {
                $.getJSON("newjson.json", function (data) {
        	$.each(data, function (index, value) {
            	$('#cont').append(value['latency'] + '</br>');
//                + append.(value['name']+ '</br>');
   			});
        });
    });
        </script>
       <p id="demo"></p> 
       <script>
           var xmlhttp = new XMLHttpRequest();
                xmlhttp.onreadystatechange = function() {
                  if (this.readyState == 4 && this.status == 200) {
                    var myObj = JSON.parse(this.responseText);
                    document.getElementById("demo").innerHTML = myObj.name;
                  }
                };
                console.log("oiii");
                xmlhttp.open("GET","newjson.json", true);
              
                xmlhttp.send();
                  
       </script>
        <div id="cont"></div>
	</div>
</div>
</body>
</html>
