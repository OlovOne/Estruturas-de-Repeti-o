package Pad2;
/*Fa�a um programa que solicite dois n�meros n e m e imprima todos os
n�meros de n at� m e, em seguida, de m at� n.*/
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o N: ");
		float n = teclado.nextFloat();
		System.out.println("Informe o M: ");
		float m = teclado.nextFloat();
		float aux=n;
		System.out.println("De N -> m");
		for(;n != m;) {
			System.out.println(n);
			if(n<m) {
				n++;
			}else if(n>m) {
				n--;
			}
		}
		System.out.println(m);
		System.out.println("");
		n=aux;
		System.out.println("De M -> n");
		for(;m!=n;) {

			System.out.println(m);
			if(n>m) {
				m++;
			}else if(m>n) {
				m--;
			}
		}
		System.out.println(n);
}

}
