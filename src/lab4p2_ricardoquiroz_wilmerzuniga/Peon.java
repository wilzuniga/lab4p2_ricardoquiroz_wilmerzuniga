/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_ricardoquiroz_wilmerzuniga;

import java.util.StringTokenizer;

/**
 *
 * @author rjqer
 */
public class Peon extends Pieza{

    public Peon() {
    }

    public Peon(int posx, int posy, char rep) {
        super(posx, posy, rep);
    }
    
    public boolean Movimiento(String ubiactual, String destino, Object tablero){
        char X1 = ubiactual.charAt(0);
        char Y1 = ubiactual.charAt(1);
        int x1, y1;
        
        char X2 = destino.charAt(0);
        char Y2 = destino.charAt(1);
        int x2, y2;
        //ubiactual
        switch(X1){
            case 'a', 'A':{
                x1=0;
                y1=Integer.parseInt(Y1+"");
            }
            break;
            case 'b', 'B':{
                x1=0;
                y1=Integer.parseInt(Y1+"");
            }
            break;
            case 'c', 'C':{
                x1=0;
                y1=Integer.parseInt(Y1+"");
            }
            break;
            case 'd', 'D':{
                x1=0;
                y1=Integer.parseInt(Y1+"");
            }
            break;
            case 'e', 'E':{
                x1=0;
                y1=Integer.parseInt(Y1+"");
            }
            break;
            case 'f', 'F':{
                x1=0;
                y1=Integer.parseInt(Y1+"");
            }
            break;
            case 'g', 'G':{
                x1=0;
                y1=Integer.parseInt(Y1+"");
            }
            break;
            case 'h', 'H':{
                x1=0;
                y1=Integer.parseInt(Y1+"");
            }
            break;
            
            //destino
            switch(X2){
            case 'a', 'A':{
                x2=0;
                y2=Integer.parseInt(Y1+"");
            }
            break;
            case 'b', 'B':{
                x2=0;
                y2=Integer.parseInt(Y1+"");
            }
            break;
            case 'c', 'C':{
                x2=0;
                y2=Integer.parseInt(Y1+"");
            }
            break;
            case 'd', 'D':{
                x2=0;
                y2=Integer.parseInt(Y1+"");
            }
            break;
            case 'e', 'E':{
                x2=0;
                y2=Integer.parseInt(Y1+"");
            }
            break;
            case 'f', 'F':{
                x2=0;
                y2=Integer.parseInt(Y1+"");
            }
            break;
            case 'g', 'G':{
                x2=0;
                y2=Integer.parseInt(Y1+"");
            }
            break;
            case 'h', 'H':{
                x2=0;
                y2=Integer.parseInt(Y1+"");
            }
            break;
            
            if(tablero[x1][y1] instanceof Peon) {
                if (Math.abs(y2-y1) == 1) {
                    if (tablero[x2][y2] == " ") {
                        tablero[x2][y2] = new Peon(x2, y2, '');
                        if (((Peon)(tablero[x1][y1])).getRep() == 'p') {
                            tablero[x2][y2] = new Peon(x2, y2, 'p');
                            tablero[x1][y1] = new Peon(x2, y2, 'p');

                        }
                        else{
                            tablero[x2][y2] = new Peon(x2, y2, 'P');
                        }
                    }
                    else{
                        
                    }
                }
            }
            
        }
    
    
    
    
}
