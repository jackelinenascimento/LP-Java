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
public class lt01_15 {
    public static void lt01_15(){
        System.out.println("*** CALCULO DA HIPOTENUSA ***");
        
        System.out.println("Digite o valor do primeiro cateto: ");
        Scanner teclado = new Scanner(System.in);
        float catetoB = teclado.nextFloat();
        
        System.out.println("Digite o valor do segundo cateto: ");
        float catetoC = teclado.nextFloat();
        
        double hipotenusa = (catetoB*catetoB + catetoC*catetoC);
        hipotenusa = Math.sqrt(hipotenusa);
        
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
        
    }
    
}
