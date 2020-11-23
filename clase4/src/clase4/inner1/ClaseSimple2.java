package clase4.inner1;

public class ClaseSimple2 {
	ClaseSimple simple =  new ClaseSimple();
	// ClaseSimple.Clase3 pu = new simple.Clase3(); podre pero no desde la clase externa sino desde adentor
	 ClaseSimple.Clase3 pu =  simple.newClase3(); 

	ClaseSimple.Clase3Protected prot = new ClaseSimple.Clase3Protected();



	
}
