/*
 * 42. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */
package lote01;

/**
 *
 * @author jackeline
 */
public class lt01_42 {
    public static void lt01_42(){
        float numerador, denominador, soma;
        
        numerador = 1;
        denominador = 1;
        soma = 0;
        
        while (numerador <= 50){
            System.out.println(numerador + "/" + denominador);
            soma = soma + numerador/denominador;
            numerador++;
            denominador+=2;
        }
        
        System.out.println("A soma é igual a: " + soma);
    }
}
