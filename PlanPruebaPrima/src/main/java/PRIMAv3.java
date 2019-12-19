/**
 * 
 */

/**
 * @author EmilioMP
 *
 */
public class PRIMAv3 {
	private int tarifaBasica = 500;
	private int reduccionConductorSeguro = 0;
	private double factorEdad = 0;
//	private Scanner scan;
	private final int edadConductor;
	private final int puntos_licencia;
	/**
	 * @param edadConductor Edad del conductor
	 * @param puntos_licencia Puntos de licencia que posee el conductor
	 */
	public PRIMAv3(int edadConductor, int puntos_licencia) {
		this.edadConductor = edadConductor;
		this.puntos_licencia = puntos_licencia;
	}
		
	public int calcula_prima() {								
		System.out.println("Cálculo de Prima");
				
//			Scanner scan = new Scanner(System.in);
//			System.out.print("Edad del conductor: ");
//		    int edadConductor = scan.nextInt();
//		    System.out.print("Punto en licencia del conductor: ");
//		    int puntos_licencia = scan.nextInt();
//		    scan.close();
		    if(edadConductor<18 || edadConductor >90 || puntos_licencia<=0 || puntos_licencia>30) {
		    	System.out.println("No cumplen con los requisitos.");
		    	return -1;		    
		    }else {
		    	if(edadConductor<25) {
			    	factorEdad = 2.8;
			    	if((30 - puntos_licencia)<=1) {
			    		reduccionConductorSeguro = 50;
			    	}
			    }else if(edadConductor>=25 && edadConductor<35) {
			    	factorEdad = 1.8;
			    	if((30 - puntos_licencia)<=3) {
			    		reduccionConductorSeguro = 50;
			    	}
			    }else if(edadConductor>=35 && edadConductor<45) {
			    	factorEdad = 1.0;
			    	if((30 - puntos_licencia)<=5) {
			    		reduccionConductorSeguro = 100;
			    	}
			    }else if(edadConductor>=45 && edadConductor<65) {
			    	factorEdad = 0.8;
			    	if((30 - puntos_licencia)<=7) {
			    		reduccionConductorSeguro = 150;
			    	}
			    }else {
			    	factorEdad = 1.5;
			    	if((30 - puntos_licencia)<=5) {
			    		reduccionConductorSeguro = 200;
			    	}
			    }
			    
			    int prima = (int) ((tarifaBasica*factorEdad) - reduccionConductorSeguro);
			    
			    System.out.println("Prima: "+ prima);
			    return prima;
		    }		
	}
}
