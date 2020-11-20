package clase3;

public class ContandoObjetos {
	private Long indice; // uno por cada objeto existente
	private static Long secuencia; //uno por cada Clase pero modificable
	private static final Long MAXIMO = 100L; //uno por cada Clase no modificable
	
	
	public Long getIndice() {
		return indice;
	}
	
	/* requere q yo cree instancia
	public Long getSecuencia() {
		return secuencia;
	}
	*/
	
	public static Long getSecuencia() {
		return secuencia;
	}
	
	public static void main(String ags[]) {
		
		//ContandoObjetos.MAXIMO =200L; no va
		ContandoObjetos.secuencia = 77L; //si va
		
		for(long l = 0L; l<MAXIMO;l++) {
			//new ContandoObjetos().getSecuencia();

			Long i = new ContandoObjetos().getIndice();
			
			ContandoObjetos.getSecuencia();
			getSecuencia(); //esto funciona pq estoy en la misma clase
		}
	}
	

}
