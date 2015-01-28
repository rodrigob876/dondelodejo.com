<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="primerLayout"/>
		<title>Primer Vista</title>
		
<g:if test="${session.usuario}">
	<g:if test="${!session.usuario.esAdministrador()}">
	<style type='text/css'>.admin {display: none;}</style>
	</g:if>
</g:if>
<g:else>
	<style type='text/css'>.admin {display: none;}</style>
</g:else>

	</head>
	<body>



		<div id="page-body" role="main">

		<table border=1>
			<tr>
				<td width="80%" colspan="2">Estacionamiento:</td>

					<td class="admin" width="20%" ><a href="crear/">Agregar Estacionamiento</a></td>

			</tr>
	    <g:each in="${estacionamientoInstanciaListado}" var="e">
		    <tr>
			    <td>
					Nombre: ${e.nombre}<br/>
					Direccion: ${e.ubicacion?.direccionStr}<br/>
					Alta: ${e.fechaAlta}<br/>
					Edicion: ${e.fechaModificacion}<br/>
					Borrado: ${e.fechaBaja}<br/>
					CoordX: ${e.ubicacion?.direccionX}<br/>
					CoordY: ${e.ubicacion?.direccionY}<br/>
				</td>
				<td>
					<a href="mostrar/${e.id}">Ver Detalle</a>
				</td>

				<td class="admin">
					<g:link controller="estacionamiento" action="editar" id="${e.id}">Editar</g:link><br/>
					<g:link controller="estacionamiento" action="borrar" id="${e.id}">Eliminar</g:link><br/>
					<g:link controller="estacionamiento" action="operador" id="${e.id}">Operador</g:link><br/>
				</td>

			</tr>	
	    </g:each>
		    <tr>
			    <td colspan="3">
				Y fueron ${estacionamientoInstanciaTotal} Elemento/s mostrado/s
				</td>
			</tr>
		</table>
		
		</div>
	</body>
</html>