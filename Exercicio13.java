package Pad2;
import java.util.Scanner;
/*Fa�a um programa que solicite o termo inicial, a raz�o e a quantidade de
n�meros de uma determinada progress�o aritm�tica e imprima a sequ�ncia
em ordem crescente e em ordem decrescente.*/
public class Exercicio13 {

	public static void main(String[] args) {
		float aux;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a raz�o: ");
		float razao = teclado.nextFloat();
		System.out.println("Informe o primeiro termo: ");
		float primeiroTermo = teclado.nextFloat();
		System.out.println("Informe a quantidade de termos: ");
		float quantidadeDeTermos = teclado.nextFloat();
		if(quantidadeDeTermos<0) {
			System.out.print("A quantidade de termos n�o pode ser negativa.");
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
