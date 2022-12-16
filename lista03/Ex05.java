package lista03;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a cotação do dolar: ");
		float cot_dolar = sc.nextFloat();
		System.out.println("Digite a quantidade de reais que voçê deseja converter: ");
		float qtd_reais = sc.nextFloat();
		float dolar = cot_dolar * qtd_reais;
		System.out.println(qtd_reais + " Dolares em reais é " + dolar);
		sc.close();
		
	}

}
