import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String clave="Juan";
		
		String pass="";
		
		while (clave.equals(pass)==false)
		{
		
			pass=JOptionPane.showInputDialog("Intoduce la contraseņa, por favor ");
			if (clave.equals(pass)==false)
			{
				System.out.println("Contraseņa Incorrecta");
			}
		}
		
	}

}
