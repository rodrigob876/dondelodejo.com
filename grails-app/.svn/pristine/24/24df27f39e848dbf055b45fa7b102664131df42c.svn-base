<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="primerLayout"/>
		<title>Primer Vista</title>
		
	</head>
	<body>
		<div id="page-body" role="main">
			<div class="datosEstacionamiento">
			Nombre: ${estacionamiento.nombre}<br/>
			Cocheras: ${estacionamiento.numCocheras} Totales y tiene ${cocherasLibres} Libres<br/>
			<g:if test="${(cocherasLibres!=0)}">
				<g:link controller="reserva" action="crear" id="${estacionamiento.id}">Hacer Reserva Con Tarjeta</g:link>
			</g:if>			
            <!-- 
			Id del sistema: ${estacionamiento.id}<br/>
			Direccion: ${estacionamiento.ubicacion?.direccionStr}<br/>
			Alta: ${estacionamiento.fechaAlta}<br/>
			Edicion: ${estacionamiento.fechaModificacion}<br/>
			CoordX: ${estacionamiento.ubicacion?.direccionX}<br/>
			CoordY: ${estacionamiento.ubicacion?.direccionY}<br/>
			 -->
			<center>
			<!-- IFRAME MAPA -->
			<iframe  
				width="960" height="350" frameborder="0" style="border:0"  
				src="https://www.google.com/maps/embed/v1/place?key=AIzaSyBin0bcsLNUuEkshZ_g2512ytxL95ikl3I
				&q=${estacionamiento.ubicacion?.direccionStr},${estacionamiento.ubicacion?.localidad},${estacionamiento.ubicacion?.pais}">
			</iframe>
			</center>	
		</div>
	</body>
	
</html>