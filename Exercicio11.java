package Pad2;

import java.util.Scanner;

public class Exercicio11 {
/*Fa�a um programa que solicite um determinado n�mero ao usu�rio e verifique
	se o mesmo � primo.*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float numeroInformado;
		for(int i=0;i!=1;i--) {
			System.out.println("Informe um numero: ");
			numeroInformado = teclado.nextFloat();
			if(numeroInformado%2!=0 && numeroInformado%3!=0 && numeroInformado%5!=0 && numeroInformado%7!=0) {
				System.out.println("O Numero "+numeroInformado+" � primo");
			}else {
				System.out.println("O Numero "+numeroInformado+" n�o � primo");
			}
			System.out.println("Deseja continuar: ");
			char escolha = teclado.next().charAt(0);
			if(escolha == 'N'|| escolha == 'n') {
				break;
			}
		}
	}

}
