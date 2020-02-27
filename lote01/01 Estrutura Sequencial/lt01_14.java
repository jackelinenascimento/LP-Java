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
public class lt01_14 {
    public static void lt01_14(){
         System.out.println("*** TERCEIRO ANGULO ***");
        
        System.out.println("Digite o valor do primeiro angulo: ");
        Scanner teclado = new Scanner(System.in);
        float primeiroAngulo = teclado.nextFloat();
        
        System.out.println("Digite o valor do segundo angulo: ");
        float segundoAngulo = teclado.nextFloat();
        
        float terceiroAngulo = (float) (180.0 - primeiroAngulo - segundoAngulo);
        
        System.out.println("O valor do terceiro angulo é: " + terceiroAngulo + " graus.");
        
    }
    
}
