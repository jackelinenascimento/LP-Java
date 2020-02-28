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
public class lt01_27 {
    public static void lt01_27(){
        
        int voltas, tempo;
        float extensaoCircuito;
        
        System.out.println("Digite o número de voltas dadas no circuito: ");
        Scanner teclado = new Scanner(System.in);
        voltas = teclado.nextInt();
        
        System.out.println("Digite a extensão do circuito (metros): ");
        extensaoCircuito = teclado.nextFloat();
        
        System.out.println("Digite o tempo total da atividade (minutos): ");
        tempo = teclado.nextInt();
        
        calcularVelocidade(voltas, tempo, extensaoCircuito);
    }


    public static void calcularVelocidade(int voltas, int tempo, float extensaoCircuito){
	
	float velMedia;
	
	velMedia = voltas * extensaoCircuito / tempo;
        
        System.out.println("A velocidade média é: " + velMedia);

    }
}
