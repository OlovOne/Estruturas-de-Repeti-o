package Pad2;

import java.util.Scanner;

public class Exercicio11 {
/*Faça um programa que solicite um determinado número ao usuário e verifique
	se o mesmo é primo.*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float numeroInformado;
		for(int i=0;i!=1;i--) {
			System.out.println("Informe um numero: ");
			numeroInformado = teclado.nextFloat();
			if(numeroInformado%2!=0 && numeroInformado%3!=0 && numeroInformado%5!=0 && numeroInformado%7!=0) {
				System.out.println("O Numero "+numeroInformado+" é primo");
			}else {
				System.out.println("O Numero "+numeroInformado+" não é primo");
			}
			System.out.println("Deseja continuar: ");
			char escolha = teclado.next().charAt(0);
			if(escolha == 'N'|| escolha == 'n') {
				break;
			}
		}
	}

}
