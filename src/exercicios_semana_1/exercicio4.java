package exercicios_semana_1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a distância do inimigo:");	
		int distancia = leitor.nextInt();
		
		if(distancia <= 70) {
			System.out.println("Armas ativadas");
		}
		else {
			System.out.println("Armas desativadas");
		}
		
	

	}

}
