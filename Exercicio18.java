package Pad2;

import java.util.Scanner;

/*Faça um programa que solicite um determinado número inteiro e informe
quantos dígitos ele tem.*/
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