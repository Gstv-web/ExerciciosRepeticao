package br.com.generation.lacosrepeticao;

import java.util.Scanner;

/*	Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)*/

public class Ex_repeticao06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num, soma = 0, media = 0, contMedia = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = input.nextInt();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				contMedia++;	
			}
			
		}
		while(num != 0);
		
		media = soma / contMedia;
		System.out.println("Foram digitados " + contMedia + " n�mero(s) m�ltiplos de 3.");
		System.out.println("A soma dos n�meros m�ltiplos de 3 � igual a: " + soma);
		System.out.println("A m�dia desses n�meros � igual a: " + media);
		
		
		input.close();

	}

}
