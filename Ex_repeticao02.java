package br.com.generation.lacosrepeticao;

import java.util.Scanner;

/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

public class Ex_repeticao02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0, contPar = 0, contImpar = 0;
		
		for(int c = 1; c <= 10; c++) { 
			System.out.print("\n Digite o " + c + "� numero:");
			num = input.nextInt();
			if(num % 2 == 0) {
				contPar++; // contPar += 1   contPar = contPar + 1
			}
			else {
				contImpar++;
			}
		}
		System.out.println("Foram digitados " + contPar + " n�meros pares.");
		System.out.println("Foram digitados " + contImpar + " n�meros �mpares.");
	
		
		
		input.close();
	}
}
