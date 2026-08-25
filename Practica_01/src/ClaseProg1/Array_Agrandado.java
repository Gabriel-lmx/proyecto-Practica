package ClaseProg1;
import java.lang.reflect.Array;
import java.util.Iterator;

public class Array_Agrandado {
	
	public static double[] Agranda(double num, double a[] ) {
		double[] c= new double[a.length+1];
		for(int i=0;i<a.length;i++) {
			c[i]= a[i];
		}
		c[c.length-1]=num;
		mostrar(c);
		return a;
	}
	
	public static void mostrar(double a[]) {
		for(int i=0; i< a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void cargar(double a[]) {
		for(int i=0; i< a.length;i++) {
			a[i]=i;
		}
	}
	public static void main(String[] args) {
		double [] a= new double [3];
		int cant=5;
		cargar(a);
		a= Agranda(cant, a);		
	}
}
