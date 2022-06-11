package Pad2;

import java.util.Scanner;

/*Faça um programa que simule um sistema de login, onde o usuário é admin e
a senha é 123. Se o usuário conseguir acessar, imprima uma mensagem de
boas-vidas, caso contrário, informe que ocorreu um erro na tentativa de
acesso. Caso o usuário não consiga o acesso em 3 tentativas, informe que sua
conta foi bloqueada por questões de segurança.*/
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String usuario;
		int senha;
		int i;
			for( i = 1;i<4;i++) {
				System.out.println("Informe o usuário: ");
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
					System.out.print("Sua conta esta bloaqueada por motivos de segurança.");
					break;
	}
		
		
		}}}
		

	


