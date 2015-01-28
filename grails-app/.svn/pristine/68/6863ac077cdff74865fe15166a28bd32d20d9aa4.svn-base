<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="primerLayout"/>
		<title>Primer Vista</title>
		
	</head>
	<body>
		<div id="page-body" role="main">

			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>

		<g:form action="actualizar" >
			<g:textField style="display:none" name="id" value="${id}"/>
		    <br/>
		    <label for="nombre">nombre</label>
		    <g:textField name="nombre" value="${estacionamiento.nombre}"/>
		    <br/>
		    <label for="direccionStr">direccionStr</label>
		    <g:textField name="direccionStr" value="${estacionamiento.ubicacion?.direccionStr}"/>
		    <br/>
		  	<label for="localidad">Localidad:</label>
		    <g:textField name="localidad" value="${estacionamiento.ubicacion?.localidad}"/>
		    <br/>
		  	<label for="pais">Pais:</label>
		    <g:textField name="pais" value="${estacionamiento.ubicacion?.pais}"/>
		    <br/>
		    <g:submitButton name="actualizar" value="Guardar Cambios" />
		</g:form>
		</div>
	</body>
</html>