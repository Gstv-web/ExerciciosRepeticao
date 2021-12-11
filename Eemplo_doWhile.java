package br.com.generation.lacosrepeticao;

public class Eemplo_doWhile {
	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		
		do { // Faça uma ação
			System.out.println(i);
			++i;
		} while (i <= 10); // enquanto a condição for atendida
		
		
		for(int sobe = 1, desce = 10; sobe <= 10 && desce >= 1; sobe++, desce--) { // posso fazer coisas ao mesmo tempo.
			System.out.println(sobe + " " + desce);
			Thread.sleep(750);
		}
		
	}
}
