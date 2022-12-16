package lista03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		int valor4 = sc.nextInt();
		int varP = valor1 + valor3;
		int varS= valor2 + valor4;
		
		System.out.println("Variavel P = "+varP);
		System.out.println("Variavel S = "+varS);
		
		sc.close();
		
		
		
		
		

	}

}
