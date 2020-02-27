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
public class lt01_19 {
    public static void lt01_19(){
        
        float x, y, maior;
        
        System.out.println("Digite o primeiro número: ");
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextFloat();
        
        System.out.println("Digite o segundo número: ");
        y = teclado.nextFloat();
        
        maior = (x>y)?x:y;
        
        System.out.println("O maior número digitado foi: " + maior);
        
    }
    
}
