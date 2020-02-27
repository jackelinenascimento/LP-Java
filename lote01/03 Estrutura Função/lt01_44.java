/*
 * 44. Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_44 {
    public static void lt01_44(){
        double base, expoente, potencia;
        
        potencia = 1;
        
        System.out.println("Digite o valor da base: ");
        Scanner teclado = new Scanner(System.in);
        base = teclado.nextInt();
        
        System.out.println("Digite o valor do expoente: ");
        expoente = teclado.nextInt();
        
        potencia = Math.pow(base, expoente);
        
        System.out.println("O valor da potência é: " + potencia);
        }
    }
