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
public class lt01_29 {
    public static void lt01_29(){
        
        int tipo;
        float valor;
        
        System.out.println("Informe o tipo de investimento (1 - poupança ou 2 - renda fixa): ");
        Scanner teclado = new Scanner(System.in);
        tipo = teclado.nextInt();
        
        System.out.println("Informe o valor do investimento: ");
        valor = teclado.nextFloat();
        
        calcularValor(tipo, valor);
        
    }
    
    public static void calcularValor(int tipo, float valor){
	
	if (tipo == 1){
            System.out.println("Valor corrigido em 30 dias: " + valor * 1.03);
        } else if (tipo == 2){
            System.out.println("Valor corrigido em 30 dias: " + valor * 1.05);
        } else {
            System.out.println("Tipo e/ou valor informado inválido.");
        }
		
   }
}
