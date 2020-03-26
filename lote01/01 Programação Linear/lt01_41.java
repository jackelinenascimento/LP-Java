/*
 * 41. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */
package lote01;

/**
 *
 * @author jackeline
 */
public class lt01_41 {
    public static void lt01_41(){
        int dado1, dado2;
        
        for(dado1 = 1; dado1 <= 6; dado1++){
            for (dado2 = 1; dado2 <= 6; dado2++){
                if(dado1 + dado2 == 7){
                    System.out.println(dado1 + " e " + dado2);
                }
            }
        }
    }
}
