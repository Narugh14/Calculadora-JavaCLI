import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------Calculadora--------------");
        while(true){
        MostrarMenu();
            try {
                int NumOpe = Integer.parseInt(scan.nextLine());
                //Revisar que exista dentro de las opciones
                if (NumOpe >= 1 && NumOpe <= 4) {
                    Operacion(NumOpe,scan);
                } else if (NumOpe == 5) {
                    System.out.println("Exit....");
                    break;
                } else {
                    System.out.println("Opcion incorrecta");
                }
                System.out.println();
            }//Fin Try
            catch (Exception e){
                    System.out.println("Error fue"+e.getMessage());
            }//Fin catch

        }//Fin Bucle-While
    }//Fin de main

    private static void MostrarMenu(){
        //Mostramos el menu
        System.out.println("""
                1.Suma
                2.Resta
                3.Multiplicacion
                4.Division
                5.Salir
                """);
        System.out.println("La operacion a realizar es: ");
    }

    private static void Operacion(int operacion, Scanner consola){
        System.out.println("Operador num1: ");
        double operador1 = Double.parseDouble(consola.nextLine());

        System.out.println("Operador num2: ");
        double operador2 = Double.parseDouble(consola.nextLine());
        double resul;

        switch (operacion) {
            //Operacion de suma
            case 1 -> {
                resul = operador1 + operador2;
                System.out.println("Resultado de la Suma: " + resul);
            }
            //Operacion de resta
            case 2 -> {
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

}//Fin Class
