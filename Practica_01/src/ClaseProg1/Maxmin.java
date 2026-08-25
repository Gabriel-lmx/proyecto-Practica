package ClaseProg1;

public class Maxmin {
	
	public static int Maximo(int a[]) {
		int maximo= a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]>maximo) {
				maximo=a[i];
			}
		}		
		return maximo;
	}
	
	public static void main(String[] args) {
		//int[] a= new int[8];
		int[] a= {16,7,9,1,13,5,6,4};
		int max= Maximo(a);
		System.out.println("El maximo es: "+max);
	}
}
