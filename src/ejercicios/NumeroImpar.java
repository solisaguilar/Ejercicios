package ejercicios;

import java.util.Scanner;

public class NumeroImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;

        System.out.println("Ingrese un numero entero:");
        num1 = entrada.nextInt();

        if(num1 <= 0) {
            System.out.println("[Ingrese un numero positivo]");
        return;
        }

        for (int i = 1; i <= num1; i += 2){
            System.out.println(i);
        }
    }
}
