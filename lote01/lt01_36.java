/*
 * 36. Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_36 {
    public static void lt01_36(){
        float contador, numero, fatorial, soma;
        
        System.out.println("Digite um número: ");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextFloat();
        
        fatorial = 1;
        contador = 1;
        soma = 0;
        
        while (numero >= contador){
            fatorial = fatorial * contador;
            contador ++;
            soma = soma + 1/fatorial;
            if (numero > contador - 1){
                System.out.print("1/"+fatorial+" + ");}
            else{
                System.out.print("1/"+fatorial+" = ");
            }
        }
        
        System.out.print(soma);
    }
}
