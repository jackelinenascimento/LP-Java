package Vetores;
import java.util.Scanner;

public class Ex04_Vetores {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		double vetNotas[] = new double [30];
		double media = 0;
		int i = 0;
		int quantidade = 0;
				
		for(i= 0; i < 30; i++){
			System.out.println("Digite um valor:");
			vetNotas[i] = teclado.nextInt();
			
			media = media + vetNotas[i]			
			}			
		}
		media= (media/30);
		System.out.println("MÉDIA DOS VALORES DIGITADOS:" + media); 

		
		for (i = 0; i < 30; i++) {
			if(vetNotas[i] >= media) {
				quantidade = quantidade + 1;				
			} else {
				System.out.println("POSIÇÃO COM VALOR MENOR QUE A MÉDIA:" + vetNotas[i]);
			}
		}
		System.out.println("QUANTIDADE DE NOTAS ACIMA DA MÉDIA::" + quantidade);

	}

}
