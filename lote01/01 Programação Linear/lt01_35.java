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
public class lt01_35 {
    public static void lt01_35(){
        int numero1, numero2, auxiliar, soma;
        System.out.println("Digite o primeiro número: ");
        Scanner teclado = new Scanner(System.in);
        numero1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = teclado.nextInt();
        if (numero1 > numero2){
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }
        soma = 0;
        while (numero2 >= numero1){
            if(numero1 % 2 == 1){
                soma = soma + numero1;
            }
            numero1 ++;
        }
        System.out.println("O valor da soma dos números impares é: " + soma);
    }
    
}
