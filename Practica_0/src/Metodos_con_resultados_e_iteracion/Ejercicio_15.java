package Metodos_con_resultados_e_iteracion;

public class Ejercicio_15 {
    
    public static boolean esDivisible(int n, int m){
        if(n%m==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num1,num2;
        boolean resultado;
        num1=9;
        num2=2;
        resultado= esDivisible(num1, num2);
        System.out.println(num1+" es divisible por "+num2+"? : "+resultado);
    }
}
