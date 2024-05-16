package ejercicios;

import java.util.Scanner;

public class PartidosGanados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        int ganados = 3;
        int empatados = 1;
        int perdidos = 0;

        System.out.println("Partidos ganados (Puntos)");
        ganados = entrada.nextInt();
        System.out.println("Partidos empatados (Puntos)");
        empatados = entrada.nextInt();

        System.out.println("Partidos perdidos (nee)");
        perdidos = entrada.nextInt();

        int puntajeTotal = (ganados * 3) + (empatados * 1) + (perdidos * 0);

        System.out.println();
        System.out.println("El puntaje total es:" + puntajeTotal);
    }
}
