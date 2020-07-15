import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu mombre ");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad ");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("Hola "+nombre_usuario+ " Tienes "+edad+ " años");
	}

}
