package clase5.excepciones;

import java.util.Random;

public class ProbandoFinally {
	


	
	public static void main(String[] args) {
		try {
			
			if(new Random(System.currentTimeMillis()).nextBoolean()){
				throw new NullPointerException();
			} else {
				int y = 1/0;
			}

			System.out.print("por aqui nunca...");
		}catch(NullPointerException u) {
			//casos cuando se produce Null Pointer
			System.out.print("dio null pointer...");
		}catch(ArithmeticException u) {
			//operciones cuando se produce errores Aritmeticos
			System.out.print("dio error aritmetico...");
		} finally {
			System.out.print("Adios...");
		}
	}
	
	

}
