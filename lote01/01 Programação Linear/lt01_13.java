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
public class lt01_13 {
    public static void lt01_12(){
         System.out.println("Digite a quantidade de alimento em quilos: ");
        Scanner a = new Scanner(System.in);
        int alimentos = a.nextInt();
        
        alimentos *= 1000;
        
        int dias = alimentos/50;
        
        System.out.println("O alimento durará " + dias + " dias");
    }
    
}

