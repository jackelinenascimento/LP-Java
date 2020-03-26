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
public class lt01_24 {
    public static void lt01_24(){
           int x;
        
        System.out.println("Digite um número: ");
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        
        if (x%2 == 0 && x%3 == 0) {
            System.out.println("O número " + x + " é divisivel por 2 e por 3.");
        } else {
            System.out.println("O número não é divisivel por 2 e por 3.");
        }
    }
    
}

