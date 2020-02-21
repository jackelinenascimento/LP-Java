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
public class lt01_33 {
    public static void lt01_33(){
        float numero, contador, soma;
        
        System.out.println("Digite um número: ");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextFloat();
        contador = 1;
        soma = 1;
        while(contador <= numero){
            if (contador == 1){
                contador ++;
                System.out.print("1");
            } else {
                System.out.print(" + 1/"+contador);
                soma = soma + 1/contador;
                contador ++;  
            }
        }
        System.out.print(" = "+soma);
    }
}
