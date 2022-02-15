/*
 * @autor: Abel Jornet
 * Fecha modificación: 07/02/2021
 */
package objetos;

public class Aleatorio {

	public static int Random() {
		int numAleatorio = (int) Math.floor(Math.random() * 999);
		return numAleatorio;
	}

}
