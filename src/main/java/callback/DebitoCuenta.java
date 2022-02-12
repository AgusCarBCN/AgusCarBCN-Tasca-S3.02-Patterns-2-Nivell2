package callback;

public class DebitoCuenta implements MetodoPago {
	@Override
	public void pago() {
		
		System.out.println("Has pagado con deuda en cuenta corriente");
	}
}
