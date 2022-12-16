package lista03;

import java.util.Scanner;

public class Ex02 {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Digite o compriemnto da caixa: ");
		int comprimento = sc.nextInt();
		System.out.println("Digite a largura da caixa: ");
		int largura = sc.nextInt();
		System.out.println("Digite a altura da caixa: ");
		int altura = sc.nextInt();
		int volume = comprimento * largura * altura;
		System.out.println("O volume da caixa é: " + volume);
		
		sc.close();
	}
	
	
	
	

}
