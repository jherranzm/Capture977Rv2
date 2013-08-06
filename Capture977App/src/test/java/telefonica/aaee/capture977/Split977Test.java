/**
 * 
 */
package telefonica.aaee.capture977;

import java.io.File;

import org.junit.Test;

import telefonica.aaee.util.UtilNombre;



/**
 * @author Usuario
 *
 */
public class Split977Test {
	
	@Test
	public void testUnFicheroFacturacion(){
		String path = "D:/server/Test_F5";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("TEST_01");
			String[] f = {path + File.separator  + "COC02669.ENE"
					};
			sp.setFicheros(f);
			
			sp.setDetalleLlamadas(false);
			sp.setDetalleLlamadasRI(false);
			
			sp.setDirectorioOut(path);
			sp.execute();
			System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Test
	public void testVariosFicheroFacturacion(){
		String path = "D:/server/Test_F5";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("TEST_02");
			String[] f = {path + File.separator  + "COC02669.ENE"
					, path + File.separator  + "COC02670.ENE"
					};
			sp.setFicheros(f);
			
			sp.setDetalleLlamadas(false);
			sp.setDetalleLlamadasRI(false);
			
			sp.setDirectorioOut(path);
			sp.execute();
			System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	//CO[1].20110328.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip
	@Test
	public void testFicheroZipFacturacion(){
		String path = "D:/server/Test_F5";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("TEST_03");
			String[] f = {path + File.separator + "CO[1].20110328.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
//					, path + "COC02670.ENE"
					};
			sp.setFicheros(f);
			
			sp.setDetalleLlamadas(false);
			sp.setDetalleLlamadasRI(false);
			
			sp.setDirectorioOut(path);
			sp.execute();
			System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	@Test
	public void testVariosFicherosZipFacturacion(){
		String path = "D:/server/Test_F5";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("TEST_07");
			String[] f = {
					path + File.separator + "CO[1].20110328.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110328.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110228.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110228.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110128.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110128.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
//					, path + "COC02670.ENE"
					};
			sp.setFicheros(f);
			
			sp.setDetalleLlamadas(false);
			sp.setDetalleLlamadasRI(false);
			
			
//			String path = new java.io.File(".").getCanonicalPath();
			sp.setDirectorioOut(path);
			sp.execute();
			System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	

	@Test
	public void testVariosFicherosZipFacturacionEnOtroDisco(){
		String path = "V:/Clientes/u/UPCNET/REGs/REG_2011/FicherosF5";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("TEST_09");
			String[] f = {
					  path + File.separator + "CO[1].20110828.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110828.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
					
					, path + File.separator + "CO[1].20110728.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110728.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
					
					, path + File.separator + "CO[1].20110628.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110628.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
					
					, path + File.separator + "CO[1].20110528.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110528.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
					
					, path + File.separator + "CO[1].20110428.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110428.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
					
					, path + File.separator + "CO[1].20110328.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110328.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
					
					, path + File.separator + "CO[1].20110228.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110228.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
					
					, path + File.separator + "CO[1].20110128.LB61832119--012001.LB61832119.000-------_FACTEL5_977R.zip"
					, path + File.separator + "CO[1].20110128.LB61832119--102001.LB61832119.000-------_FACTEL5_977R.zip"
//					, path + "COC02670.ENE"
					};
			sp.setFicheros(f);
			
			sp.setDetalleLlamadas(false);
			sp.setDetalleLlamadasRI(false);
			
			sp.setDirectorioOut(path);
			sp.execute();
			System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	@Test
	public void testFicherosZipFacturacionEnUnDirectorio(){
		String path = "V:/Clientes/a/AJUNTAMENT_DE_LHOSPITALET/Regularizaciones/2012/REG_2012_2T";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("LHOSP_2012_2T");
			
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

	@Test
	public void testFicherosZipFacturacionAJGIRONA(){
		String path = "V:/Clientes/a/AJUNTAMENT_DE_GIRONA/REGs/2012/REG_2012_2T";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("AJGIRONA_2012_2T");
			
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
	@Test
	public void testFicherosZipFacturacionEnOtroDirectorio(){
		String path = "V:/Clientes/u/UNIVERSITAT DE BARCELONA/Regularizaciones/REG_Acuerdo_2012";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("TEST_11");
			
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

	@Test
	public void testFicherosZipFacturacionURV2012(){
		String path = "V:/Clientes/u/UNIVERSITAT ROVIRA I VIRGILI/REG_2012";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo(UtilNombre.nombreAcuerdoAleatorio());
			
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
				// Probando valores por defecto
				sp.setDirectorioOut(path);
				sp.execute();
				System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			}else{
				System.err.println("Sin ficheros a tratar...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//h/HOCATSACINCO_SA/TRABAJOS/2012/2012-04-23.Ficheros_F5

	@Test
	public void testFicherosZipFacturacionHOCATSACINCO(){
		String path = "V:/Clientes/h/HOCATSACINCO_SA/TRABAJOS/2012/2012-04-23.Ficheros_F5";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo(UtilNombre.nombreAcuerdoAleatorio());
			
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
				// Probando valores por defecto
				sp.setDirectorioOut(path);
				sp.execute();
				System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			}else{
				System.err.println("Sin ficheros a tratar...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFicherosZipFacturacionPCiTUdG(){
		String path = "V:/Clientes/p/ParcTecnologic/2012/2012-07/";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("PCiTUdG_2012_07");
			
			//!Importante: para poder obtener el nivel de las llamadas internacionales!
			sp.setDetalleLlamadas(true);
			sp.setDetalleLlamadasRI(true);
			
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
				// Probando valores por defecto
				sp.setDirectorioOut(path);
				sp.execute();
				System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			}else{
				System.err.println("Sin ficheros a tratar...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFicherosZipFacturacionURV(){
		String path = "V:/Clientes/u/UNIVERSITAT ROVIRA I VIRGILI/TRABAJOS/2012-06-01.RevisionInformativa6meses";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("URV_1111-0412");
			
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
				// Probando valores por defecto
				sp.setDirectorioOut(path);
				sp.execute();
				System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			}else{
				System.err.println("Sin ficheros a tratar...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFicherosZipFacturacionSPORTIUM(){
		String path = "V:/Clientes/c/CIRSA/TRABAJOS/2012/2012-05-21_Sportium_II";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("SPORTIUM_20120521");
			
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
				// Probando valores por defecto
				sp.setDirectorioOut(path);
				sp.execute();
				System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			}else{
				System.err.println("Sin ficheros a tratar...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public void testFicherosZipFacturacionAJGAVA(){
		String path = "V:/Clientes/a/AJUNTAMENT_DE_GAVA/TRABAJOS/2012-05-10.AnalisisREG2012";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("AJGAVA_20120511");
			
			sp.setFicherosZipPath(path);
	
			if(sp.getFicheros().length > 0 ){
				// Probando valores por defecto
				sp.setDirectorioOut(path);
				sp.execute();
				System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			}else{
				System.err.println("Sin ficheros a tratar...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void testFicherosZipFacturacionHCPB_2012_2T(){
		String path = "V:/Clientes/h/HOSPITAL CLINIC I PROVINCIAL DE BARCELONA/REGs/2012/REG_2012_2T";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("HCPB_2012_2T");
			
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
	
	@Test
	public void testFicherosZipFacturacionUDL_2012_1T(){
		String path = "V:/Clientes/u/UNIVERSITAT DE LLEIDA/REGs/2012/REG_2012_1T_Concurso_VOZ";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("UDL_2012_1T");
			
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
				sp.setDetalleLlamadas(true);
				sp.setDetalleLlamadasRI(true);
				
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
	
	@Test
	public void testFicherosZipFacturacionUDL_2012_2T(){
		String path = "V:/Clientes/u/UNIVERSITAT DE LLEIDA/REGs/2012/REG_2012_2T_Concurso_VOZ";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("UDL_2012_2T");
			
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
				sp.setDetalleLlamadas(true);
				sp.setDetalleLlamadasRI(true);
				
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


	@Test
	public void testFicherosZipFacturacionAJREUS_0711_0612(){
		String path = "V:/Clientes/a/AJUNTAMENT_DE_REUS/REGS/REG_0711-0612/Ficheros_F5";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("AJREUS_0711_0612");
			
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
	@Test
	public void testFicherosZipFacturacionAPB_2012_1S(){
		String path = "V:/Clientes/a/APB - AUTORITAT PORTUARIA DE BARCELONA/FACTURAS/2012-07";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("APB_2012_07");
			
			// OJO! Descomprimidos...
			sp.setFicherosZipPath(path);

			if(sp.getFicheros().length > 0 ){
				sp.setDetalleLlamadas(true);
				sp.setDetalleLlamadasRI(true);
				
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

	@Test
	public void testFicherosZipFacturacionCSC(){
		String path = "V:/Clientes/c/CSC_Computer Sciences/REGs/REG_2012_07";
		try {
			Split977 sp = new Split977();
			sp.setAcuerdo("CSC_2012_07");
			
			//!Importante: para poder obtener el nivel de las llamadas internacionales!
			sp.setDetalleLlamadas(true);
			sp.setDetalleLlamadasRI(true);
			
			sp.setFicherosZipPath(path);
	
			if(sp.getFicheros().length > 0 ){
				// Probando valores por defecto
				sp.setDirectorioOut(path);
				sp.execute();
				System.out.println("Se ha tardado:" + (sp.getTiempoEmpleado()/1000) + " segundos!");
			}else{
				System.err.println("Sin ficheros a tratar...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}


