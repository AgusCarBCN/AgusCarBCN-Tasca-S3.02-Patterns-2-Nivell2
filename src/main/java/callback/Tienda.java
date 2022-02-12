
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
		/*Un Callback es una referencia a una acción ejecutable
		 que es pasada como un argumento a otra función*/
		PasarelaDePago pasarela=new PasarelaDePago();
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
				Paypal paypal= new Paypal(pasarela);
				paypal.procesaPago();
				break;
			case 2:
				PagoCredito credito = new PagoCredito(pasarela);
				credito.procesaPago();
				break;
			case 3:
				DebitoCuenta debito = new DebitoCuenta(pasarela);
				debito.procesaPago();
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

	
}
