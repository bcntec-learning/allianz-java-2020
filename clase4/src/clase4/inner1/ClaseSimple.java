package clase4.inner1;

public class ClaseSimple { //la regla dice 1 clase public por fichero con el mismo
	private static final int K =56;
	
	private Integer varInstanca1= 7;
	
	
	public Clase3 newClase3() {
		return new Clase3();
	}
	
	public class Clase3 { //inner 
		//intvarInstanca1u=I;
		int varInstanca1 = Clase3Protected.I;  //es una variable estatica 1 por cada clase
		//int varInstanca1=Clase3Protected.y;  pq es una variable de instancia 1 por cada objeto,
		{
			int uuu = new Clase3Protected().y;
		}
		
		public void llamandoAVariableParent() {
			this.varInstanca1= ClaseSimple.this.varInstanca1++; //esta es una gran diferencia con las static
		}
		
	}	
	
	protected static class Clase3Protected { //inner static, se ve desde afuera
		private static final int I =56;
		int y=ClaseSimple.K;
		//int varInstanca1= ClaseSimple.this.varInstanca1++;  this no existe pq es estatica....
	}
	
	private class Clase3Private { //inner puden ser privadas
		private static final int J =56;
		int y=K;
	}
}

class Clase2 {
	//int y=K; por mas que esten en el mismo fichero, no son visibles
}

/*
public class Clase3{
	
}
*/
