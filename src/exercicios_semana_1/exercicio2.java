package exercicios_semana_1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a dura��o do filme em minutos:");
		int N = leitor.nextInt();
		
		int totalSegundos = N * 60;
		int hora = totalSegundos / 3600;
		
		System.out.println("O total de horas deste filme �  " + hora);
		System.out.println("O total de segundos desse filme � " + totalSegundos + " segundos.");
	}

}
