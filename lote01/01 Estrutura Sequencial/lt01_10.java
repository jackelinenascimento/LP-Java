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
public class lt01_10 {
    public static void lt01_10(){
        System.out.println("*** DIFERENÇA ENTRE DOIS NUMEROS REAIS ***");
        System.out.println("Digite o valor do primeiro número: ");
        Scanner teclado = new Scanner(System.in);
        float numero1 = teclado.nextFloat();
        
        System.out.println("Digite o valor do segundo número: ");
        float numero2 = teclado.nextFloat();
        
        float diferenca = numero1 - numero2;
        
        System.out.println("A diferença entre os números é: " + diferenca);
    }
    
}
