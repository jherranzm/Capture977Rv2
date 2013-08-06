/**
 * 
 */
package telefonica.aaee.capture977;

import org.junit.Test;



/**
 * @author Usuario
 *
 */
public class Split977R_AJManresa_Test {
	
	@Test
	public void testFicherosZipFacturacionAJMANRESA(){
		String path = "V:/Clientes/a/AJUNTAMENT_DE_MANRESA/REGs/REG_2012_2S_Concurso";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("AJMANRESA_2012_2S");
			
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


