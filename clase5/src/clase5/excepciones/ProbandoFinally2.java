package clase5.excepciones;

import java.io.IOException;
import java.util.Random;

public class ProbandoFinally2 {
	
	
	
	public static void main(String[] args) throws IOException {
		try {
			
			if(new Random(System.currentTimeMillis()).nextBoolean()){
				throw new  IOException();
			} else {
				int y = 1/0;
			}

			System.out.print("por aqui nunca...");
		} finally {
			System.out.println("Adios...");
		}
	}
	
	
	

}
