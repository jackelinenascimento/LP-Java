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
public class lt01_03 {
    
    public static void lt01_03(){
        System.out.println("Digite o valor da base do triângulo: ");
        Scanner teclado = new Scanner(System.in);
        float base = teclado.nextFloat();
        
        System.out.println("Digite o valor da altura do triângulo: ");
        float altura = teclado.nextFloat();
        
        float area = base * altura / 2;
        
        System.out.println("O valor da área do triângulo é: " + area);
        
    }
    
}

