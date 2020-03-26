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
public class lt01_23 {
    public static void lt01_23(){
          int a, b, c, d;
        
        System.out.println("Digite 4 valores: ");
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        a = teclado.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        b = teclado.nextInt();
        
        if (b > a){
            System.out.println("Digite o terceiro valor: ");
            c = teclado.nextInt();
            
            if (c > b) {
                System.out.println("Digite o quarto valor: ");
                d = teclado.nextInt();
                
                if (d < a){
                    System.out.println(d + ", " + a + ", " + b + ", " + c);
                } else {
                    
                    if (d < b){
                        System.out.println(a + ", " + d + ", " + b + ", " + c);
                    } else {
                        
                        if (d < c) {
                            System.out.println(a + ", " + b + ", " + d + ", " + c);
                        } else {
                            System.out.println(a + ", " + b + ", " + c + ", " + d);
                        }
                    }
                }
                
            } else {
                System.out.println("Tente Novamente. Os primeiros três números "
                        + "devem estar em ordem crescente.");
            }
            
        } else {
            System.out.println("Tente Novamente. Os primeiros três números devem "
                    + "estar em ordem crescente.");
        }
    }
    
}

