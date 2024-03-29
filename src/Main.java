/*
 * 10. Ingresar un número y validar que sea positivo.
 * Si no lo es continuar solicitándolo al usuario hasta que ingrese un número correcto.
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese un número. Validaré que su número sea POSITIVO...");
        Scanner input = new Scanner(System.in);
        Integer numeroIngresado = input.nextInt();

        while(numeroIngresado<=0){
            System.out.println("Debe ingresar un numero POSITIVO...");
            numeroIngresado = input.nextInt();
        }
        System.out.println("Finalmente! El número que ingresó es positivo! :)");
    }
}