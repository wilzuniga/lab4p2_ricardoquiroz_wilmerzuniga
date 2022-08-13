package lab4p2_ricardoquiroz_wilmerzuniga;

import java.util.Scanner;

public class Lab4P2_RicardoQuiroz_WilmerZuniga {

    static Scanner lea = new Scanner(System.in);
    
//querido Nuila, no esta completo pero es un trajo completo. En main no hay nada, pero las clases estan validadas y completas

    
    public static void main(String[] args) {
        boolean ciclo = true;
        Object Tablero[][] = new Object[8][8];

        Iniciar(Tablero);
        
        
        System.out.println("La palabra jaque mate proviene de las palabras persas sha mat, que significan -El rey ha fallecido- ");

        System.out.println("-----------------------------------------------");
        System.out.println("Ingrese el nombre de el jugador uno: ");
        lea = new Scanner(System.in);
        String P1 = lea.nextLine();// Piezas blancas
        System.out.println("");

        System.out.println("Ingrese el nombre de el jugador uno: ");
        lea = new Scanner(System.in);
        String P2 = lea.nextLine();// Piezas negras
        System.out.println("");
        
        while (ciclo == true) {
            
            
            impremarG(Tablero);
            
            System.out.println("Ubi actual: ");
            lea = new Scanner(System.in);
            String uniactual = lea.nextLine();// Piezas negras
            System.out.println("");
            
            System.out.println("Destinp: ");
            lea = new Scanner(System.in);
            String Destinp = lea.nextLine();// Piezas negras
            System.out.println("");
            
            //Object tgh = Pieza.Movimiento(uniactual, Destinp, Tablero) ;
            //System.out.println(((Pieza)(Tablero[1][0])).Movimiento(uniactual, Destinp, Tablero));
            //Tablero=(((Pieza)(Tablero[1][0])).Mover(uniactual, Destinp, Tablero));


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
//            System.out.println("");
//            System.out.println("");
        }
        
        Tablero[0][0]= new Torre(0, 0, 'r');
        Tablero[0][7] = new Torre(0, 7, 'r');

        Tablero[0][1] = new Caballo( 0, 1, 'n');
        Tablero[0][6] = new Caballo(0, 6, 'n');
        
        Tablero[0][2] = new Alfil(0, 2, 'b');
        Tablero[0][5] = new Alfil(0, 5, 'b');
        
        Tablero[0][4] = new Dama(0, 3, 'q');

        Tablero[0][3] = new Rey(0, 4, 'k');
        
        for (int i = 0; i < 8; i++) {
            Tablero[1][i] = new Peon(1, i, 'p');

        }
        
        Tablero[7][0] = new Torre(7, 0, 'R');
        Tablero[7][7] = new Torre(7, 7, 'R');

        Tablero[7][1] = new Caballo(7, 1, 'N');
        Tablero[7][6] = new Caballo(7, 6, 'N');

        Tablero[7][2] = new Alfil(7, 2, 'B');
        Tablero[7][5] = new Alfil(7, 5, 'B');

        Tablero[7][4] = new Dama(7, 4, 'Q');

        Tablero[7][3] = new Rey(7, 3, 'K');

        for (int i = 0; i < 8; i++) {
            Tablero[6][i] = new Peon(6, i, 'P');

        }



        
    }

    public static void impremarG(Object[][] Tablero) {//IMPRESION + Mar
        System.out.println("");

        System.out.println("       A      B      C      D      E      F      G      H");
        System.out.println("");
        for (int i = 0; i < Tablero.length; i++) {
            System.out.print(i  + "     ");
            for (int j = 0; j < Tablero[i].length; j++) {
                if(Tablero[i][j] instanceof Torre){
                    System.out.print("[" +((Torre) Tablero[i][j]).getRep()+ "]" + "    ");
                }else if(Tablero[i][j] instanceof Caballo){
                    System.out.print("[" + ((Caballo) Tablero[i][j]).getRep() + "]" + "    ");

                }else if(Tablero[i][j] instanceof Alfil){
                    System.out.print("[" + ((Alfil) Tablero[i][j]).getRep() + "]" + "    ");

                }else if(Tablero[i][j] instanceof Dama){
                    System.out.print("[" + ((Dama) Tablero[i][j]).getRep() + "]" + "    ");

                }else if(Tablero[i][j] instanceof Rey){
                    System.out.print("[" + ((Rey) Tablero[i][j]).getRep() + "]" + "    ");

                }else if(Tablero[i][j] instanceof Peon){
                    System.out.print("[" + ((Peon) Tablero[i][j]).getRep() + "]" + "    ");

                }else{
                    System.out.print("[" + Tablero[i][j] + "]" + "    ");

                }
            }
            System.out.println("");
            System.out.println("");
        }

    }
}
