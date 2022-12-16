package lista03;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Qual seu salario mensal: ");
		float salario = sc.nextFloat();
		System.out.println("Digite o percentual de reajuste: ");
		float reajuste = sc.nextFloat();
		float result = salario + salario * (reajuste/100);
		
		System.out.println(result);
		
		sc.close();
		
	}

}
