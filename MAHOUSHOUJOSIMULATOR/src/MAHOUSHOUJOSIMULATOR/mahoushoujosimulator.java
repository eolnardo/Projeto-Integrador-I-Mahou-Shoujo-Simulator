package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class mahoushoujosimulator {
		
	public static void main(String[] args) {
		jogador jogador = new jogador();
		falasjogador falas = new falasjogador();
		machine pc = new machine();
		viloes vilao1 = new viloes();
		Scanner scan = new Scanner(System.in);
		
		vilao1.nome = "Haku, Senhor do Fogo"; 

		jogador.login();
		
		System.out.print("[Kuriboh]:\nTá, tá, agora vamos aos negócios.\nVocê terá que derrotar as três mais mortais criaturas que já pisaram na terra\nO quê? Eu deveria ter falado disso antes?");
		
		falas.fala1(jogador);
		System.out.println("\n[Kuriboh]:\nEu só tô brincando!\nAlguns piores já vieram antes, esses são fichinha!");
		falas.fala2(jogador);
		System.out.println("\n[Kuriboh]:\nTá bom, fracote! Vamos lá. Existem três seres que você deve eliminar\nSe liga, primeiro tem a Kiara. Ela é do MAL!");
		scan.nextLine();
		System.out.println("\n[Kuriboh]:\nKiara é conhecida por dominar a água! Suas habilidades são incríveis!\n(Ela foi inspirada em avatar então se cuida).");
		scan.nextLine();
		System.out.println("\n[Kuriboh]:\nTemos também o amorzinho <3, o Haku\n(santa criatividade, jesus!)\nADIVINHA! Ele domina o fogo.");
		scan.nextLine();
		System.out.println("\n[Kuriboh]:\nSerá que vem um original? E pra sua e minha surpresa, sim(?)\nTá afim de lutar contra alguém que tem poderes de gelo???\nNão? Pois é, eu também não, mas não é como queremos nhe\nPode entrar Kenku, o Mestre do GELO*");
		scan.nextLine();
		//System.out.println("\n[Kuriboh]:\n");
		
		System.out.println("\n====================================================S2=========================================================\n");
		
		pc.menu(vilao1, jogador);
		
		System.out.println("\n====================================================S2=========================================================\n");
		
		//VILOEEEEEEEEEEEEEEES
		
		
		scan.close();
	
	}

}

