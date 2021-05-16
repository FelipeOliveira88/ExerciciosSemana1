package exercicios_semana_1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe o valor da compra:");	
		double total = leitor.nextDouble();
		
		System.out.println("informe o cupom:");
		String cupom = leitor.next();
		
		if(cupom.equalsIgnoreCase("diadefesta")) {
			total -= total * 0.03;
			System.out.println("Valor total atualizado para R$ " + total);
			
		}
		else {
			System.out.println("Total a pagar R$ " + total);
		}
		

	}

}
