package lab4p2_ricardoquiroz_wilmerzuniga;

import java.util.StringTokenizer;

/**
 *
 * @author rjqer
 */
public class Peon extends Pieza {

    public Peon() {
    }

    public Peon(int posx, int posy, char rep) {
        super(posx, posy, rep);
    }

    @Override
    public boolean Movimiento(String ubiactual, String destino, Object tablero[][]) {
        boolean coso = false;
        char X1 = ubiactual.charAt(0);
        char Y1 = ubiactual.charAt(1);
        int x1 = 0, y1 = 0;

        char X2 = destino.charAt(0);
        char Y2 = destino.charAt(1);
        int x2 = 0, y2 = 0;
        //ubiactual
        switch (X1) {
            case 'a', 'A': {
                x1 = 0;
                y1 = Integer.parseInt(Y1 + "");
                System.out.println(y1);
            }
            break;
            case 'b', 'B': {
                x1 = 1;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'c', 'C': {
                x1 = 2;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'd', 'D': {
                x1 = 3;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'e', 'E': {
                x1 = 4;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'f', 'F': {
                x1 = 5;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'g', 'G': {
                x1 = 6;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'h', 'H': {
                x1 = 7;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;

        }

        //destino
        switch (X2) {
            case 'a', 'A': {
                x2 = 0;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'b', 'B': {
                x2 = 1;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'c', 'C': {
                x2 = 2;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'd', 'D': {
                x2 = 3;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'e', 'E': {
                x2 = 4;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'f', 'F': {
                x2 = 5;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'g', 'G': {
                x2 = 6;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'h', 'H': {
                x2 = 7;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;

        }

        if (((char)(tablero[x1][y1])) == 'p' || ((char)(tablero[x1][y1])) == 'P'  ) {
            if (Math.abs(y2 - y1) == 1) {
                if (tablero[x2][y2] == " ") {
                    if (((Peon) (tablero[x1][y1])).getRep() == 'p') {
                        tablero[x2][y2] = new Peon(x2, y2, 'p');
                        tablero[x1][y1] = " ";
                        coso = true;
                        //System.out.println("opcion 1");

                    } else {
                        tablero[x2][y2] = new Peon(x2, y2, 'P');
                        tablero[x1][y1] = " ";
                        coso = true;
                        //System.out.println("opcion 2");

                    }
                } else {
                    coso = false;
                    //System.out.println("opcion 3");

                }
            }else{
                //System.out.println("opcion 4");

            }
        }else{
                //System.out.println("opcion 5");

            }
        return coso;
    }
    
    
    
    public Object[][] Mover(String ubiactual, String destino, Object tablero[][]) {
        Object Tablero[][] = tablero;

        char X1 = ubiactual.charAt(0);
        char Y1 = ubiactual.charAt(1);
        int x1 = 0, y1 = 0;

        char X2 = destino.charAt(0);
        char Y2 = destino.charAt(1);
        int x2 = 0, y2 = 0;
        //ubiactual
        switch (X1) {
            case 'a', 'A': {
                x1 = 0;
                y1 = Integer.parseInt(Y1 + "");
                System.out.println(y1);
            }
            break;
            case 'b', 'B': {
                x1 = 1;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'c', 'C': {
                x1 = 2;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'd', 'D': {
                x1 = 3;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'e', 'E': {
                x1 = 4;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'f', 'F': {
                x1 = 5;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'g', 'G': {
                x1 = 6;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'h', 'H': {
                x1 = 7;
                y1 = Integer.parseInt(Y1 + "");
            }
            break;

        }

        //destino
        switch (X2) {
            case 'a', 'A': {
                x2 = 0;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'b', 'B': {
                x2 = 1;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'c', 'C': {
                x2 = 2;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'd', 'D': {
                x2 = 3;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'e', 'E': {
                x2 = 4;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'f', 'F': {
                x2 = 5;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'g', 'G': {
                x2 = 6;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;
            case 'h', 'H': {
                x2 = 7;
                y2 = Integer.parseInt(Y1 + "");
            }
            break;

        }

        if (((char) (tablero[x1][y1])) == 'p' || ((char) (tablero[x1][y1])) == 'P') {
            if (Math.abs(y2 - y1) == 1) {
                if (tablero[x2][y2] == " ") {
                    if (((Peon) (tablero[x1][y1])).getRep() == 'p') {
                        Tablero[x2][y2] = new Peon(x2, y2, 'p');
                        Tablero[x1][y1] = " ";
                        //System.out.println("opcion 1");

                    } else {
                        Tablero[x2][y2] = new Peon(x2, y2, 'P');
                        Tablero[x1][y1] = " ";
                        //System.out.println("opcion 2");

                    }
                } else {
                    //System.out.println("opcion 3");

                }
            } else {
                //System.out.println("opcion 4");

            }
        } else {
            //System.out.println("opcion 5");

        }
        return Tablero;
    }

}
