package Pad2;

import java.util.Scanner;

/*Fa�a um programa que solicite um determinado n�mero inteiro e informe
quantos d�gitos ele tem.*/
public class Exercicio18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroInformado,quantidadeDeNumeros=0;
		System.out.println("Informe um numero; ");
		numeroInformado = teclado.nextInt();
		for(int i =0;i!=numeroInformado;) {
			quantidadeDeNumeros++;
			numeroInformado/=10;
		}
		System.out.print("Quantidade de digitos - "+quantidadeDeNumeros);
	}

}