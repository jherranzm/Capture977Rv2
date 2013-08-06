/**
 * 
 */
package telefonica.aaee.capture977;

import org.junit.Test;



/**
 * @author Usuario
 *
 */
public class Split977R_CSC_Test {
	
	@Test
	public void testFicherosZipFacturacionCSC(){
		String path = "V:/Clientes/c/CSC_Computer Sciences/REGs/REG_2013/REG_2013_05";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("CSC_2013_05");
			
			//!Importante: para poder obtener el nivel de las llamadas internacionales!
			sp.setDetalleLlamadas(true);
			sp.setDetalleLlamadasRI(true);
			
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


