package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class falasjogador {
	Scanner scan = new Scanner(System.in);
	
	
	void fala1(jogador jogador) {
		int falas;
		System.out.print("\n\n[FALAR]\n1. SIM???\n2. De boa, eu encaro.\n(Responder Kuriboh): ");
		falas = scan.nextInt();
		switch(falas) {
			case 1:
				System.out.println("\n[" + jogador.nome + "]:\nSIM???");
				break;
			case 2:
				System.out.println("\n[" + jogador.nome + "]:\nDe boa, eu encaro.");
				break;
			default:
				System.out.println("\n[" + jogador.nome + "]:\n(Prefiro não falar nada)");
				break;
		}
		
	}
	
	void fala2(jogador jogador) {
		int falas;
		System.out.print("\n\n[FALAR]\n1. Olha, não sei se tô gostando...\n2. Pode mandar!!\n(Responder Kuriboh): ");
		falas = scan.nextInt();
		switch(falas) {
			case 1:
				System.out.println("\n[" + jogador.nome + "]:\nOlha, não sei se tô gostando...");
				break;
			case 2:
				System.out.println("\n[" + jogador.nome + "]:\nPode mandar!!");
				break;
			default:
				System.out.println("\n[" + jogador.nome + "]:\n(Prefiro não falar nada)");
				break;
		}
	}
	
	void fala3(jogador jogador) {
		int falas;
		System.out.println("\n[FALAR]\n1. \n2. \n(Responder Kuriboh): ");
		falas = scan.nextInt();
		switch(falas) {
			case 1:
				System.out.println("\n[" + jogador.nome + "]:\n");
				break;
			case 2:
				System.out.println("\n[" + jogador.nome + "]:\n");
				break;
			default:
				System.out.println("\n[" + jogador.nome + "]:\n(Prefiro não falar nada)");
				break;
		}
	}

}
