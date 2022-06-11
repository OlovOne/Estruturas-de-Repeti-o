package Pad2;

import java.util.Scanner;

/*Faça um programa que solicite a base e a altura de um determinado retângulo
e imprima um retângulo formado por asteriscos utilizando as medidas
fornecidas.*/
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int base=0,altura=0;
		System.out.println("Informe a base: ");
		base = teclado.nextInt();
		System.out.println("Informe a altura: ");
		altura = teclado.nextInt();
		for(int i =0;i<altura;i++) {
			System.out.println("");
			for(int a =0;a<base;a++) {
				System.out.print("*");
		}
	
			
	
	}}}


