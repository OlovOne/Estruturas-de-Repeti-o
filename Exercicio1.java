package Pad2;
/*Fa�a um programa que solicite um determinado n�mero ao usu�rio e imprima
todos os n�meros existentes entre 1 e o n�mero informado.*/
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
