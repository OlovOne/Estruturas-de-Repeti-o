package Pad2;

import java.util.Scanner;

/*Fa�a um programa que simule um sistema de login, onde o usu�rio � admin e
a senha � 123. Se o usu�rio conseguir acessar, imprima uma mensagem de
boas-vidas, caso contr�rio, informe que ocorreu um erro na tentativa de
acesso. Caso o usu�rio n�o consiga o acesso em 3 tentativas, informe que sua
conta foi bloqueada por quest�es de seguran�a.*/
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String usuario;
		int senha;
		int i;
			for( i = 1;i<4;i++) {
				System.out.println("Informe o usu�rio: ");
				usuario = teclado.next();
				System.out.println("Informe a senha: ");
				senha = teclado.nextInt();
				if(senha ==123) {
					if(usuario.equals("admin")) {
						System.out.print("Bem-vindo");
						break;
					}
				}else {
					System.out.println("Usuario ou senha incorretos.");
				}
				if(i==3) {
					System.out.print("Sua conta esta bloaqueada por motivos de seguran�a.");
					break;
	}
		
		
		}}}
		

	


