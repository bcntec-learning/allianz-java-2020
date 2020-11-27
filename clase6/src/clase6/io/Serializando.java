package clase6.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Serializando {

	public static void main(String[] args) {
		Item item = new Item( "Francisco");

		OutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("../out/serializando.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(item);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		
		try (OutputStream fos2 = new FileOutputStream("../out/serializando_try_with_resources.dat");
				ObjectOutputStream oos2 = new ObjectOutputStream(fos2)) {
			oos2.writeObject(item);
			System.out.println(item.nombre);
			System.out.println(item.nombreMayuscula);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
		

		try (InputStream fio = new FileInputStream("../out/serializando_try_with_resources.dat");
				ObjectInputStream ois = new ObjectInputStream(fio)) {
			Item i = (Item) ois.readObject();
			System.out.println(i.nombre);
			System.out.println(i.nombreMayuscula);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

		
		
		
		
		
	}

	public static class Item implements Serializable {

		String nombre;
		transient String nombreMayuscula;
		
		
		public Item(String nombre) {
			this.nombre = nombre;
			this.nombreMayuscula = this.nombre.toUpperCase();
		}

	}

}
