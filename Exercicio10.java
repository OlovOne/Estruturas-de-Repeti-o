package Pad2;
/*Faça um programa que solicite um conjunto de números ao usuário e, quando
o mesmo desejar parar a execução, imprima quantos números pares e quantos
números ímpares foram digitados*/

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int par=0,impar=0;
		float numeroInformado;
		for(int i=0;i!=1;i--) {
			System.out.println("Informe um numero: ");
			numeroInformado = teclado.nextFloat();
			if(numeroInformado%2!=0) {
				impar++;
			}else {
				par++;
			}
			System.out.println("Deseja continuar: ");
			char escolha = teclado.next().charAt(0);
			if(escolha == 'N'|| escolha == 'n') {
				break;
			}
		}
		System.out.println("Quantidade de par: - "+par);
		System.out.println("Quantidade de impar: - "+impar);
	}

}




