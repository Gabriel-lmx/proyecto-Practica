package Cadenas;

public class Ejercicio_21 {
	
	public static boolean esSinRepetidos(String s) {
		for(int i=0; i<s.length();i++) {
			for(int j=i+1; j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
    public static void main(String[] args) {
        System.out.println("Ejercicio 21");
        String frase="chau joni";
        System.out.println("No hay repetidos en la frase: "+esSinRepetidos(frase));       
    }
}
