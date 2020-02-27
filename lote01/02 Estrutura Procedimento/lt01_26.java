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
public class lt01_26 {
    public static void lt01_26(){
        int numero1, numero2;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = teclado.nextInt();
        
        if (numero1 > numero2){
            System.out.println("O maior número digitado é: " + numero1);
            if (numero1%numero2 == 0){
                System.out.println("O primeiro número é multiplo do segundo número digitado.");
            } else {
                System.out.println("O primeiro número não é multiplo do segundo número digitado.");
            }
        } else if (numero2 > numero1) {
            System.out.println("O maior número digitado é: " + numero2);
            if (numero2 % numero1 == 0){
                System.out.println("O segundo número é multiplo do primeiro número digitado.");
            } else {
                System.out.println("O segundo número não é multiplo do primeiro número digitado.");
            }
        } else {
            System.out.println("Os números digitados são iguais.");
        }
        
    }
    
}
