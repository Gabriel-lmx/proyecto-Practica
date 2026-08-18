package Cadenas;

public class Ejercicio_19 {
    public static char reemplazoLetra(char letra){
          switch (letra) {
            case 'á':
                return 'a';  
            case 'é':
                return 'e';      
            case 'í':
                return 'i'; 
            case 'ó':
                return 'o';  
            case 'ú':
                return 'u';       
            case 'ñ':
                return 'n';
            default:
                return letra;
        }
    }
    public static boolean esAbecedaria(String s){
        boolean resultado=false;
        char letra1,letra2;
        for (int i = 0; i < s.length()-1; i++) {
            letra1= reemplazoLetra(s.charAt(i));
            letra2= reemplazoLetra(s.charAt(i+1));          
            if(letra1<letra2){
                resultado= true;               
            }else{               
                return false;
            }            
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 19");
        String frase="ágil";
        System.out.println("El resultado es: "+ esAbecedaria(frase));
    }
}
