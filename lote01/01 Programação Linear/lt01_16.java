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
public class lt01_16 {
    public static void lt01_16(){
        float ht, vh, pd, nd, salB, salL, desc;
        
        System.out.println("*** SALARIO LIQUIDO ***");
        
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        Scanner teclado= new Scanner(System.in);
        ht = teclado.nextFloat();
        
        System.out.println("Digite o valor da hora trabalhada: ");
        vh = teclado.nextFloat();
        
        System.out.println("Digite o percentual de descontos: ");
        pd = teclado.nextFloat();
        
        System.out.println("Digite a quantidade de dependentes: ");
        nd = teclado.nextFloat();
        
        salB = ht * vh + 100 * nd;
        desc = salB * pd / 100;
        salL = salB - desc;
        
        System.out.println("O valor do salário líquido é: " + salL);
    }
    
}

