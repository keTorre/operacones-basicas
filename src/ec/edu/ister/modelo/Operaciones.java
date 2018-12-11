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
    double a, b,ct; 
    String bt="";     

    public Operaciones() {
    }

    public Operaciones(int n1, int n2) {
        this.a = n1;
        this.b = n2;
    }
    
    public Double suma(){  
      a= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));         	
      b= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
      ct= a+b;
      JOptionPane.showInputDialog("La Suma Es: "+ String.valueOf(ct));               
        return ct;
    }
    
    public Double resta(){
      String bt="";     
      a= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));         	
      b= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
      ct= a-b;
      JOptionPane.showInputDialog("La Resta Es: "+ String.valueOf(ct));               
      return ct;   
    }
        
     public Double multiplicacion(){
      a= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));         	
      b= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
      ct= a*b;
      JOptionPane.showInputDialog("La Resta Es: "+ String.valueOf(ct));               
      return ct;   
    }
        
     public Double division(){
      a= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));         	
      b= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
      ct= a/b;
      JOptionPane.showInputDialog("La Division Es: "+ String.valueOf(ct));               
      return ct;   
    }
     
}
