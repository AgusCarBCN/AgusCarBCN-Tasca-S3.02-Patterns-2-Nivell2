
/**
 * Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament 
 * a efectuar: targeta de crèdit, Paypal o deute en compte bancari.
   La passarel·la invocarà el pagament sense conèixer la forma i retornant el control
   a la classe d'origen.La classe que invoca la passarel·la de pagament serà una botiga de sabates.
 * 
 * @author Agustin Carnerero Peña
 */

package callback;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		/*Se crea una variable de referencia de tipo MetodoPago.Una variable de referencia
		de interface puede referirse a cualquier objeto que implemente la interface*/
		MetodoPago pago;
		Scanner enter = new Scanner(System.in);
		boolean exit = false;
		byte opcion;
		do {
			System.out.println("****Método de pago*****");
			System.out.println("1.Paypal");
			System.out.println("2.Targeta de Credito.");
			System.out.println("3.Deuda en cuenta bancaria.");
			System.out.println("4.Salir del menu.");
			System.out.println("Introduce una opcion:");
			opcion = enter.nextByte();
			// opcion =readOptionMenu();
			switch (opcion) {
			case 1:
				pago = new Paypal();
				pasarelaDePago(pago);
				break;
			case 2:
				pago = new PagoCredito();
				pasarelaDePago(pago);
				break;
			case 3:
				pago = new DebitoCuenta();
				pasarelaDePago(pago);
				break;
			case 4:
				System.out.println("Has salido de la tienda");
				exit = true;
				break;

			default:
				System.err.println("Debes introducir una opción entre 0 y 4.");
				break;
			}
		} while (!exit);
		enter.close();
	}

	/**
	 * El método pasarelaDePago invocara al metodo pago sin saber la forma de pago.
	 * 	 
	 * @param metodo referencia de tipo MetodoPago
	 */
	public static void pasarelaDePago(MetodoPago metodo) {
		metodo.pago();
	}
}
