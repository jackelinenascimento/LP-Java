package Vetores;
import java.util.Scanner;

public class Ex05_Vetores {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		double vetA[] = new double [20];
		double vetB[]= new double [10];
		int soma = 0;
				
		for(int i= 0; i < 20; i++){
			System.out.println("Digite um valor:");
			vetA[i] = teclado.nextInt();			
			}			
		}
		for(int i=0;i < 10; i++){
			vetB[i] = vetA[i] - vetA[21-i];
			soma = soma + vetB[i];
		}
		
		System.out.println("O valor da operação dada é : " + media);
	}

}
