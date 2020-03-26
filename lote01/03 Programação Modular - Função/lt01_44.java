/*
 * 44. Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_44 {
   	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double base, expoente;
		
		System.out.println("Digite o número da base: ");
		base = in.nextInt();
		
		System.out.println("Digite o número do expoente: ");
		expoente = in.nextInt();
		
		System.out.println(" O resultado da potencia de " +base + " ^ " + expoente + " = " +CalculaPotencia(base,expoente));
	}
	
	public static double CalculaPotencia(double x, double y) {
		double potencia;
		
		potencia = Math.pow(x, y);
		return potencia;
	
	}
    }
