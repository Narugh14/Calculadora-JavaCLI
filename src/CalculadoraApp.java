import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora");

        System.out.println("Operador num1: ");
        int operador1 = Integer.parseInt(scan.nextLine());

        System.out.println("Operador num2: ");
        int operador2 = Integer.parseInt(scan.nextLine());

        int suma = operador1+operador2;
        System.out.println("El resultado es: "+ suma);
    }
}
