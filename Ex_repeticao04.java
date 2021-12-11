package br.com.generation.lacosrepeticao;

import java.util.Scanner;

/*	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
	psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
 	o n�mero de pessoas calmas;
	o n�mero de mulheres nervosas;
 	o n�mero de homens agressivos;
 	o n�mero de outros calmos;
 	o n�mero de pessoas nervosas com mais de 40 anos;
 	o n�mero de pessoas calmas com menos de 18 anos.*/
public class Ex_repeticao04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		int cont = 0, sexo, psi, fem, mas, out, calm, nerv, aggr;
		
		System.out.println("--- Analisador de personalidades ---");
		while(cont != 10) {
			System.out.println("-----------------------------------------------------------");
			System.out.print("Escolha o sexo da pessoa:\n\n\n1) Feminino\n\n2) Masculino\n\n3) Outros \n-->");
			sexo = input.nextInt();
			if(sexo > 3) {
				System.out.print("Op��o inv�lida! Digite apenas entre 1 e 3.\n\nEscolha o sexo da pessoa:\n\n\n1) Feminino\n\n2) Masculino\n\n3) Outros \n-->");
				sexo = input.nextInt();
			}
			System.out.println("Digite as caracter�sticas psicol�gicas:\n\n\n1) A pessoa era calma\n\n2) A pessoa era nervosa\n\n3) A pessoa era agressiva");
			psi = input.nextInt();
			if(psi > 3) {
				System.out.print("Op��o inv�lida! Digite apenas entre 1 e 3.\n\nDigite as caracter�sticas psicol�gicas:\n\n\n1) A pessoa era calma\n\n2) A pessoa era nervosa\n\n3) A pessoa era agressiva");
				psi = input.nextInt();
			}
			cont++;
			
		}
		System.out.println(cont);
		System.out.println("Calculando");
		
		
		
		
		
		
		input.close();
	}

}
