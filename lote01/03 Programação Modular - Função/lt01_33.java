/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio101
 */
public class lt01_33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float num, i=1, f=1;
		float soma=0, resultado=0;
		
		System.out.println("Digite um número:");
		num = in.nextInt();
		
		System.out.println("SOMA = " + CalcSerie(num));
		
	 }
	
	public static double CalcSerie(double n) { // Função Recursiva
		double soma;
		if (n == 1) {
            return 1/n;
        } else {
            soma = (1/n) + CalcSerie(n-1);
            return soma;
            }
	
     }
}
