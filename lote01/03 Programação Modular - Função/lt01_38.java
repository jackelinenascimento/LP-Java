/*
 * 38. Receba 100 números inteiros reais. 
Verifique e mostre o maior e o menor valor. 
Obs.: somente valores positivos.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_38 {
  	public static void main(String[] args) {

		int valor = 0;

		VerificaMaior(valor);
		
		System.out.println("O maior valor é " + VerificaMaior(valor));
		System.out.println("O maior valor é " + VerificaMenor(valor));
		System.out.println("---------------");

	}

	public static int VerificaMaior(int n) {
		Scanner in = new Scanner(System.in);

		int i, maior = 0, menor = 0;

	
		for (i = 1; i <= 3; i++) {
			System.out.println("Digite um número: ");
			n = in.nextInt();
			
			if( i == 1) {
				maior = n;
				menor = n;				
			} else if (n > maior) {
				maior = n;			
				
			} else if (n < menor) {
				menor = n;
			}						
		}
	}

	public static int VerificaMenor(int n) {

		Scanner in = new Scanner(System.in);

		int i, maior = 0, menor = 0;

		for (i = 1; i <= 3; i++) {
			System.out.println("Insira um valor: ");
			n = in.nextInt();
			if (i == 1) {
				maior = n;
				menor = n;
			} else if (n < menor) {
				menor = n;
				return menor;
			}
		}
		return menor;

	}
        }
    }
}
