/*
 * 40. Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_40 {
   	public static void main(String[] args) {
		
		BuscaPrimos();

	}

	public static void BuscaPrimos() {  
		Scanner in = new Scanner(System.in);
		double num1, num2, c, i, primo = 0;
		
		System.out.println("Digite o primeiro número: ");
		num1 = in.nextDouble();

		System.out.println("Digite o segundo número: ");
		num2 = in.nextDouble();
		
		
		for(c = num1; c <= num2; c++){
			primo = 0;
			for ( i = 1; i <= c; i++) {
				if(c % i == 0) {
					primo = primo + 1;
					}					
				}
				if (primo == 2) {
					System.out.println(c + " ... ");
			}
			
		}
	}
		
}
