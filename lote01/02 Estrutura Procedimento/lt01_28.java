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
public class lt01_28 {
    public static void lt01_28(){
        
        float vendaMensal, precoAtual;
        
        System.out.println("Digite a venda mensal do produto: ");
        Scanner teclado = new Scanner(System.in);
        vendaMensal = teclado.nextFloat();
        
        System.out.println("Digite o preço atual do produto: ");
        precoAtual = teclado.nextFloat();
        
        calcularPreco(vendaMensal, precoAtual);
    }

    public static void calcularPreco(int vendaMensal, int precoAtual){

	if (vendaMensal < 500 && precoAtual < 30){
            System.out.println("Novo preço: " + precoAtual * 1.1);
        } else if (vendaMensal >= 500 && vendaMensal < 1000 && precoAtual >= 30 && precoAtual < 80){
            System.out.println("Novo preço: " + precoAtual * 1.15);
        } else if (vendaMensal >= 1000 && precoAtual >= 80){
            System.out.println("Novo preço: " + precoAtual * 0.95);
        } else {
            System.out.println("O preço não sofreu alterações: " + precoAtual);
        }

   }
}
