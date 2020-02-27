/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lote01;

import java.util.Scanner;

public class lt01_01 {
    
    public static void lt01_01() {
    
    System.out.println("Digite o valor do lado: ");
    Scanner ld = new Scanner(System.in);
    int lado = ld.nextInt();
    int area = lado * lado;
    System.out.println("O valor da área do quadrado é: " + area);
    }
}