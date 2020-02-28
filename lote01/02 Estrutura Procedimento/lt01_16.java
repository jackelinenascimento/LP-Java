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
public class lt01_16 {
    public static void lt01_16(){
        public float horasTrabalhadas, valorHora, percentualDescontos, dependentes;
        
        System.out.println("*** SALARIO LIQUIDO ***");
        
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        Scanner teclado= new Scanner(System.in);
        horasTrabalhadas = teclado.nextFloat();
        
        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora = teclado.nextFloat();
        
        System.out.println("Digite o percentual de descontos: ");
        percentualDescontos = teclado.nextFloat();
        
        System.out.println("Digite a quantidade de dependentes: ");
        dependentes = teclado.nextFloat();
        
        
    }

    public static void calcularSalario(float horasTrabalhadas, float valorHora, float percentualDescontos, float dependentes){
	float salarioBruto, salarioLiquido, desconto;

	salarioBruto = horasTrabalhadas * valorHora + 100 * dependentes;
        desconto = salarioBase * percentualDescontos / 100;
        salarioLiquido = salarioBruto - dependentes;
        
        System.out.println("O valor do salário líquido é: " + salarioLiquido);
    }
}

