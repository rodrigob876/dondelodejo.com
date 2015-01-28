package dondelodejo.com
import dondelodejo.com.Estacionamiento
import dondelodejo.com.Usuario
import dondelodejo.com.calificaciones.CalificaOper
import dondelodejo.com.calificaciones.CalificaCliente
import dondelodejo.com.calificaciones.Calificacion;

class Reserva {

	static belongsTo = [estacionamiento:Estacionamiento,usuario:Usuario];
	Date horaDeInicio
	int  horasReservadas
	/**
	 * @Pendiente	Recien heecha la reserva, debera confirmarse el pago.
	 * @Pagada" 	El pago fue acreditado correctamente.
	 * @Cancelada" 	Aunque haya seguido los pasos el administrador la rechazo.
	 * @Aceptada" 	El administrador dio su consentimiento.
	 */
	String estado
//	static hasOne = [pago:Pago]
	Pago pago
	CalificaOper calificacionOper
	CalificaCliente calificacionCliente
	
    static constraints = {
		estado (nullable:true,inList:["Pendiente","Aceptada","Cancelada"],defaultValue:"Pendiente")
		pago 	nullable:true
    }
	
	static ArrayList<Reserva> listadoByEstacionamientoYUsuario(Long idEstacionamiento,Long idUsuario){
		println "LISTADO " + idEstacionamiento + idUsuario
		Integer cantidad=0
		
		Object[] objArray = Estacionamiento.get(idEstacionamiento).reservas.toArray()

		int i=0;ArrayList<Reserva> reserva = new ArrayList<Reserva>();
		for(i; i < objArray.length ; i++){
			reserva.add(objArray[i])
		}
		return reserva
	}
}
