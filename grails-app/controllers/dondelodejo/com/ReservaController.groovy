package dondelodejo.com
import dondelodejo.com.Reserva

class ReservaController {
	
	def clienteService //aqui debe ponerse los metodos
	def usuarioService //para validaciones eventuales
	def estacionamientoService //para listar las reservas
	def beforeInterceptor = [action:this.&checkUser,except:[]]
	def checkUser() {
		if(!session.getAttribute("usuario")) {
		// i.e. user not logged in
		redirect(controller:'login',action:'verificarUsuario')
		return false
		}
	}
	
	/*TODO: en un futuro este crear puede levantar todas 
	 * las reservas del estacionamiento para ver los horarios libres.
	 */
	def crear () {
		//creo la reserva para el filtro de creacion
		   Reserva reserva = new Reserva()
		   reserva.horasReservadas=1
		   Reserva[] listadoReservas
		   if (params["id"]){
			   //hago la busqueda para encontrar las reservas ya hechas.
			   listadoReservas = clienteService.listadoReservas(Long.valueOf(params["id"]), ((Usuario)session.getAttribute("usuario")).id)
		   }
		   def out = [reservaFiltro:reserva,listadoReservas:listadoReservas,estacionamientoId:params["id"]]
		   println out
		   out
	}
	
	public static Long getDateFromDatePicket(Map map,String s){
		Date fecha=new Date(Integer.valueOf(map.get(s+"_year"))-1900,
			                Integer.valueOf(map.get(s+"_month")),
							Integer.valueOf(map.get(s+"_day")),
							Integer.valueOf(map.get(s+"_hour")),
							Integer.valueOf(map.get(s+"_minute")))
		println "SE CONVIRTIO A LA FECHA " +fecha
		return fecha.getTime();
	}
	
	
	
	def alta () {
		println params
			Map reservaIn = [horaDeInicio:new Date(getDateFromDatePicket(params,"horaDeInicio")),
//			def reservaIn = [horaDeInicio:new Date(params.get("horaDeInicio")),
				             horasReservadas:params.get("horasReservadas")]
			def reservaOut = clienteService.crearReserva(  [reserva:reservaIn,
														estacionamientoId:params["estacionamientoId"],
														usuario:session.getAttribute("usuario")])	
			if(reservaOut != null) {
				flash.message = "La Reserva fue creada exitosamente."
				redirect action:"crear", id:params["estacionamientoId"]
			} else {
				flash.message = "El estacionamiento no acepto su reserva."
				render view:"crear", id:params["id"], model:[reserva:estacionamientoService.buscarReserva(reservaOut)]
			}
			
	}
	
	def borrar () {
		conReserva { reserva ->
			//baja fisica inhabilitada reserva.delete()
			
			if (!estacionamientoService.borrarReserva(Long.valueOf(params.get("id")))) {
				//borrado exitoso
				flash.message = "El reserva fue borrado exitosamente."
			} else {
				//error en el borrado
				flash.message = "El reserva no fue borrado."
			}
			redirect action:"crear",id:params["estacionamientoId"]
			
		}
	}
	
	private def conReserva(id="id", Closure c) {
		def reserva = estacionamientoService.buscarReserva([id:params[id]])
		if(reserva) {
			c.call reserva
		} else {
			flash.message = "El reserva no fue encontrado."
			redirect action:"listado"
		}
	}
	
}
