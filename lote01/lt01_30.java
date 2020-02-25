/*
 * 30. Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre
a idade em anos, meses e dias, considerando os anos bissextos.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author jackeline
 */
public class lt01_30 {
    public static void lt01_30(){
     int anoAtual, mesAtual, diaAtual, anoNasc, mesNasc, diaNasc, dias;
     
        System.out.println("Digite o ano atual: ");
        Scanner teclado = new Scanner(System.in);
        anoAtual = teclado.nextInt();
        
        System.out.println("Digite o mes atual: ");
        mesAtual = teclado.nextInt();
        
        System.out.println("Digite o dia atual: ");
        diaAtual = teclado.nextInt();
        
        System.out.println("Digite o ano de nascimento: ");
        anoNasc = teclado.nextInt();
        
        System.out.println("Digite o mes de nascimento: ");
        mesNasc = teclado.nextInt();
        
        System.out.println("Digite o dia de nascimento: ");
        diaNasc = teclado.nextInt();
        
        dias = (365 - mesNasc * 365/12) +(365/12 - diaNasc);
        dias = dias + (mesAtual - ((anoAtual -(anoNasc + 1)) * 365));
        dias = dias + (mesAtual * (365/12)) - ((365/12) - diaAtual);
        
    }
}
