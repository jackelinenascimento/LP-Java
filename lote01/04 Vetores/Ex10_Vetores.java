package Vetores;

public class Ex10_Vetores {

	public static void main(String[] args) {

		int matriz[][] = new int [8][8];
		int potencia = 0;
			
		for(int i= 0; i < 8; i++){
			for(int j= 0; j < 8; j++){
				
				matriz[x][y] = Math.pow(2, potencia);
				potencia = potencia +1;
				System.out.printl(matriz[x][y]);
			}
		}
	}
}
