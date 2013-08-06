/**
 * 
 */
package telefonica.aaee.capture977;

import org.junit.Test;



/**
 * @author Usuario
 *
 */
public class Split977R_CST_Test {
	
	@Test
	public void testFicherosZipFacturacionCST(){
		String path = "V:/Clientes/c/CONSORCI SANITARI DE TERRASSA/TRABAJOS/2012-12-11_CT+OT/Ficheros_F5";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("CST_Test");
			
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


