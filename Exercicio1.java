package Pad2;
/*Faça um programa que solicite um determinado número ao usuário e imprima
todos os números existentes entre 1 e o número informado.*/
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		Float numeroInformado = teclado.nextFloat();
		for (int i = 0;i!=numeroInformado;) {
			if(numeroInformado <0) {
				i--;
			}else {
				i++;
			}
			if(i==0) {
				
			}else {
				System.out.println(i);
			}
			
	}

}}
