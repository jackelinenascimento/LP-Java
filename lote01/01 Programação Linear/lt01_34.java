/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio101
 */
public class lt01_34 {
    public static void lt01_34(){
        int numero, n;
        
        System.out.println("***** TABUADA *****");
        System.out.println("Digite um número: ");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        n = 0;
        while (n <= 10){
            System.out.println(n + " * "+ numero + " = " + n*numero );
            n++;
        }
    }
    
}
