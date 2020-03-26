/*
 * 43. Calcule e mostre quantos anos serão necessários para que 
Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano 
e Maria tem 1,5 m e cresce 2 cm ao ano.
 */
package lote01;

/**
 *
 * @author jackeline
 */
public class lt01_43 {
    	public static void main(String[] args) {
		
		CalculaAnos();
		
	}
	
	public static void CalculaAnos() {
		double ana = 1.10, maria= 1.50;
		int tempo=0; 
		
		while (ana < maria){
			ana = ana + 0.3;
			maria = maria + 0.2;
			tempo = tempo + 1;			
			if( ana > maria) {
				System.out.println("Ana será maior do que maria em " + tempo + " anos");
				
			}
			
		}
		
		
	}
}
