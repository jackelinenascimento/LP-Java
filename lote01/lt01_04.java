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
public class lt01_04 {
    public static void lt01_04(){
        System.out.println("Digite o valor da temperatura em Celsius que será convertida em Fahrenheit: ");
        Scanner c = new Scanner(System.in);
        float celsius = c.nextFloat();
        
        float fahrenheit = (((9*celsius)+160)/5);
        
        System.out.println("O valor da temperatura convertida é: " + fahrenheit);
    }
    
}
