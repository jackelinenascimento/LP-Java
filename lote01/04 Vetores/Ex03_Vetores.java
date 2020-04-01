package Vetores;
import java.util.Scanner;

public class Ex03_Vetores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int v1[] = new int[6]; 
		int v2[] = new int[3];
		int v3[]= new int [6];
		int i=0, j=1;
		
		for(i=1; i <= 6; i++) {			
			if 	(i <= 6) {
				System.out.println("Digite um número:");
				v1[i]= in.nextInt();
				v3[i] = v1[i];
			}
	}
		for (i=4; i <=6; i++) {
			v2[i]= v1[i];
			v3[i] = v2[i];
			
		}
		for (j=1; j <=6; j++) {
			System.out.println(v3[i]);
			
		}

}
}

