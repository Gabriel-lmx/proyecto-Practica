package ClaseProg1;

public class Recursion {
	public static int fib(int n) { 
	    return n < 2 ? n : fib(n-1) + fib(n-2);
		
	}
	public static void main(String[] args) {
	
		for(int n=0; n<=20; ++n) {
			System.out.println( n + " −> " + fib(n) );
	    }
	}
}
