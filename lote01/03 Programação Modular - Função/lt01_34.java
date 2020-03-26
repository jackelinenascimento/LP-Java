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
public class lt01_34 {
  
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num, i;
		
		System.out.println("Digite um número: ");
		num = in.nextInt();
		
		System.out.println(CalcTabuada(num));
	}

		
	public static int CalcTabuada(int n) {
		int i, resultado=0;
		for (i = 1; i <= 10; i++) {
			resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);
            }
		return resultado;
	}
}
