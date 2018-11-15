/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB2-PC
 */
public class Operaciones {
    private int n1,n2;

    public Operaciones() {
    }

    public Operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public static void suma(){
        //int su = n1+n2;
        JOptionPane.showMessageDialog(null,"La suma es: "+(5+2));
    }
    public static int resta() {
       int res=8-4;
        return res;
    }
    public void multiplicacion() {
        JOptionPane.showMessageDialog(null,"La multiplicacion es: "+(5*2));
       
    }
    public int divicion() {
       int div=10/2;
        return div;
    }
}
