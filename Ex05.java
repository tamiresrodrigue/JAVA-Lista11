package lista11;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calcule o fatorial de um numero fornecido pelo usuario.");
		 System.out.println("Digite um  numero para descubrir seu fatorial");
		 
		 int valor = sc.nextInt();
		 for(valor = valor; valor > 0; valor--) {
				
				resultado = resultado * valor;	
				System.out.println(resultado);
			}
			
		}
}