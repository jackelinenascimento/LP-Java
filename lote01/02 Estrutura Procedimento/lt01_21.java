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
public class lt01_21 {
    public static void lt01_21(){
         float n1, n2, n3, n4;
        
        System.out.println("*** CALCULO DE MEDIA ***");
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota bimestral: ");
        n1 = teclado.nextFloat();
        
        System.out.println("Digite a segunda nota bimestral: ");
        n2 = teclado.nextFloat();
        
        System.out.println("Digite a terceira nota bimestral: ");
        n3 = teclado.nextFloat();
        
        System.out.println("Digite a quarta nota bimestral: ");
        n4 = teclado.nextFloat();
        
	calcularMedia(n1, n2, n3, n4);
        
    }

    public static void calcularMedia(float n1, float n2, float n3, float n4){

	float media;
	
	media = (n1 + n2 + n3 + n4)/4;
        
        System.out.println("A sua média bimestral é: " + media);
        
        if (media >= 6){
            System.out.println("APROVADO");
        } else {
            if (media < 3){
                System.out.println("RETIDO");
            } else{
                System.out.println("EXAME");
            }
        }
	
    }   
}

