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
public class lt01_02 {
    
    public static void lt01_02() {
    
    System.out.println("Digite o valor do salário: ");
        Scanner sal = new Scanner(System.in);
        float salario = sal.nextFloat();
        
        float reajuste = 1.15f;
        salario *= reajuste;
        
        System.out.println("O salário final com reajuste de 15% é: R$" + salario);
        
    }
    
}



