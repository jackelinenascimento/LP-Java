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
public class lt01_20 {
    public static void lt01_20(){
          float a, b, c, delta, x1, x2;
        
        System.out.println("*** EQUAÇÃO DO 2º GRAU ***");
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = teclado.nextFloat();
        
        System.out.println("Digite o valor de B: ");
        b = teclado.nextFloat();
        
        System.out.println("Digite o valor de C: ");
        c = teclado.nextFloat();
        
        delta = (b*b) - (4*a*c);
        
        if (delta >= 0){
            x1 = (float) ((-b + Math.sqrt(delta))/2*a);
            System.out.println("Valor de x1: " + x1);
            x2 = (float) ((-b - Math.sqrt(delta))/2*a);
            System.out.println("Valor de x2: " + x2);
        } else {
            System.out.println("Não existe raiz real para os coeficientes informados.");
        }
        
        
    }
    
}

