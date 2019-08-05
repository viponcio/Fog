<%@page import="dao.ConectaDB_MySQL"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900|Quicksand:400,700|Questrial" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />

</head>
<body>
   
<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1><a href="index.html">MagProFOG</a></h1>
		</div>
		<div id="menu">
			<ul>
                            <li><a href="index.jsp">Dashboard</a></li>       
				<li class="active"><a href="coletor.jsp">Coletor</a></li>
				<li><a href="poderComp.jsp">Poder Computacional</a></li>
				<li><a href="redundancia.jsp">Redundância</a></li>
                                <li><a href="politicas.jsp">politicas</a></li>
			</ul>
		</div>
	</div>
</div>
<div class="wrapper">
	<div id="welcome" class="container">
    	
<div class="title" class="row">
        <div class="col-md-6">
        <br/>
        <br/>
        <h5>Digite os dados da Fog </h5>
        <div>
              
            <input type="text" id="nomeFog" name="scales" checked>
                <label for="scales"> NOME</label><a href=""> Atribua um nome</a>
            
        </div>
        <div>
              
            <input type="number" id="scales" name="scales" checked>
                <label for="scales"> CPU</label><a href=""> Não sabe o valor?</a>
            
        </div>
        <div>
            <input type="number" id="scales" name="scales" checked>
            <label for="scales"> MIPS</label><a href="redundancia.html"> Não sabe o valor?</a>

        </div>
        <div>
            <input type="number" id="scales" name="scales" checked>
            <label for="scales"> RAM</label><a href="redundancia.html"> Não sabe o valor?</a>

        </div>
        <div>
            <input type="number" id="scales" name="scales" checked>
            <label for="scales"> CORE</label><a href="redundancia.html"> Não sabe o valor?</a>

        </div>
        <div>
            <input type="number" id="scales" name="scales" checked>
            <label for="scales"> DISC</label><a href="redundancia.html"> Não sabe o valor?</a>

        </div>
        <div>
            <input type="number" id="scales" name="scales" checked>
            <label for="scales"> CACHE</label><a href="redundancia.html"> Não sabe o valor?</a>

        </div>
        
        <div>
            <input type="number" id="scales" name="scales" checked>
            <label for="scales"> BAT</label><a href="redundancia.html"> Não sabe o valor?</a>

        </div>
        
        <button class="button">Enviar</button>
        </div>
        
        <div class="col-md-6">
        <br/>
        <br/>
        
        <form action="peso" method="post">
        <h5>Digite os dados para o peso:</h5>


        <div>
                       
            <input type="number" id="scales" name="idpeso" placeholder="10" checked>
            <label for="scales">Id peso </label>
            
        </div>   
        <div>
                       
            <input type="number" id="scales" name="pesoCache" placeholder="10" checked>
            <label for="scales"> CACHE</label>
            
        </div>
        <div>
            <input type="number" id="scales" name="pesoArm" placeholder="10" checked>
            <label for="scales"> ARM</label>

        </div>
        <div>
            <input type="number" id="scales" name="pesoBat" placeholder="10" checked>
            <label for="scales"> Bateria</label>

        </div>
        <div>
            <input type="number" id="scales" name="pesoRam" placeholder="10" checked>
            <label for="scales"> RAM</label>

        </div>
        <div>
            <input type="number" id="scales" name="pesoMIPS" placeholder="10" checked>
            <label for="scales"> MIPS</label>

        </div>
        
        <div>
            <input type="number" id="scales" name="pesoCPU" placeholder="10" checked>
            <label for="scales"> CPU</label>

        </div>
        <div>
            <input type="text" id="scales" name="pesocol" placeholder="10" checked>
            <label for="scales"> Coletor</label>

        </div>
                
        <input type="submit" value="enviar">Enviar</input>
        <c:if test="${not empty mensagem}">
            <h2> Mensgem do servidor: 
                <strong>${mensagem}</strong>
            </h2>
            </c:if>   
        </div>
        </form>
</div>
</div>
</div>
</body>
</html>
