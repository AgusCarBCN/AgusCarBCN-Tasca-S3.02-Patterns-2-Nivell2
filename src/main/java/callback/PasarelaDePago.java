package callback;
/*La pasarela de pago implementa la interfaz método de pago
 *Definiendo el método de pago cada vez que se llama a la callback 
 */
public class PasarelaDePago implements MetodoPago {

	@Override
	public void pagoAEfectuar() {
		System.out.println("Pago realizado");

	}	

	
}
