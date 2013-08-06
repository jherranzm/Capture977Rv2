/**
 * 
 */
package telefonica.aaee.capture977;

import org.junit.Test;



/**
 * @author Usuario
 *
 */
public class Split977R_UB_Test {
	
	@Test
	public void testFicherosFacturacion(){
		String path = "V:/Clientes/u/UNIVERSITAT DE BARCELONA/REGs/REG_Acuerdo_2012_2S/Ficheros_F5";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("UB_2012_2S_v002");
			
			//!Importante: para poder obtener el nivel de las llamadas internacionales!
			sp.setDetalleLlamadas(true);
			sp.setDetalleLlamadasRI(true);
			
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


