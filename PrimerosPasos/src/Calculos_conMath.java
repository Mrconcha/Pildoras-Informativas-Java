
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double raiz= Math.sqrt(9);
	System.out.println(raiz);
		
    double num1=5.85;
    //Refundicion =convertir un tipo de dato en otro : Math.round (devuelve un dato de tipo long)
	int resultado= (int)Math.round(num1);
	System.out.println(resultado);
	
	double base= 5;
	double exponente=3;
	
	int resultado2 = (int)Math.pow(base, exponente);
	System.out.println(resultado2);
	
	
	}

}
