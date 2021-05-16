package exercicios_semana_1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int A = leitor.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int B = leitor.nextInt();
		
		/*USANDO XOR
	    A^=B;
		B^=A;
		A^= B;
		
		*/
		
		A = A+B;
		B = A-B;
		A = A-B;
		
		
		
		System.out.println(A);
		System.out.println(B);
		
		

	}

}
