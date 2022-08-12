/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_ricardoquiroz_wilmerzuniga;

/**
 *
 * @author rjqer
 */
public abstract class Pieza {
    
    protected int posx, posy;
    protected char rep;
     
    public Pieza() {
    }

    public Pieza(int posx, int posy, char rep) {
        this.posx = posx;
        this.posy = posy;
        this.rep = rep;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getRep() {
        return rep;
    }

    public void setRep(char rep) {
        this.rep = rep;
    }
    
    public abstract boolean Movimiento(String ubiactual, String destino, Object tablero[][]);
    
}
