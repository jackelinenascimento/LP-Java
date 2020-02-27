/*
 * 38. Receba 100 números inteiros reais. 
Verifique e mostre o maior e o menor valor. 
Obs.: somente valores positivos.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_38 {
    public static void lt01_38(){
        int numero, maior, menor;
        
        maior = 0;
        menor = 0;
        
        for (int n = 1; n <= 100; n++){
            System.out.println("Digite um número: ");
            Scanner teclado = new Scanner(System.in);
            numero = teclado.nextInt();
            
            if(n == 1){
                maior = numero;
                menor = numero;
            }
            
            if(numero > maior){
                maior = numero;
            }else{
                if (numero < menor){
                    menor = numero;
                }
            }
        }
    }
}
