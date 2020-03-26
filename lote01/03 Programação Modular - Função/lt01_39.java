/*
 * 39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 1 2 3 4 ... 64
Qdte: 1 2 4 8 ... N
 */
package lote01;

/**
 *
 * @author jackeline
 */
public class lt01_39 {
   
	public static void main(String[] args) {

		double casa = 1;
				
		for (casa = 1; casa <= 64; casa++) {
		System.out.println("CASA " + casa + " = " + Quantidade(casa));
		
		}
	}
	

	public static double Quantidade(double c) {  
		
			if (c == 1) {
				return 1;
			} else{
				if (c == 2){
					return 2;
			}else {
				if (c >= 2) {
					return Math.pow(2, (c-1));				
				}
			}
			return Math.pow(c,2);
		
}
		

	}
}
