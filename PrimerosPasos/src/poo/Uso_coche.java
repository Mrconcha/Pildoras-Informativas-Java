package poo;
import javax.swing.*;
public class Uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		//Nomenclatura:  La Clase + nuevo objeto = new + nombre del constructor
		
		/*Coche Renault = new Coche();      // instanciar una clase
		
	
		System.out.println(Renault.dime_largo());
		
	    Renault.establece_color1();
	     System.out.println(Renault.dime_color());
	    */
		
		
	    // pasando parametro
	    Coche micoche= new Coche();
	    
		//  micoche.establece_color2("Amarillo");
	    micoche.establece_color2(JOptionPane.showInputDialog("Introduce color" ));

	    System.out.println(micoche.dime_color());
	    
	    System.out.println(micoche.dime_datos_generales());

	    // micoche.configura_asientos("si");	    
	    micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero"));
	    System.out.println(micoche.dime_asientos());
	    
	    // micoche.configura_climatizador("si");
	    micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene asientos de climatizador "));
	    System.out.println(micoche.dime_climatizador());
	    
	    System.out.println(micoche.dime_peso_coche());
	    System.out.println("Precio final del coche "+micoche.precio_coche());
	}

}


