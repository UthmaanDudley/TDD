/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testdrivendevelopment;

/**
 *
 * @author Moegamad Nur Duncan 220014442
 */
public class KeyB {
    public String Serialn, color, Keyn;

    public String getSerialn() {
        return Serialn;
    }

    public void setSerialn(String Serialn) {
        this.Serialn = Serialn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKeyn() {
        return Keyn;
    }

    public void setKeyn(String Keyn) {
        this.Keyn = Keyn;
    }

    @Override
    public String toString() {
        return "KeyB{" + "Serialn=" + Serialn + ", color=" + color + ", Keyn=" + Keyn + '}';
    }
    
}