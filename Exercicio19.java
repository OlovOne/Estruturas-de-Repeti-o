package Pad2;
/*Faça um programa que solicite um determinado número inteiro e informe o
mesmo invertido.*/
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroInformado,numeroInvertido;
		System.out.println("Informe um numero; ");
		numeroInformado = teclado.nextInt();
		for(int i =0;i!=numeroInformado;) {
			numeroInvertido=numeroInformado%10;
			numeroInformado/=10;
			System.out.print("Numero invetido"+numeroInvertido);
		}
	}

}
