
public class manipulas_cadenasII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String frase="Hoy es un estupendo dia para aprender a programa en Java";
                
  
  String frase_resumen=frase.substring(1, 3);
  
                                      // 1ra pósicion inicial de extranccion
                                      // 1ra posicion que no quieres extrer
                                      // se cuenta desde 0
  
  System.out.println(frase_resumen);
  
  String frase_resumen2=frase.substring(29, 56);
    System.out.println(frase_resumen2);
	}

}
