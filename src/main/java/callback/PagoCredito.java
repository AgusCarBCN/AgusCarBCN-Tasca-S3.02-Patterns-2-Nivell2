package callback;

public class PagoCredito  {

	private MetodoPago pago;
	private boolean pagar;
	public PagoCredito(MetodoPago pago) {
		this.pago=pago;

	}
	public void procesaPago() {
		pagar=true;
		if(pagar) {
			System.out.println("pago con targeta de credito");
			pago.pagoAEfectuar();
		}
	}

}
