import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------Calculadora--------------");
        //Mostramos el menu
        System.out.println("""
                1.Suma
                2.Resta
                3.Multiplicacion
                4.Division
                5.Salir
                """);
        System.out.println("La operacion a realizar es: ");
        int NumOpe = Integer.parseInt(scan.nextLine());
        //Revisar que exista dentro de las opciones
        if(NumOpe >= 1 && NumOpe <= 4) {

            System.out.println("Operador num1: ");
            int operador1 = Integer.parseInt(scan.nextLine());

            System.out.println("Operador num2: ");
            int operador2 = Integer.parseInt(scan.nextLine());
            int resul;

            switch (NumOpe){
                //Operacion de suma
                case 1 ->{
                    resul = operador1 + operador2;
                    System.out.println("Resultado de la Suma: " + resul);
                }
                //Operacion de resta
                case 2 ->{
                    resul = operador1 - operador2;
                    System.out.println("Resultado de la resta: " + resul);
                }
                //Operacion de multiplicacion
                case 3 -> {
                    resul = operador1 * operador2;
                    System.out.println("Resultado de la multiplicacion: " + resul);
                }
                //Operacion de division
                case 4 -> {
                    resul = operador1 / operador2;
                    System.out.println("Resultado de la division: " + resul);
                }
            }
        }
        else if(NumOpe == 5){
            System.out.println("Exit....");
        }else {
            System.out.println("Opcion incorrecta");
        }


    }
}
