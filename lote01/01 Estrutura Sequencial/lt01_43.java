/*
 * 43. Calcule e mostre quantos anos serão necessários para que 
Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano 
e Maria tem 1,5 m e cresce 2 cm ao ano.
 */
package lote01;

/**
 *
 * @author jackeline
 */
public class lt01_43 {
    public static void lt01_43(){
        float anos, ana, maria;
        
        anos = 0;
        maria = 150;
        ana = 110;
        
        while (maria > ana){
            anos = anos + 1;
            ana = 110 + 3 * anos;
            maria = 150 + 2 * anos;
        }
        System.out.println("Quantidade de anos necessários para que Ana seja maior que Maria: " + anos);
    }
}
