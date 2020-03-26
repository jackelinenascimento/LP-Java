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
public class lt01_06 {
    public static void lt01_06(){
        System.out.println("Digite o valor de x: ");
        Scanner teclado = new Scanner(System.in);
        float x = teclado.nextFloat();
        
        System.out.println("Digite o valor de y: ");
        float y = teclado.nextFloat();
        
        float aux;
        
        aux = x;
        x = y;
        y = aux;
        
        System.out.println("Os novos valores de x e y, respectivamente, são: " + x + " e " + y);
    }
    
}
