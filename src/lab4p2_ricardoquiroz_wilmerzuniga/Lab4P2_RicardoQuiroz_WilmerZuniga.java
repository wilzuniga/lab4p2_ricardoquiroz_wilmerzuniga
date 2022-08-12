package lab4p2_ricardoquiroz_wilmerzuniga;

import java.util.Scanner;

public class Lab4P2_RicardoQuiroz_WilmerZuniga {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        boolean ciclo = true;
        Object Tablero[][] = new Object[8][8];

        Iniciar(Tablero);
        impremarG(Tablero);

        while (ciclo == false) {
            System.out.println("-----------------------------------------------");
            System.out.println("Ingrese el nombre de el jugador uno: ");
            lea = new Scanner(System.in);
            String P1 = lea.nextLine();// Piezas blancas
            System.out.println("");

            System.out.println("Ingrese el nombre de el jugador uno: ");
            lea = new Scanner(System.in);
            String P2 = lea.nextLine();// Piezas negras
            System.out.println("");

        }

        /**
         *
         * @param tablero
         */
    }

    public static void Iniciar(Object Tablero[][]) {
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                Tablero[i][j]=" ";
            }
            System.out.println("");
            System.out.println("");
        }
    }

    public static void impremarG(Object[][] Tablero) {//IMPRESION + Mar
        System.out.println("");

        System.out.println("       A      B      C      D      E      F      G      H");
        System.out.println("");
        for (int i = 0; i < Tablero.length; i++) {
            System.out.print(i + 1 + "     ");
            for (int j = 0; j < Tablero[i].length; j++) {
                System.out.print("[" +Tablero[i][j] + "]" + "    ");
            }
            System.out.println("");
            System.out.println("");
        }

    }
}
