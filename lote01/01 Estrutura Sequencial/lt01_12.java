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
public class lt01_12 {
    public static void lt01_12(){
        System.out.println("Digite o seu ano de nascimento: ");
        Scanner teclado = new Scanner(System.in);
        int anoNasc = teclado.nextInt();
        
        System.out.println("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();
        
        System.out.println("A sua idade é: " + (anoAtual - anoNasc) + " anos");
        System.out.println("A sua idade daqui 17 anos será: " + (anoAtual - anoNasc + 17) + " anos");
    }
    
}

  