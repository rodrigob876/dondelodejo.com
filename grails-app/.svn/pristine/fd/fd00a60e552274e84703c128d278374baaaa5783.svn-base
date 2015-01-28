package dondelodejo.com.calificaciones

import dondelodejo.com.Estacionamiento;
import dondelodejo.com.Reserva
import dondelodejo.com.Usuario;

class Calificacion {

	/** Donde fue hecha la reserva*/
	Estacionamiento estacionamiento
	
	static belongsTo = [reserva:Reserva];
	 
	int valor
	String detalle
	/** A una reserva siempre estara vinculado un cliente */
	Usuario cliente
	
    static constraints = {
		
		estacionamiento nullable : false
		valor 	 	    nullable : false, inList:[1..10]
		detalle 	    nullable : true
		
    }
	/**
	 * Calificar?
	 * @param administrador
	 * @param cliente
	 */
	void calificar (Usuario administrador, Usuario cliente) {
		
		
		
	}  
	
	
}
