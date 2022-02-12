package callback;

public class DebitoCuenta {
	private MetodoPago pago;
	private boolean pagar;
	public DebitoCuenta(MetodoPago pago) {
		this.pago=pago;

	}
	public void procesaPago() {
		pagar=true;
		if(pagar) {
			System.out.println("Pago a debido en cuenta ");
			pago.pagoAEfectuar();
		}
	}
}
