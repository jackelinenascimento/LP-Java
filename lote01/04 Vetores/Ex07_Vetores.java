package Vetores;
import java.util.Scanner;

public class Ex07_Vetores {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
    		
		double vetNumeros[] = new double [20];
		double auxiliar = 0;
		double numeroDigitado = 0;
		int primeiro = 0;
		int ultimo = 19;
		int meio = 0;
		boolean encontrou = false;
				
		for(int a= 0; a < 20; a++){
			System.out.println("Digite um valor:");
			vetNumeros[a] = teclado.nextInt();			
			}			
		}

		System.out.println("Valores digitados na ordem original: ");

		for(int b= 0; b < 20; b++){
			System.out.println(vetNumeros[b]);
		}
		
		for(int i= 0; i < 19; i++){
			for(int j= 1; j < 21; j++){
				if(vetNumeros[i] >= vetNumeros[j]){
					auxiliar = vetNumeros[i];
					vetNumeros[i] = vetNumeros[j];
					vetNumeros[j] = auxiliar;
				}
			}
		}
		
		System.out.println("Valores digitados em ordem crescente: ");

		for(int c= 0; c < 20; c++){
			System.out.println(vetNumeros[c]);
		}
		
		System.out.println("Digite um valor e ele sera verificado se existe na lista anterior:");
		numeroDigitado = teclado.nextInt();	
		
		while(primeiro <= ultimo & !encontrou == false){
			meio = (primeiro + ultimo)/2;
			if(vetNumeros[meio] == numeroDigitado){		
				encontrou = true;
				System.out.println("Número existe na lista!");
			} else {
				if(vetNumeros[meio] > numeroDigitado){
					ultimo = meio - 1;
				}else{
					primeiro = meio + 1;
				}
			}
		}
		
		if(encontrou == false){
			System.out.println("Número não pertence a lista!");
		}

	}

}
