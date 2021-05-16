package exercicios_semana_1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe o peso do primeiro lixo");	
		int lixo1 = leitor.nextInt();
		
		System.out.println("informe o peso do segundo lixo");	
		int lixo2 = leitor.nextInt();
		
		System.out.println("informe o peso do terceiro lixo");	
		int lixo3 = leitor.nextInt();
		
		if(lixo1 < lixo2 && lixo1 < lixo3) {
			System.out.println("O primeiro lixo deve ser carregado pelo drone");
		}
		else if(lixo2 < lixo1 && lixo2 < lixo3) {
			System.out.println("O segundo lixo deve ser carregado pelo drone");
		}
		else {
			System.out.println("O terceiro lixo deve ser carregado pelo drone");
		}
		}
	

}
