/*
 * 37. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
    N’nésimo termo.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_37 {
    public static void lt01_37(){
        int numero, n1, n2, n3;
        
        System.out.println("Digite quantos termos você deseja ver da sequência de Fibonacci: ");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        
        n1 = 1;
        n2 = 1;
        
        System.out.println(n1);
        System.out.println(n2);
        
        for(int n = 1; n <= numero-2; n++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
