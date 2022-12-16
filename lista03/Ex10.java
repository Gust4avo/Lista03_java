package lista03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	
	
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Digite a quantidade de votos para o candidato A: ");
	 int cand_A = sc.nextInt();
	 System.out.println("Digite a quantidade de votos para o candidato B: ");
	 int cand_B = sc.nextInt();
	 System.out.println("Digite a quantidade de votos para o candidato C: ");
	 int cand_C = sc.nextInt();
	 System.out.println("Digite a quantidade de votos em brancos: ");
	 int voto_branco = sc.nextInt();
	 System.out.println("Digite a quantidade de votos nulos: ");
	 int voto_nulos = sc.nextInt();
	 
	 int votos_validos = cand_A + cand_B + cand_C;
	 int eleitores = votos_validos + voto_branco + voto_nulos;
	 
	 float P_validos = (eleitores * (votos_validos/100)/100);
	 float P_cand_A = (eleitores * (cand_A / 100)/100);
	 float P_cand_B = (eleitores * (cand_B / 100)/100);
	 float P_cand_C = (eleitores * (cand_C / 100)/100);
	 float P_brancos =(eleitores * (voto_branco / 100))/100;
	 float P_nulos = (eleitores * (voto_nulos /100)) /100;
	 
	 System.out.println("A quantidade de eleitores é: " + eleitores);
	 System.out.println("A quantidade de votos validos: " + P_validos+ "%");
	 System.out.println("A quantidade de votos validos Para o candidato A é: " + P_cand_A + "%");
	 System.out.println("A quantidade de votos validos para o candidato B é: " + P_cand_B + "%");
	 System.out.println("A quantidade de votos validos para o candidato C é: " + P_cand_C + "%");
	 System.out.println("A quantidade de votos brancos é de: " + P_brancos + "%");
	 System.out.println("A quantidade de votos nulos é de: "+ P_nulos + "%");
	 sc.close();
	 
	 
	 
	 
	 
	 
}

}
