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
public class lt01_18 {
    public static void lt01_18(){
          int x,y,dif;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro número: ");
        x = teclado.nextInt();
        
        System.out.println("Digite o valor do segundo número: ");
        y = teclado.nextInt();
        
        dif = (x>y)?x-y:y-x; // operador ternario
        
        System.out.println("O valor da diferença do maior pelo menor número é: " + dif);
    }
    
}
