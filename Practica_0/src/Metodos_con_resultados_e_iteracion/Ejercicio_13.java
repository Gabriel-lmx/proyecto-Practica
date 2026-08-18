package Metodos_con_resultados_e_iteracion;

public class Ejercicio_13 {
        public static double factorial(int n){
            int factorial=1;
            if(n==0){
                return 1;
            }                    
            for (int i = n; i > 0; i--) {
                factorial*= i;
            }
            return factorial;
        }
    public static void main(String[] args) {
        System.out.println("Ejercicio 13");
        int numero=4;
        double factorial;
        factorial= factorial(numero);
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
}
