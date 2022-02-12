package callback;

public class PagoCredito implements MetodoPago {

	@Override
	public void pago() {
		System.out.println("Has pagado con targeta de credito");

	}

}
