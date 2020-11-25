package clase5.excepciones;

public class ProbandoFinally3 {

	public static void main(String[] args) {
		try {
			//abro recurosos
			try {

				// todo el codigo qye puede fallar
				System.out.print("por aqui ahora si...");
			} finally {
				System.out.println("cerrando recuros...");
				// se utliza mucho para cerrar recursos abiertos en el mismo metodo
			}
		} finally {
			System.out.println("Adios...");
		}
	}

}
