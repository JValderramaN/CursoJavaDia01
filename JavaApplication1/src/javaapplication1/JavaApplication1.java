/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import nuevoPaquete.ClaseDos;

/**
 *
 * @author Nazareth
 */
public class JavaApplication1 {

    private int contador;
    
    
    public static void main(String[] args) {

        JavaApplication1 jp1 = new JavaApplication1();
        
        for (jp1.contador = 0; jp1.contador < 10; jp1.contador++) {
            System.out.println("imprimiendo el contador \n"+jp1.contador);
        }

        
        ClaseDos cd1 = new ClaseDos();
        System.out.println("atributos claseDos "+cd1.otraCosa);
        
        ClaseTres ct1 = new ClaseTres();
        System.out.println("atributos claseTres "+ct1.prot);
        System.out.println("atributos claseTres "+ct1.j);
        
       
        
    }

}
