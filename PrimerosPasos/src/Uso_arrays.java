
public class Uso_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] mi_matriz = new int[5]; 
		mi_matriz [0]=5;
		mi_matriz [1]=38;
		mi_matriz [2]=-15;
		mi_matriz [3]=92;
		mi_matriz [4]=71;
		
		for (int i=0;i<mi_matriz.length;i++)
		{
		System.out.println(mi_matriz[i]);
		}
		
			
		int mi_matriz2 []= {12,-22,23,855,554};
		
/*		for (int i=0;i<mi_matriz2.length;i++)
		{
		System.out.println(mi_matriz2[i]);
		}
		
	*/
		
		for(int elemento:mi_matriz2)
		{
			System.out.println(elemento);
		}
		
	}

}
