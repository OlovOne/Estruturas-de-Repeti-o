package Pad2;

import java.util.Scanner;

/*Fa�a um programa que simule uma urna eletr�nica com 2 candidatos (nome e
n�mero). Primeiro, o programa deve solicitar as informa��es dos candidatos e,
em seguida, o seguinte menu deve ser exibido:
- Votar
- Resultado Parcial
- Finalizar Vota��o
Se o usu�rio selecionar a op��o "Votar", deve aparecer o nome e n�mero dos
candidatos e o usu�rio ir� informar o n�mero em que quer votar. Se o usu�rio
selecionar a op��o, resultado parcial, o programa deve exibir a quantidade de
votos de cada candidato e, se o usu�rio selecionar a op��o "Finalizar Vota��o",
o programa deve exibir a quantidade de votos, o percentual de votos que cada
candidato recebeu e o nome de quem venceu a elei��o.*/
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String candidato="Bolsonario",candidato1="Lula",nome;
		int numeroCandidato=17, numeroCandidato1=13,numeroDeEleitor,aux=0,votoCandidato = 0,votoCandidato1=0,aux2=0;
		char escolha = 0;
		do {
		System.out.println("Informe o seu nome:");
		nome = teclado.next();
		System.out.println("Informe o numero de eleitor:");
		numeroDeEleitor = teclado.nextInt();
		System.out.println("Qual deseja escolher.\n- Votar\n- Resultado Parcial\n- Finalizar Vota��o");
		escolha = teclado.next().charAt(0);
		if(escolha == 'V'||escolha == 'v') {
			System.out.println("Candidatos:\n"+candidato+" "+numeroCandidato);
			System.out.println(candidato1+" "+numeroCandidato1);
			System.out.println("Escolha o numero do candidato que deseja votar.");
			aux=teclado.nextInt();
			if(aux==17) {
				votoCandidato++;
			}
			if(aux==13) {
				votoCandidato1++;
			}
			if(aux!=13&&aux!=17){
				System.out.println("Numero de eleitor desconhecido.");
			}else {
				System.out.println("Voto aceito, Obrigado por vota.");
			}

		}else if(escolha == 'R'||escolha == 'r'){
			System.out.println("Quantidade de votos para cada candidato:\nBolsonario - "+votoCandidato+" Votos\n"+"\nLula - "+votoCandidato1+" Votos\n");
		}else if(escolha == 'F'||escolha == 'f'){
			System.out.print("Quantidade de votos para cada candidato:\nBolsonario - "+votoCandidato+" Votos");
			System.out.print(" "+(votoCandidato*100)/(votoCandidato+votoCandidato1)+"%");
			System.out.print("\nLula - "+votoCandidato1+" Votos");
			System.out.print(" "+(votoCandidato1*100)/(votoCandidato+votoCandidato1)+"%");
			System.out.println();
			if(votoCandidato==votoCandidato1) {
				System.out.println("Precisa da segunda fase.");
			}else {
				if(votoCandidato>votoCandidato1) {
					System.out.println("O ganhador da elei��o � - "+candidato);
				}else {
					System.out.println("O ganhador da elei��o � - "+candidato1);
				}
			}
		}
		}while(aux2!=1);}}