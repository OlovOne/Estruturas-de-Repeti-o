package Pad2;

import java.util.Scanner;

/*Fa�a um programa que solicite a base e o expoente de uma determinada
pot�ncia e imprima o resultado.*/
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float expoente,base;
		for(int i=0;i!=1;i--) {
			System.out.println("Informe a base: ");
			base = teclado.nextFloat();
			System.out.println("Informe o expoente: ");
			expoente = teclado.nextFloat();
			System.out.println("A resposta �: "+(Math.pow(base,expoente)));
			System.out.println("Deseja continuar: ");
			char escolha = teclado.next().charAt(0);
			if(escolha == 'N'|| escolha == 'n') {
				break;
			}
		}
	}

}