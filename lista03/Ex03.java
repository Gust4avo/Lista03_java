package lista03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		int subtra = (valor1 - valor2);
		double result = Math.pow(subtra, 2);
		
		System.out.println("O resultado é: " + result);
		
		sc.close();
		
	}

}
