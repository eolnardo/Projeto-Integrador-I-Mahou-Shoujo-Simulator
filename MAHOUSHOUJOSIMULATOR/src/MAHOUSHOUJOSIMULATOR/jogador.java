package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class jogador {
	Scanner scan = new Scanner(System.in);
	String nome, desejo;
	int uniforme = 0, menujogador;
	double ataque = 10, defesa = 10, vidabase = 100, vida;
	int viloesDerrotados = 0;
	
	
	
	
	void login () {
		System.out.println("====================================================S2=========================================================\n");
		System.out.println("[Kuriboh]:\nOlá! Seja bem-vindo ao Mahou Shoujo Simulator. \nAqui você irá enfrentar criaturas elementais e escolher o melhor uniforme!\n");
		System.out.println("[Kuriboh]:\nEu sou o Kuriboh! Uma criatura fofa e adorável. \n...Sim, meu visual foi inspirado no kuriboh de yu-gi-oh! T.T");
		System.out.println("\n====================================================S2=========================================================\n");
		System.out.print("[Kuriboh]:\nPrimeiro, digite o seu nome: ");
		nome = scan.nextLine();
		System.out.println("\n====================================================S2=========================================================\n");
		System.out.println("[Kuriboh]:\nCerto... " + nome + "\nAgora, qual é o seu MAIOR desejo? ");
		System.out.print("\n[" + nome + "]:\n"); 
		desejo = scan.nextLine(); 
		System.out.println("\n====================================================S2=========================================================\n");
		System.out.println("[Kuriboh]:\nParabéns! Você acaba de se tornar uma garota mágica!\nAgora você precisa decidir qual será seu uniforme de batalha!");
		System.out.print("[Kuriboh]:\n1. Vesitdo Colegial <3\n2. Cropped e saia :3\n3. Usar minhas roupas atuais >:c\nDigite aqui o comando: ");
		
		
		
		while(uniforme != 1 || uniforme != 2 || uniforme != 3) {
			uniforme = scan.nextInt();
			System.out.println("\n====================================================S2=========================================================\n");
			boolean saida = false;
			switch(uniforme) {
				case 1:
					System.out.println("[Kuriboh]:\nAqui temos um belo vestido colegial... \nÓtima escolha, eu particularmente prefiro esse.\nAposto que vai derrotar todos!!");
					saida = true;
					break;
				case 2:
					System.out.println("[Kuriboh]:\nUma ótima escolha. Diretamente da SHEIN, né?\nSem personalidade...");
					saida = true;
					break;
				case 3:
					System.out.println("[Kuriboh]:\nMuito tosco! \nAcho que você não tem muita criatividade, mas tudo bem.");
					saida = true;
					break;
				case 4:
					System.out.println("[Kuriboh]:\nHaha, thats funny, você quase me pegou\n(tradução: que engraçado)");
					System.out.print("\n[Kuriboh]:\n1. Vesitdo Colegial <3\n2. Cropped e saia :3\n3. Usar minhas roupas atuais >:c\nDigite aqui o comando: ");
					break;
				default:
					System.out.println("[Kuriboh]:\nOlha, eu preciso que você escolha uma roupa logo...");
					System.out.print("\n[Kuriboh]:\n1. Vesitdo Colegial <3\n2. Cropped e saia :3\n3. Usar minhas roupas atuais >:c\nDigite aqui o comando: ");
					
					break;
			}
			if (saida == true) {
				break;
			}
		}
		System.out.println("\n====================================================S2=========================================================\n");
	}
	
	void menu () {
		switch(menujogador) {
		
		}
	}

}
