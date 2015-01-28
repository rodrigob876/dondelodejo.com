<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="primerLayout"/>
		<title>Primer Vista</title>
		
	</head>
	<body>
		<div id="page-body" role="main">

		<table border=1>
			<tr>
			<td width="100%" colspan="2">Resultados Encontrados para ${direccion}(dentro de los ${metros} metros) :</td>
				
			</tr>
	    <g:each in="${resultados}" var="e">
		    <tr>
			    <td>
					Nombre: ${e.nombre}<br/>
					Direccion: ${e.ubicacion.direccionStr}<br/>
					Alta: ${e.fechaAlta}<br/>
					Edicion: ${e.fechaModificacion}<br/>
					Borrado: ${e.fechaBaja}<br/>
					CoordX: ${e.ubicacion.direccionX}<br/>
					CoordY: ${e.ubicacion.direccionY}<br/>
				</td>
				<td>
					<a href="mostrar/${e.id}">Ver Detalle</a>
				</td>
			</tr>	
	    </g:each>
		</table>
		
		</div>
	</body>
</html>