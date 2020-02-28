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
public class lt01_17 {
    public static void lt01_17(){
        System.out.println("*** QUANTIDADE DE LITROS GASTOS ***");
        
        float tempo, vMedia;
        
        System.out.println("Qual foi a duração total da viagem: ");
        Scanner teclado = new Scanner(System.in);
        tempo = teclado.nextFloat();
        
        System.out.println("Qual foi a velocidade média durante a viagem: ");
        vMedia = teclado.nextFloat();
        
	calculaLitros(tempo, vMedia);
        
        
        
    }

    public static void calculaLitros(float tempo, float vMedia){
	  
	float litros;
  
	litros = vMedia * tempo / 12;
        
        System.out.println("A quantidade de litros gastos foi: " + litros);
    }
    
}

