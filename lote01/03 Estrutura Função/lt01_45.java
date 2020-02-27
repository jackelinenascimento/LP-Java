/*
 * 45. Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */
package lote01;

/**
 *
 * @author jackeline
 */
public class lt01_45 {
    public static void lt01_45(){
        float numerador, denominador, soma;
        
        soma = 0;
        
        for(numerador = 1; numerador <= 15; numerador++){
            denominador = numerador * numerador;
            if(numerador == 1){
                System.out.println(numerador);
                soma = soma + numerador;
            } else {
                if (numerador % 2 == 0){
                    System.out.println("-" + numerador + "/" + denominador);
                    soma = soma - numerador/denominador;
                } else {
                    System.out.println("+" + numerador + "/" + denominador);
                    soma = soma + numerador/denominador;
                }
            }
            numerador++;
        }
        System.out.println("O valor da soma é: " + soma);
    }
}
