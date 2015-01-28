<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="primerLayout"/>
		<title>Primer Vista</title>
		
	</head>
	<body>
		<div id="page-body" role="main">
		<center>
		<g:form class="formulario" action="guardar" >
			<div class="background"/>
			<div>
		    <label for="nombre">Nombre:</label>
		    <g:textField name="nombre" value="${estacionamiento.nombre}"/>
		    </div>			<div>
		    <label for="direccionStr">Direccion:</label>
		    <g:textField name="direccionStr" value="${estacionamiento.ubicacion.direccionStr}"/>
		    </div>			<div>
		  	<label for="localidad">Localidad:</label>
		    <g:textField name="localidad" value="${estacionamiento.ubicacion.localidad}"/>
		    </div>			<div>
		  	<label for="pais">Pais:</label>
		    <g:textField name="pais" value="${estacionamiento.ubicacion.pais}"/>
		    </div>			<div>
		  	<label for="numCocheras">Cantidad de Cocheras:</label>
		    <g:textField name="numCocheras" value="${estacionamiento.numCocheras?:1}"/>
		    </div>			<div>
		   	<label for="precioCocheraHora">Precio por Hora:</label>
		    <g:textField name="precioCocheraHora" value="${precioCocheraHora?precioCocheraHora:null}"/>
		    </div>			<div>
		   	<label for="precioCocheraFraccion">Precio por Fracción:</label>
		    <g:textField name="precioCocheraFraccion" value="${precioCocheraFraccion?precioCocheraFraccion:null}"/>
		    </div>			<div id="submit"><right>
		    <g:submitButton name="crear" value="Crear el Estacionamiento" /></right>
			</div>
		</g:form>
		</center>
		</div>
	</body>
</html>