package ejercicios;

public class Dec26 {
	short a0; //se inicializa a 0
	Integer o0;
	
	public static void main(String [] args) {
		short a1 = 6;
		Integer o;
		new Dec26().go(a1); 
		
		new Dec26().go(new Integer(7));

		//new Dec26().go(o);
		
		/*
		long a2 = 6;
		new Dec26().go((short)a2); 
		
		a1= (short) a2; //como hay perdidad de bits, debes explicito
		
		int o = new Integer(7); //unboxing
		*/
	}
	

	
	void go(int x) { //utliza este metodo pq x tiene mayor capacidad de almacenamiento
		System.out.print("i ");
	}
	
	void go(Short x) {
		System.out.print("S ");
	}

	
	void go(Long x) {
		System.out.print("L ");
	}


	void go(Number x) {
		System.out.print("N ");
	}
}
