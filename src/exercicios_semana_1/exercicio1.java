package exercicios_semana_1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um ano de nascimento:");	
		
		int ano = leitor.nextInt();
		ano = 2021 - ano;
	
		System.out.println(ano);
	

	}

}
