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
public class lt01_08 {
    public static void lt01_08(){
        System.out.println("*** DEPOSITO POUPANÇA ***");
        System.out.println("Digite o valor do deposito: ");
        Scanner d = new Scanner(System.in);
        float deposito = d.nextFloat();
        
        deposito *= 1.013;
        
        System.out.println("O valor da aplicação após 1 mês, sendo que o rendimento é de 1,3%am é: R$" + deposito);
        
    }
    
}
