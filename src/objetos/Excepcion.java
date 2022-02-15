/*
 * @autor: Abel Jornet
 * Fecha modificación: 07/02/2021
 */
package objetos;

@SuppressWarnings("serial")
public class Excepcion extends Exception {

	private int codigoExcepcion;

	public Excepcion(int codigoError) {
		super();
		this.codigoExcepcion = codigoError;
	}

	public Excepcion() {
		super();
	}

	@Override
	public String getMessage() {

		String mensaje = "";

		switch (codigoExcepcion) {
		case 111:
			mensaje = "Exception 111: El numero generado es par";
			break;
		case 222:
			mensaje = "Exception 222: El numero generado es impar";
			break;
		}
		return mensaje;
	}

}
