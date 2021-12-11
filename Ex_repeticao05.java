package br.com.generation.lacosrepeticao;

import java.util.Scanner;


/*	Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)*/

public class Ex_repeticao05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0, cont = 0;
		
		do { 
			System.out.println("Digite um n�mero: ");
			num = input.nextInt();
			if(num != 0) {
				cont++;				
			}
			soma += num;
		}
		while(num != 0);
		
		System.out.println("Foram digitados " + cont + " n�meros");
		System.out.println("A soma dos n�meros digitados � :" + soma);
		
		
		input.close();

	}

}
