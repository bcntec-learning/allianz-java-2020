/* package  */
package ejemplo2;
/* imports  */

import ejemplo1.Clase1;

//import ClaseEnElPaquetePorDefecto no es valido por estar en la clase default;


/* clases  */
public class MiriandoLaVisibilidad {
	private ejemplo1.Clase1 clase1;  //fullname qualifier de otro pquete
	private Clase1 clase2; //mediante  import  pero del otro pquete
	private Clase2 clase21;
	//ClaseEnElPaquetePorDefecto defecto;
}

