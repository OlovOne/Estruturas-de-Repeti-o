package Pad2;

import java.util.Scanner;

/*Fa�a um programa que solicite um conjunto de n�meros ao usu�rio e, quando
o mesmo desejar parar a execu��o, imprima o maior e o menor n�mero
informado.*/
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float maior=0;
		float menor=0;
		float numeroInformado;
		for(int i=0;i!=1;i--) {
			System.out.println("Informe um numero: ");
			numeroInformado = teclado.nextFloat();
			if(i == 0) {
				maior=numeroInformado;
				menor=numeroInformado;
			}
			if(numeroInformado >maior) {
				maior = numeroInformado;
			}
			if(numeroInformado <menor) {
				menor = numeroInformado;}
			System.out.println("Deseja continuar: ");
			char escolha = teclado.next().charAt(0);
			if(escolha == 'N'|| escolha == 'n') {
				break;
			}
		}
		System.out.println("Maior - "+maior);
		System.out.println("Menor - "+menor);
	}

}