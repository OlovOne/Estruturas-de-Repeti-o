package Pad2;
import java.util.Scanner;
/*Faça um programa que solicite o termo inicial, a razão e a quantidade de
números de uma determinada progressão aritmética e imprima a sequência
em ordem crescente e em ordem decrescente.*/
public class Exercicio13 {

	public static void main(String[] args) {
		float aux;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a razão: ");
		float razao = teclado.nextFloat();
		System.out.println("Informe o primeiro termo: ");
		float primeiroTermo = teclado.nextFloat();
		System.out.println("Informe a quantidade de termos: ");
		float quantidadeDeTermos = teclado.nextFloat();
		if(quantidadeDeTermos<0) {
			System.out.print("A quantidade de termos não pode ser negativa.");
			System.exit(0);
		}
		aux=primeiroTermo;
		System.out.println("Crescente");
		for (int i = 0;i<=quantidadeDeTermos;i++) {
			System.out.println(aux);
			aux+=razao;
		}
		aux--;
		System.out.println();
		System.out.println("Decrescente");
		for (int i = 0;i<=quantidadeDeTermos;i++) {
			System.out.println(aux);
			aux+=-razao;
		}
	}

}
