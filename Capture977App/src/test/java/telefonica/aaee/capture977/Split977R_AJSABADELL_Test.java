/**
 * 
 */
package telefonica.aaee.capture977;

import org.junit.Test;



/**
 * @author Usuario
 *
 */
public class Split977R_AJSABADELL_Test {
	
	@Test
	public void testFicherosZipFacturacion(){
		
		//String path = "V:/Clientes/a/AJUNTAMENT_DE_SABADELL/REGs/REG_2012/Ficheros_F5/2013_ene_feb/";
		String path = "V:/Clientes/a/AJUNTAMENT_DE_SABADELL/FicherosF5/2013_ene_feb/";
		String acuerdo = "AJ_SABA_2012";
		
		
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo(acuerdo);
			
			//!Importante: para poder obtener el nivel de las llamadas internacionales!
			sp.setDetalleLlamadas(false);
			sp.setDetalleLlamadasRI(false);
			
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
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


