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
public class lt01_05 {
    
    public static void lt01_05(){
        System.out.println("Digite os coeficientes A, B e C da equação de 2º grau: ");
        System.out.println("Coeficiente A: ");
        Scanner teclado = new Scanner(System.in);
        float coefA = teclado.nextFloat();
        System.out.println("Coeficiente B: ");
        float coefB = teclado.nextFloat();
        System.out.println("Coeficiente C: ");
        float coefC = teclado.nextFloat();
        
        float delta = (float) ((coefB*coefB) - (4*coefA*coefC));
        
        float x1 = (float) ((- coefB + Math.sqrt(delta))/ 2 * coefA);
        
        float x2 = (float) ((- coefB - Math.sqrt(delta))/ 2 * coefA);
        
        System.out.println("Os valores de x1 e x2, respectivamente, são: " + x1 + " e " + x2);
        
    }
    
}
