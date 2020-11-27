package clase6.io;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JugandoConInputs {

	
	public static void main(String...args) throws IOException {
		File f1 = new File("../out/caso1");
		
		System.out.println(f1.getAbsolutePath() );

		File f2 = new File("../");
		System.out.println(f2.getCanonicalPath()  + " "+f2.exists() + " "+f2.isDirectory() + " " + f2.isFile());
		
		
		if(f1.exists() || f1.mkdirs()) {
			File f1_1 = new File(f1, "testeando_inputs.txt");
			if(f1_1.createNewFile()) {
				System.out.println(f1_1+ " creado");
			}
			if(f1_1.canWrite()) {
				OutputStream os = new FileOutputStream(f1_1);
				grabar(System.in, os);
				
			
			} else {
				System.out.println( "no pude grabar ");
			}
			
		} else {

			System.out.println( "no pude crear el directorio "+f1.getCanonicalPath());
		}
		
		
	}
	
	public static void grabar(InputStream is, OutputStream os) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		int c;
		while((c= is.read())!=-1){
			bos.write(c);
		}
		
		
		bos.write("\n".getBytes());
		bos.flush();
	}
	
}
