import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double numero, resultado;
        int contador;
        Scanner scan = new Scanner(System.in);
        try {
            for ( contador = 1 ; contador <=4 ; contador ++ ) {
                System.out.println("Ingrese un número de 10 cifras: ");
                numero = scan.nextDouble();
                if (numero > 999999999) {
                    resultado = Math.pow(numero, 4);
                    System.out.println("El resultado de elevar el número " + numero + " a la 4 es: " + resultado);
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
       
    }
}