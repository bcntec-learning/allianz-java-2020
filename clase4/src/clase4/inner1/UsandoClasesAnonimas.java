package clase4.inner1;

import clase4.inner1.ClaseSimple.Clase3;

public class UsandoClasesAnonimas {
	private ClaseSimple heradaDeSimplePeroAnonima = new ClaseSimple() {  //extiendo de manera anonima
		@Override
		public Clase3 newClase3() {
			System.out.println("Ahora extiendo");
			return new Clase3();
		}
	};

	{ //bloque de codigo de instancia  se ejecuta cada vez que se instancia una clase
		System.out.println("Hola Soy un Bloque de Instancia");

		System.out.println(heradaDeSimplePeroAnonima.getClass());
	}
	
	static {
		System.out.println("Hola Soy un Bloque estatico");
	}
	
	private InterfaceSimple botonRojo;
	
	public void configuraBotonRojo(InterfaceSimple i) {
		this.botonRojo=i;
		System.out.println(i.getClass());
	}
	
	
	//nuestra interfaz grafica ejecuta el metodo este
	public void clickeandoBoton() {
		botonRojo.click();
	}


	
	
	public static void main(String args[]) {
		UsandoClasesAnonimas caso1 = new UsandoClasesAnonimas();
		caso1.configuraBotonRojo(new InterfaceSimple() {  //J8 Lamda --> deriva  Interfaces Funcionales
			
			@Override
			public void click() {
				System.out.println("Click 1");
				
			}
		}); 
		
		new UsandoClasesAnonimas();
		
	}
}
