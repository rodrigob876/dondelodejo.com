import java.util.Date;

import dondelodejo.com.Cochera
import dondelodejo.com.Estacionamiento
import dondelodejo.com.Tarjeta
import dondelodejo.com.Ubicacion
import dondelodejo.com.Usuario

class BootStrap {
	def usuarioService
	
    def init = { servletContext ->
		
		Ubicacion ubicacion1 = new Ubicacion(
			direccionStr:"Rivadavia 502", 
			direccionX:-34.6080344,
			direccionY:-58.3733686, 
			barrio:"Balvanera",
			localidad:"Capital Federal",
			provincia:"Capital Federal",
			pais:"Argentina");
		
		Tarjeta tarjeta1 = new Tarjeta(
				numero:"0000111100002222",
				vencimiento:"2015/01/01",
				nombreTitular: "Pablo Cosso",
				clave:123,
				domicilioFacturacion:"Paseo Colon 850");

	    Integer numCocheras = 25
		
		Estacionamiento estacionamiento1 = new Estacionamiento(
			nombre:'Primero'	,
			descripcion:"es una linda esquina",	
			fechaAlta:new Date(),
			numCocheras:numCocheras,
			ubicacion:ubicacion1)
		
		Cochera cochera
		for ( i in 1..numCocheras) {
			cochera = new Cochera(numero:i,
										estado:Cochera.estadoLibre(),
										precioCocheraHora:20,
										precioCocheraFraccion:4
										)
			estacionamiento1.addToCocheras(cochera);
			estacionamiento1.save()
		}
		estacionamiento1.save(flush: true)	
		
		
		Usuario usuario1 = new Usuario (
			nombre:"Administrador",
			apellido:"Del Sistema",
			email:"admin@admin.com",
			contrasenia:usuarioService.encriptar("admin"),
			estacionamiento:estacionamiento1,
			tipoUsuario: Usuario.getAdministrador())./*addToTarjetas(tarjeta1).*/save();
		Usuario usuario2 = new Usuario (
			nombre:"Operador",
			apellido:"Del Estacionamiento",
			email:"oper@oper.com",
			contrasenia:usuarioService.encriptar("oper"),
			estacionamiento:estacionamiento1,
			tipoUsuario: Usuario.getOperador())./*addToTarjetas(tarjeta1).*/save();
		Usuario usuario3 = new Usuario (
			nombre:"Cliente",
			apellido:"Del Sistema",
			email:"cliente@cliente.com",
			contrasenia:usuarioService.encriptar("cliente"),
			tipoUsuario: Usuario.getCliente())./*addToTarjetas(tarjeta1).*/save();
	}
	
	def destroy = {
	}

}