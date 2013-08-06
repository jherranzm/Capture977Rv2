/**
 * 
 */
package telefonica.aaee.capture977;

import org.junit.Test;



/**
 * @author Usuario
 *
 */
public class Split977R_SANAGUSTN_Test {
	
	@Test
	public void testFicherosZipFacturacion(){
		String path = "V:/Clientes/s/SAN AGUSTIN/TRABAJOS/2012/2012-10-15_Imagenio/";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("SANAGUSTIN_2012_1S");
			
			//!Importante: para poder obtener el nivel de las llamadas internacionales!
			sp.setDetalleLlamadas(false);
			sp.setDetalleLlamadasRI(false);
			
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
//				sp.setDbHost("localhost");
//				sp.setDbName("977R");
//				sp.setDbUser("root");
//				sp.setDbPass("illuminatti");
				
//				String path = new java.io.File(".").getCanonicalPath();
				sp.setDirectorioOut(path);
				sp.execute();
				System.out.println("Se ha tardado:" + sp.getTiempoEmpleado()/1000 + " segundos!");
			}else{
				System.err.println("Sin ficheros a tratar...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}


