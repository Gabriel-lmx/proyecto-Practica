package ClaseProg1;

public class Ejercicio_recursion {
	
	public static int sumaDesdeUnoHastaN(int n) {
		if(n==0) {
			return 0;
		}else {
			return n + sumaDesdeUnoHastaN(n-1);
		}
	}
	public static void main(String[] args) {		
		int numero=3;
		System.out.println("La suma es: "+ sumaDesdeUnoHastaN(numero));
	}
}
