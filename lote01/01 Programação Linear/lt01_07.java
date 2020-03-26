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
public class lt01_07 {
    public static void lt01_07(){
    
        System.out.println("*** VOLUME PARALELEPIPEDO ***");
        
        System.out.println("Digite o comprimento: ");
        Scanner teclado = new Scanner(System.in);
        float comp = teclado.nextFloat();
        
        System.out.println("Digite a largura: ");
        float larg = teclado.nextFloat();
        
        System.out.println("Digite a altura: ");
        float alt = teclado.nextFloat();
        
        float volume = comp * larg * alt;
        
        System.out.println("O valor do volume do paralelepipedo é: " + volume);
        
    }
    
}
