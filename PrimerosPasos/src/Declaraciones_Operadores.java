
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b;
		
		b=7;
		
	/*	int c=b+a;
		
		System.out.println(c);
		
        c-=6;
		
		System.out.println(c);
		*/
		
		double c=b/a;
		
		System.out.println(c);
		
		
		// final -> define una constante
		final double d=2.54;
		double cm=6;
		
		double resultado=cm/d;
		
		
		System.out.println("En "+cm+" cm hay "+resultado+" pulgadas");
		
		int operador1,operador2,resultados;
				
		operador1=8;
		operador2=7;
		resultados=operador1+operador2;
		System.out.println(resultado);
		
		double base=5;
		double exponente=3;
		
		int resultado1=(int)Math.pow(base, exponente);
		System.out.println("El resultado de "+base+" elevado a "+exponente +" es "+resultado1);
	}

}
