package Pad2;

import java.util.Scanner;
/*faça um programa que solicite um número n e calcule o somatório dos
números entre 1 e n.*/
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o N: ");
		float n = teclado.nextFloat();
		float soma = 0;
		for(float i =1;i!=(n+1);) {
			if(n<0) {
				soma=soma +i;
				i--;	
			}else if(n>0) {
				soma=soma +i;
				i++;
			}
		}
		System.out.println("A soma dos numeros entre "+n +" e 1: "+soma);
}

}
