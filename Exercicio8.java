package Pad2;
//Faça um programa que solicite um número ao usuário e calcule o seu fatorial.

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o N: ");
		float n = teclado.nextFloat();
		float fatorial = 1;
		for(float i =1;i!=(n+1);) {
			if(n<0) {
				System.out.println("Não existe fatorial de numero negativo: ");
				break;
			}else if(n>0) {
				fatorial *=i;
				i++;
			}
		}
		System.out.println("O fatorial de "+n +" e "+fatorial);
}

}

	


