<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by TEMPLATED
http://templated.co
Released for free under the Creative Commons Attribution License

Name       : Undeviating 
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20140322

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900|Quicksand:400,700|Questrial" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />

<!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->

</head>
<body>
<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1><a href="index.html">MagProFOG</a></h1>
		</div>
		<div id="menu">
			<ul>
				<li><a href="index.jsp" >Homepage</a></li>
				<li><a href="coletor.jsp" >Coletor</a></li>
				<li><a href="poderComp.jsp">Poder Computacional</a></li>
				<li><a href="redundancia.jsp">Redundância</a></li>
                                <li class="active"><a href="politicas.jsp">politicas</a></li>
			</ul>
		</div>
	</div>
</div>
<div class="wrapper">
	<div id="welcome" class="container">
    	
<div class="title">
    
    <h3>Tabela com os resultados:</h3>

  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['table']});
      google.charts.setOnLoadCallback(drawTable);

      function drawTable() {
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Dados');
        data.addColumn('number', 'Resultado do Calculo');
//        data.addColumn('boolean', 'Full Time Employee');
        data.addRows([
          ['Dado 1',  {v: 10000, f: ''}],
          ['Dado 2',   {v:8000,   f: ''}],
          ['Dado 3', {v: 12500, f: ''}],
          ['Dado 4', {v: 12500, f: ''}],
          ['Dado 5', {v: 12500, f: ''}],
          ['Dado 6', {v: 12500, f: ''}]
        ]);

        var table = new google.visualization.Table(document.getElementById('table_div'));

        table.draw(data, {showRowNumber: false, width: '100%', height: '100%'});
      }
    </script>
  </head>
  </body>
    <div id="table_div"></div>
  </body>
</html>  
        
</div>
</div>
</div>
</body>
</html>
