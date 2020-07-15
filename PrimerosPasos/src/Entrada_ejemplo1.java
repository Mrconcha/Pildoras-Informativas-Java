import java.util.Scanner;


public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner entrada= new Scanner(System.in);	
	 
	 System.out.println("Introduce tu Nombre, por favor ");
	 
	 String nombre_usuario=entrada.nextLine();
	 
	 System.out.println("Introduce tu Edad, por favor ");
	 
	 int edad=entrada.nextInt();
	 	 
	 System.out.println("Hola tu nombre es "+nombre_usuario+" y tu edad es "+edad);
	}

}
