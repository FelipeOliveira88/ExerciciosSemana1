package exercicios_semana_1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a duração do filme em minutos:");
		int N = leitor.nextInt();
		
		int totalSegundos = N * 60;
		int hora = totalSegundos / 3600;
		
		System.out.println("O total de horas deste filme é  " + hora);
		System.out.println("O total de segundos desse filme é " + totalSegundos + " segundos.");
	}

}
