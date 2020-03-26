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
public class lt01_09 {
    public static void lt01_09(){
         System.out.println("*** SOMA DO QUADRADO DE DOIS NÚMEROS ***");
        
        System.out.println("Digite o valor do primeiro número: ");
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();
       
        System.out.println("Digite o valor do segundo número: ");
        int numero2 = teclado.nextInt();
        
        int soma = numero1*numero1 + numero2*numero2;
        
        System.out.println("A soma dos seus quadrados é: " + soma);
    }
    
}
