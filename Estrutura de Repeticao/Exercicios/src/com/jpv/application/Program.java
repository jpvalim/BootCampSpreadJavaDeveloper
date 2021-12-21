package com.jpv.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		exercicio3();
	}
	
	public static void exercicio1(){
	/*1-Faça um programa que peça uma nota, entre zero e dez. 
	Mostre uma mensagem caso o valor seja inválido e 
	continue pedindo até que o usuário informe um valor válido.*/ 
		int nota;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Entre com a Nota: ");
			nota=sc.nextInt();
			sc.nextLine();
		}while(nota < 0 || nota > 10);
		sc.close();
	}
	
	public static void exercicio2() {
	/*2-Faça um programa que leia um nome de usuário e a sua senha e 
	 não aceite a senha igual ao nome do usuário, 
	 mostrando uma mensagem de erro e voltando a pedir as informações.*/
		Scanner sc = new Scanner(System.in);
		String usuario="";
		String senha="";
		while(usuario.equals(senha)){
			System.out.print("Entre com o usuário: ");
			usuario = sc.nextLine();
			System.out.print("Entre com a senha: ");
			senha = sc.nextLine();
			if(usuario.equals(senha)) System.out.println("O usuário não pode ser igual a senha. Entre novamente com os dados.");
		}
		sc.close();		
	}

	public static void exercicio3() {
	/*Faça um programa que leia e valide as seguintes informações:
    Nome: maior que 3 caracteres;
    Idade: entre 0 e 150;
    Salário: maior que zero;
    Sexo: 'f' ou 'm';
    Estado Civil: 's', 'c', 'v', 'd'; */
	Scanner sc = new Scanner(System.in);
	String nome="";
	double salario=0;
	char sexo;
	char estadoCivil;
	
	while(nome.length() < 3)	
	{
		System.out.print("Por favor informe o nome");
		nome = sc.nextLine();
		if (nome.length() < 3) {
			System.out.println("O nome deve ter ao menos 3 caracteres");
		}else {
			break;
		}
	}
	
	while(salario <= 0)	
	{
		System.out.print("Por favor insira o salário");
		nome = sc.nextLine();
		if (nome.length() < 3) {
			System.out.println("O nome deve ter ao menos 3 caracteres");
		}else {
			break;
		}
	}
	
	
	
	
	sc.close();
	
	}
}
