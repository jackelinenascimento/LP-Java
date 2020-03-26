/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lote01;

import java.util.Scanner;

/**
 *
 * @author Laboratorio101
 */
public class lt01_22 {
    public static void lt01_22(){
          
        int x, y;
        
        System.out.println("Digite o valor do primeiro número: ");
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        
        System.out.println("Digite o valor do segundo número: ");
        y = teclado.nextInt();
        
	ordenarCrescente(x, y);
        
    }
    
    public static void ordernarCrescente(int x, int y){

	System.out.println("Os número em ordem crescente... ");
        if(x>y){
            System.out.println(x + " " + y);
        } else {
            System.out.println(y + " " + x);
        }
        
 }
    
}
