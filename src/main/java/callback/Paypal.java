package callback;

public class Paypal implements MetodoPago {
	@Override
	public void pago() {		
		System.out.println("Has pagado con Paypal");
	}
}
