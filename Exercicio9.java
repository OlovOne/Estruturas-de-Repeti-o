package Pad2;

import java.util.Scanner;
/*Fa�a um programa que solicite um conjunto de n�meros ao usu�rio e, quando
o mesmo desejar parar a execu��o, calcule e imprima a m�dia aritm�tica dos
n�meros informados.*/
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador=0;
		float soma=0;
		float numeroInformado;
		for(int i=0;i!=1;i--) {
			System.out.println("Informe um numero: ");
			numeroInformado = teclado.nextFloat();
			soma +=numeroInformado;
			contador++;
		
			System.out.println("Deseja continuar: ");
			char escolha = teclado.next().charAt(0);
			if(escolha == 'N'|| escolha == 'n') {
				break;
			}
		}
		System.out.println("Media: "+(soma/contador));
	}

}