package ClaseProg1;

public class promedio {
	
	public static double promedio(int a[]) {
		double promedio=0;
		for(int i=0;i<a.length;i++) {
			promedio+= a[i];
		}
		promedio= promedio/a.length;
		return promedio;
	}
	public static void main(String[] args) {
		int[] a= {6,9,1,3,4,7,8,7};
		double prom;
		prom = promedio(a);
		System.out.println("El promedio es: "+ prom);
	}			
}
