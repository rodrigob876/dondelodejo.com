package dondelodejo.com

import java.security.MessageDigest

/**
 * UsuarioService hace referencia a la clase de Dominio Usuario. 
 * Deberia ser usada internamente por la aplicacion. Por ejemplo por el servicio de login, 
 * y en aquellos casos que se necesesite saber el tipo de usuario logueado
 * @author Jano
 *
 */
class UsuarioService {
	static transactional = true
	def buscarUsuario (Map datosDeUsuario) {
		Usuario usuario = new Usuario()
		usuario = Usuario.findWhere(datosDeUsuario)
		
	}
	/**debe ser un usuario valido, verifica que no manipulen la session o cookie*/
	private boolean validarUsuario(Usuario usuario) {
		if (Usuario.findWhere(usuario.properties)){
			return true
		}
		return false
	}
	def esTipoUsuario (Usuario usuario,String tipo) {
		if (!validarUsuario(usuario)) {throw new RuntimeException("El Usuario no es v�lido")}
		def tipoDeUsuario = false
		switch ( tipo ) {
			case Usuario.getUSUARIO_ADMINISTRADOR():
				tipoDeUsuario = usuario.esAdministrador()
				break
		
			case Usuario.getUSUARIO_CLIENTE():
				tipoDeUsuario = usuario.esCliente()
				break
		
			case Usuario.getUSUARIO_OPERADOR():
				tipoDeUsuario = usuario.esOperador()
				break
		
			default:
				throw new RuntimeException("Tipo de usuario desconocido")
		}
		return tipoDeUsuario
	}
    def guardarUsuario() {}
	def encriptar(String pass){
		String passwordToHash = pass;
        String generatedPassword = null;

            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes 
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
			return generatedPassword
	}
}
