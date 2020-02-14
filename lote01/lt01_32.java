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
public class lt01_32 {
    public static void lt01_32(){
        
        int numero, fatorial;
        fatorial = 1;
        
        System.out.println("*** FATORIAL ***");
        System.out.println("Digite um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        
        if (numero > 0){
            for (int i = 1; i <= numero; i++){
                fatorial = fatorial * i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        } else {
            System.out.println("Não existe fatorial de numeros menores que 1");
        }
        
       
    }
}
