/*
 * 41. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */
package lote01;

/**
 *
 * @author jackeline
 */
public class lt01_41 {
    public static void main(String[] args) {
		
		CalculaDados();	
		
			}
	
	public static void CalculaDados() {
	int i, c;
		
		for (c = 1; c <=6; c++) {
			for (i = 1; i<=6; i++) {
				System.out.println("Dado 1: " + c);
				System.out.println("Dado 2: " + i);
				System.out.println("------------------");
				
				if (c + i == 7) {
					System.out.println("Combinação que resulta em soma 7: " + c + " x " + i);
					System.out.println("------------------");
					
				}
				
			}
		}
		
	}
}
