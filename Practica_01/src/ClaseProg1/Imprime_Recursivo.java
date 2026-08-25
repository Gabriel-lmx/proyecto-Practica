package ClaseProg1;

public class Imprime_Recursivo {
	public static void imprimir(int n) {
		if(n==1)
			System.out.println(n);
		else
			imprimir(n-1);
			System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimir(6);
	}

}
