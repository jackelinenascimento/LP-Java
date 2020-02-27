/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author Laboratorio101
 */
public class lt01_11 {
    public static void lt01_11(){
        System.out.println("*** COMPRIMENTO DE CIRCUNFERÊNCIA ***");
        Scanner r = new Scanner(System.in);
        float raio = r.nextFloat();
        
        double comprimento = 2 * raio * Math.PI;
        
        System.out.println("O valor do comprimento é: " + comprimento);
    }
    
}
