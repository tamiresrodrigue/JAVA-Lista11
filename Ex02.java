package lista11;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Imorimir a tabuada de multiplicação de um especifico fornecedor pelo usuario");
		 System.out.println("Digite um numero");
		 
		 int numero = sc.nextInt();
		 for(int tabuada = 1; tabuada <11; tabuada++) {
			 int calculo = numero * tabuada;
			 System.out.println(numero + "x" + tabuada + "=" + calculo);
		 }
	}

}
