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
public class Ex32_Funcao {
	
	public static int Fatorial( int x) {  // Função Calcula Fatorial
		int j, fat=1;
		for(j=1; j <= x; j ++) {
			fat = fat * j;
				}
		return fat;
			
		}
		

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um número para calcular o fatorial:");
		n= in.nextInt();		
		Fatorial(n);
		
		System.out.println("O fatorial de " + n + " é = " + Fatorial(n));

	}

}
