package clase5.excepciones;

import java.math.BigDecimal;

import clase5.excepciones.Cuenta.OperacionException;

public class Cuenta {

	public static void main(String[] args) {

		try {
			boolean r1 = new Cuenta().tranferir("10", "11");
			System.out.println("hola "+r1);
			boolean r2 = new Cuenta().tranferir("10", "99999",new BigDecimal(10));
			System.out.println("hola "+r2);

			//boolean r3 = new Cuenta().tranferir(null, "99999",new BigDecimal(10));
			//System.out.println("hola "+r3);
			

			boolean r100 = new Cuenta().tranferir("10", "11",new BigDecimal(100));
			System.out.println("hola "+r100);

		} catch (SaldoInsufuciente s) { // la excpecion s instanceof SaldoInsufuciente --> ejecuto el bloque
			System.out.println("SaldoInsufuciente " + s.falatnte);
		} catch (OperacionException s) { // la excpecion s instanceof OperacionException --> ejecuto el bloque
			System.out.println("OperacionException");
		} catch (ErrorCuentasNoValida s) {
			System.out.println("ErrorCuentasNoValida");
		} catch (Throwable s) { // tener cuidado pq aqui se engloban los errors
			System.out.println("Throwable");
		}
		
		
		

	}

	public boolean tranferir(String desde, String hasta, BigDecimal monto) throws SaldoInsufuciente {
		// busco cuenta desde

		if (desde == null) {
			throw new ErrorCuentasNoValida();
		}
		
		BigDecimal saldoDesde = new BigDecimal(99);

		if (!hasta.equals("99999")) {

			// busco cuenta hasta

			// si existen opero y devuelvo true en caso de completar la operacion al 100%
			if (saldoDesde.intValue() > 0) {
				// operacion de trsanferencia
				if (saldoDesde.compareTo(monto) < 0) { // Comparable
					// sino es al 100% lanza una excpcion q no alcanzo
					throw new SaldoInsufuciente(monto.subtract(saldoDesde));

				}
				return true;
			}
		}

		// sino devuelvo false
		return false;
	}

	public boolean tranferir(String desde, String hasta) throws OperacionException {
		return tranferir(desde, hasta, new BigDecimal(1));
	}

	class OperacionException extends Exception {
	}
	class CuentaBloqueada extends OperacionException {
	}

	class SaldoInsufuciente extends OperacionException {
		final BigDecimal falatnte;

		public SaldoInsufuciente(BigDecimal falatnte) {
			this.falatnte = falatnte;
		}

	}
}

class ErrorCuentasNoValida extends RuntimeException {

}
