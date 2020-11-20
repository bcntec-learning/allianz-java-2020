package clase3;

public class JugandoConIdentificadores {
	Integer $; //son validos, no muy recomendados
	Long _; //son validos, no muy recomendados
	String _a1; //es un estandar bastante usado
	
	// String 1a; //no cumple con la regla de ser un caracter, $, _ o letra;
	// String a%; //no cumple con la regla de ser un caracter, $, _ o letra;
	String a1;
	
	String identificadorExtremadamentesLargoQueNoSeParaQueSirve; //
	String nombrePadre; //objeto padre   camel hump
	String apellidoPadre; //objeto padre  camel hump
	String nombreMadre; //objeto madre   camel hump
	String apellidoMadre; //objeto madre  camel hump
	
	
	String apellido_madre; //snake
	String ApellidoMadre; //kebab  se utliza para las calses.
	direccion Direccion = new direccion();  // confuso
	
	 final String EMPRESA = ""; //una variable por cada instancia, aunque no las puedas cambiar
	 static final String SEDE = ""; //una variable por cada clase
	
	final Persona madre = new Persona();
	final Persona padre= new Persona();
	
	
	
	
	//String final; no se pueden usar keywords como indentificadores
	
	
	{
		$ = 1;
		_ = 7L;
		madre.setNombre("Marta");
		//madre = new Persona(); las referencias final no ser pueden modificar
		
		Direccion.calle="Gran via";
	}

	private class Persona { //encasuplo datos
		String nombre;
		String apellido;
		
		
		public void setNombre(final String nombre) {
			//logica de negocio q permita este cambio;
			//nombre=null;
			this.nombre=nombre; //sombra / shadow variable
		}
		public String getNombre() {
			return this.nombre;
		}
	}
	
	class direccion { //no es recomendable, usar Kebab convention CambiarAMayusculasCadaPalabra
		String calle;
	}
}
