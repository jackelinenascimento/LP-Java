/*
 * 39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 1 2 3 4 ... 64
Qdte: 1 2 4 8 ... N
 */
package lote01;

/**
 *
 * @author jackeline
 */
public class lt01_39 {
    public static void lt01_39(){
        double casa, graos;
        
        graos = 0;
        
        for (casa = 0; casa < 64; casa ++){
            graos = graos + Math.pow(2, casa);
        }
        
        System.out.println("Há um total de " + graos + " grãos.");
    }
}
