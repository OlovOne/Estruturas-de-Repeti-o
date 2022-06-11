package Pad2;

import java.util.Scanner;

/*Faça um programa para realizar uma enquete sobre a marca de smartphone
preferida de 20 pessoas entre Samsung, Motorola, Apple, Xiaomi. Ao final,
imprima o resultado através de um histograma, utilizando asteriscos.*/
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int samsung=0,xiaomi=0,apple=0,motorola=0;
		char voto = 0;
		int aux=1,aux1=1,aux2=1,aux3=1;
		for(int i = 0;i<20;i++) {
			System.out.println("Escolha o seu preferido; Xaiome, apple, motorola e samsung");
			voto = teclado.next().charAt(0);
			if(voto =='S'||voto =='s') {
				samsung++;
			}
			if(voto =='X'||voto =='x') {
				xiaomi++;
			}
			if(voto =='A'||voto =='a') {
				apple++;
			}
			if(voto =='M'||voto =='m') {
				motorola++;
			}
		}
		for(int i =0;i<21;i++) {
			if(i==0) {
				for(int j = 6;j<7;j++) {
					System.out.print("\n------------------------------\n");
					System.out.print("   Sams Moto Appl Xiao");}
			}
			if(i>0) {
				for(int j = 1;j<2;j++) {
					System.out.print("\n|  ");
				}

				if(aux<=samsung) {
					for(int j=1;j<2;j++) {
						System.out.print("   *");
						aux++;
					}}
				if(aux1<=motorola) {
					for(int j=1;j<2;j++) {
						System.out.print("   *");
						aux1++;
					}}
				if(aux2<=apple) {
					for(int j=1;j<2;j++) {
						System.out.print("   *");
						aux2++;
					}}
				if(aux3<=xiaomi) {
					for(int j=1;j<2;j++) {
						System.out.print("   *");
						aux3++;
					}}
				}
			
					}
				}

			
		}