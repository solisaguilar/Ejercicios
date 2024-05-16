package ejercicios;

import java.util.Scanner;

public class ElementosQuimicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[8];

        for(int i = 7; i >= 0; i-- ) {
            System.out.println("Escriba el nombre del elemento [" + i + "]");
            nombres[i] = entrada.next();
        }
       System.out.println("");
        for (int i = 7; i >= 0; i--){
            System.out.println("[" + i + "]" + nombres + ",");
        }
    }
}
