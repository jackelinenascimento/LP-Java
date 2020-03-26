	/*
 * 37. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
    N’nésimo termo.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_37 {
  
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;

		System.out.println("Digite um número: ");
		num = in.nextInt();

		System.out.println(" A série é: " + FSerie(num));

	}

	public static int FSerie(int n) {
		int i, ant1=1, ant2=1, prox=0;
		 if (n < 2) {
			 return n;
		 }else {
			 return FSerie (n-1) + (n-2);

		 }
	}
}
