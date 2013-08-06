/**
 * 
 */
package telefonica.aaee.capture977;

import org.junit.Test;



/**
 * @author Usuario
 *
 */
public class Split977R_COL_LHOSP_Test {
	
	@Test
	public void testFicherosZipFacturacion(){
		String path = "V:/Clientes/a/AJUNTAMENT_DE_LHOSPITALET/REGs/2012/COLEGIOS_2012_4T/";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("COL_LHOSP_2012_4T");
			
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

