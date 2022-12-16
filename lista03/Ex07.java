package lista03;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();
		int soma = valor1 + valor2 + valor3;
		double result = Math.pow(soma, 2);
		
		System.out.println("O resultado da soma dos quadrados dos três valores é: " + result);
		sc.close();
		
	}

}
