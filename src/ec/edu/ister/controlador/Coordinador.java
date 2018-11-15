/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Operaciones;
import java.util.Scanner;

/**
 *
 * @author LAB2-PC
 */
public class Coordinador {
    Scanner entrada=new Scanner(System.in);
    Operaciones objOperaciones=new Operaciones();
    
    public void opcionesMenu(){
                    System.out.println("Ingresa una opcion:\n"
                    + "1.- Suma(met clase)\n"
                    + "2.- Resta(met clase)\n"
                    + "3.- Muliplicacion(met instancia)\n"
                    + "4.- División(met instancia)\n"
                    + "5.- Salir\n");

    }
    
    public void menuScanner(){
        int op=0;
        do{
            opcionesMenu();
            op=entrada.nextInt();
            switch(op){
                case 1:
                    Operaciones.suma();
                    break;
                case 2:
                    System.out.println("la resta es: "+Operaciones.resta());
                    break;
                case 3:
                    objOperaciones.multiplicacion();
                    break;
                 case 4:
                     System.out.println("La division es: "+objOperaciones.divicion());
                    break;
            }
            
        }while(op!=5);
    }
    
}
