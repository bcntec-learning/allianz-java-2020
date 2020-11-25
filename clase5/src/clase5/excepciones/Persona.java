package clase5.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Persona {
	String nombre;
	String apellido;
	
	

	public static void main(String[] args) {
		Persona juan = new Persona();
		juan.apellido="Perez";
		juan.nombre="Juan";
		Persona romualdo = new Persona();
		romualdo.apellido="Perez";
		romualdo.nombre="Romualdo";
		Persona nula = new Persona();

		try {
			juan.grabar("juan.txt");
			romualdo.grabar("romualdo.txt");
			nula.grabar("nula.txt");
		} catch (FileNotFoundException e) {
			System.out.println("causa:"+e.getCause());
			e.printStackTrace(System.out);
		} catch(ErrorGrabacion e) {
			System.out.println("causa:"+e.getCause());		
			e.printStackTrace(System.out);
		}
		
		System.out.println("adios....");
	}

	
	
	public boolean grabar(String fichero) throws FileNotFoundException {
		File file = new File(fichero);
		FileOutputStream fos = new FileOutputStream(file); //OutpuStream
		
		System.out.println(file.getAbsolutePath());
		
		try {	
			/*
			fos.write(nombre.getBytes());
			fos.write("\n".getBytes());
			fos.write(apellido.getBytes());
			*/
			PrintStream printer = new PrintStream(fos);
			printer.println(nombre);
			printer.println(apellido);
			
			
			fos.close();
		} catch (IOException e) {
			throw new ErrorGrabacion(e);
		}catch (NullPointerException e) {
			throw new ErrorGrabacion(e);
		}
		

		//System.out.; // OutpuStream		
		
		return true;
		
	}
	
	class ErrorGrabacion  extends RuntimeException {

		public ErrorGrabacion(Throwable e) {
			super(e);
		}
		
	}
}
