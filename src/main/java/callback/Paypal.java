package callback;

public class Paypal  {
	
	private MetodoPago pago;
	private boolean pagar;
	public Paypal(MetodoPago pago) {
		this.pago=pago;

	}
	public void procesaPago() {
		pagar=true;
		if(pagar) {
			System.out.println("Pago con paypal");
			pago.pagoAEfectuar();
		}
	}
	
}
