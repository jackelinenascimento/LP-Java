/*
 * 40. Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_40 {
    public static void lt01_40(){
        int numero1, numero2, menor, maior, contador, numero, divisor;
        
        contador = 0;
        
        System.out.println("Digite o primeiro número: ");
        Scanner teclado = new Scanner(System.in);
        numero1 = teclado.nextInt();
        
        System.out.println("Digite o segundo número: ");
        numero2 = teclado.nextInt();
        
        if(numero1 < numero2){
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }
        
        for (numero = menor; numero <= maior; numero++){
            for(divisor = 1; divisor <= numero; divisor++){
                if(numero % divisor == 0){
                    contador++;
                }
            if(contador == 2){
                System.out.println(numero);
            }
            contador = 0;
        }
    }
}
