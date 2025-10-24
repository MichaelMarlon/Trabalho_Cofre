package uninter;

import java.util.Scanner;

public class Principal {
	public static void menuPrincipal() {
		System.out.println("Menu Principal");
		System.out.println("\n[1] Adicionar Moeda");
		System.out.println("[2] Remover Moeda");
		System.out.println("[3] Listar Moedas");
		System.out.println("[4] Total convertido para Reais");
		System.out.println("[0] Encerrar");
	}
	public static void menuMoedas() {
		System.out.println("Escolha a Moeda");
		System.out.println("\n[1] Real");
		System.out.println("[2] Dollar");
		System.out.println("[3] Euro");
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcaoPrincipal, opcaoMoeda;
		double valor;
		menuPrincipal();
		opcaoPrincipal = teclado.nextInt()	;
		while(opcaoPrincipal != 0) {
			switch(opcaoPrincipal) {
				case 1:
					menuMoedas();
					opcaoMoeda = teclado.nextInt();
					System.out.println("Informe o valor desejado:");
					valor = teclado.nextDouble();
					System.out.println(valor);
					menuPrincipal();
					opcaoPrincipal = teclado.nextInt();	
					break;
				case 2:
					System.out.println("escolheu 2");
					menuPrincipal();
					opcaoPrincipal = teclado.nextInt();		
					break;
				case 3:
					System.out.println("escolheu 3");
					menuPrincipal();
					opcaoPrincipal = teclado.nextInt();		
					break;
				case 4:
					System.out.println("escolheu 4");
					menuPrincipal();
					opcaoPrincipal = teclado.nextInt();		
					break;
				default:
					System.out.println("Opção inválida!");
					menuPrincipal();
					opcaoPrincipal = teclado.nextInt();		
				
			}
		}

	}

}
