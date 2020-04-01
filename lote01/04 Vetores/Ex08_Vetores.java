package Vetores;
import java.util.Scanner;

public class Ex08_Vetores {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		int matriz[][] = new int[4][3];
		int vendaSemana[] = new int [4];
		int vendaProduto[] = new int [3];
		int valorTotal = 0;
			
		for(int x= 0; x < 4; x++){
			for(int y=0; y < 3; y++){
				System.out.println("Digite um valor:");
				matriz[x][y] = teclado.nextInt();

				vendaSemana[x] = vendaSemana[x] + matriz[x][y];
				vendaProduto[y] = vendaProduto[y] + matriz[x][y];

				valorTotal = valorTotal + matriz[x][y];
			}
		}
	
		System.out.println("Valor total de vendas: " + valorTotal);

		for(int i=0; i < 4; i++){
			if(i < 3){
				System.out.println("Venda semana " + i + " foi: " + vendaSemana[i]);		
				System.out.println("Venda produto " + i + " foi: " + vendaProduto[i]);
			} else {
				System.out.println("Venda semana " + i + " foi: " + vendaSemana[i]);
			}
		}
	}

}
