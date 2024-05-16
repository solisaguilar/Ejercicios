package ejercicios;


import java.util.Scanner;

public class SueldoEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su sueldo1: ");
        double sueldo = entrada.nextDouble();

        double descuento = 0.0;

        if ( sueldo < 500){
            descuento = 0.0;
        }
        else if (sueldo >= 500 && sueldo < 750) {
            descuento = sueldo * 0.05;
        } else {
            descuento = sueldo * 0.10;
        }

        System.out.println("Monto a descontar" + descuento);
    }
}
