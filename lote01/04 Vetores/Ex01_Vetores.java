package Vetores;
import java.util.Scanner;

public class Ex01_Vetores {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		// Declarando variáveis
		int vet[] = new int [5];
		int soma_impar = 0;
		int i = 0;
		double media = 0;
		
		// Entrada de dados e manipulação		
		for(i= 0; i <= 4; i++){
			System.out.println("Digite um valor:");
			vet[i] = in.nextInt();
			
			if((vet[i] >= 10)&&(vet[i] <= 200)){
				media = media + vet[i];				
			}			
		}
		media= (media/190); // Coletando valor da média dos números entre 10 e 200
		
		for (i = 0; i <= 4; i++) {
			if(vet[i]%2 == 1) {
				soma_impar = soma_impar + vet[i];				
			}
		}
		System.out.println("MÉDIA DOS NÚMEROS ENTRE 10 E 200:" + media);
		System.out.println("SOMA DOS NÚMEROS ÍMPARES" + soma_impar);

				

	}

}
