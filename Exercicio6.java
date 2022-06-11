package Pad2;

import java.util.Scanner;

/*Faça um programa que solicite o nome e a altura de um conjunto de pessoas e
imprima o nome da pessoa mais alta.*/
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome,auxNome="";
		float altura=0;
		float auxAltura=0;
		for(int i=0;i!=1;i--) {
			System.out.println("Informe um nome: ");
			nome = teclado.next();
			System.out.println("Informe uma altura: ");
			altura = teclado.nextFloat();
			if(auxAltura <altura) {
				auxAltura = altura;
				auxNome=nome;
			}
			System.out.println("Deseja continuar: ");
			char escolha = teclado.next().charAt(0);
			if(escolha == 'N'|| escolha == 'n') {
				break;
			}
		}
System.out.print("A pessoa com amior altua é: "+auxNome);
	}}

