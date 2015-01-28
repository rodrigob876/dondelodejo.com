<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="primerLayout"/>
		<title>Primer Vista</title>
		
	</head>
	<body>
		<div id="page-body" role="main">
			Estacionamiento numero: ${estacionamiento.id}
			<table border=1>
					<tr>
			    <g:each in="${estacionamiento.cocheras}" var="c">

				                <g:if test='${c.estaOcupada()}'>
									<td class="tdOperador tdOcupada">
								</g:if>
								<g:else>
									<td class="tdOperador tdLibre" >
								</g:else>
							<g:form action="cambiarEstadoCochera" >
							
								${c.numero}<br/>
								Hora:${c.precioCocheraHora} ARS<br/>
								Fraccion:${c.precioCocheraFraccion} ARS<br/>
				                <g:textField style="display:none" name="estacionamientoId" value="${estacionamiento.id}"/>
				                <g:textField style="display:none" name="cocheraId" value="${c.id}"/>
				                <g:if test='${c.estaOcupada()}'>
									<g:submitButton name="liberar" value="LIBERAR" />
								</g:if>
								<g:else>
									<g:submitButton name="ocupar" value="OCUPAR" />
								</g:else>
			                </g:form>
						</td>
			         <g:if test='${(c.numero % 10)==0}'>
			         </tr><tr>
					</g:if>
				</g:each>
					</tr>
			</table>
		<a href="../listado">volver al listado</a>		
		</div>
	</body>
	
</html>