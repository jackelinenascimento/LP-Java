package Vetores;
import java.util.Scanner;


public class Ex02_Vetores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Declaração de variáveis
		int v[] = new int[5];
		int i=0, maior=0, menor=0;
		double media=0;
		
		// Entrada de dados
		for(i=0; i <= 4; i++) {
			System.out.println("Digite um número:");
			v[i] = in.nextInt();	
			media = media + v[i];	
			if(v[i] > maior) {
				maior = v[i];				
			}else { 
				if (v[i] < menor) {
				menor = v[i];					
				}
				
			}
		}
		media = media / 5;
		System.out.println("MÉDIA = " + media);
		System.out.println("MAIOR NÚMERO = " + maior);
		System.out.println("MENOR NÚMERO = " + menor);


		
				
		
		
		
		
		
		
	}

}
