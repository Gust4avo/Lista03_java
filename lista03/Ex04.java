package lista03;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite a cotação do dolar: ");
		float cot_dolar = sc.nextFloat();
		System.out.println("Digite a quantidade de dolare que voçê deseja converter: ");
		float qtd_dolar = sc.nextFloat();
		float real =  qtd_dolar * cot_dolar;
		System.out.println("O valor de "+ qtd_dolar + " dolares em reais é " + real);
		sc.close();
		
		
	}

}
