package MAHOUSHOUJOSIMULATOR;

import java.util.Scanner;

public class machine {
	//System.out.println("\n[Kuriboh]:\n");
	Scanner scan = new Scanner(System.in);
	String mascote;
	int menu, menucombate, luta;
	boolean sair = false, menuc = false, jogadormorto = false, bossHaku = false;
	mahoushoujosimulator zero = new mahoushoujosimulator();
	
	void menu (viloes vilao1, viloes vilao2, viloes vilao3, jogador jogador) {
		while(sair==false) {
			System.out.println("\n====================================================S2=========================================================\n");
			System.out.print("\n[Kuriboh]:\nO que você quer fazer agora?\n1. LUTAR!!!!!!!\n2. Sair (fracote!)\nComando: ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				menucombate(vilao1, vilao2, vilao3, jogador);
				break;
			case 2:
				sair = true;
				break;
			default:
				System.out.println("\n[Kuriboh]:\nNão entendi...");
				sair = false;
				break;
			}
		}
		
		scan.close();
	}
	
	void combate (viloes vilao, jogador jogador) {
		jogador.vida = jogador.vidabase;
		System.out.println("\n====================================================S2=========================================================\n");
		System.out.println("\n[Kuriboh]:\nA vida do "+ vilao.nome +": [" + vilao.vida + "]");
		System.out.println("\n[Kuriboh]:\nVida do " + jogador.nome + ": [" + jogador.vida + "]");
		System.out.println("\n====================================================S2=========================================================\n");
		while (vilao.vida >= 10 && jogador.vida>=0 || menuc == false) {
			
			
			System.out.println("\n[Kuriboh]:\n1.BATER!! (ataque)\n2. AIAIAI (defesa)\n3.MAS EH UM FRACOTE MESMO! (fugir)");
			luta = scan.nextInt();
			System.out.println("\n====================================================S2=========================================================\n");
			switch(luta) {
				case 1:
					vilao.vida = vilao.vida - jogador.ataque;
					System.out.println("\n[Kuriboh]:\n"+ jogador.nome + " utiliza seu cetro mágico e dispara uma rajada de luz que atinge " + vilao.nome + ".\n\nVida de " + vilao.nome + ": [" + vilao.vida + "]");
					System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + jogador.vida + "]");

					break;
				case 2:
					jogador.vida = jogador.vida + (jogador.defesa - vilao.ataque);
					System.out.println("\n[Kuriboh]:\nVida de " + vilao.nome + ": [" + vilao.vida + "]\n");
					System.out.println("\n[Kuriboh]:\nVida de " + jogador.nome + ": [" + jogador.vida + "]");
					break;
				case 3:
					menuc = true;
					break;
				default:
					System.out.println("\n[Kuriboh]:\nBATE!! BATE!! BATE!!");
					break;
				}
			if (vilao.vida<0) {
				jogador.viloesDerrotados++;
				break;
			} else if (jogador.vida<0) {
				jogadormorto = true;
				break;
			}
		}
		
	}
		
	
	
	void mascote () {
		System.out.println("\n[Kuriboh]:\nAh, quase que eu ia me esquecendo... \nantes de você começar a tomar suas próprias decisôes\ntenho que te apresentar um amigo que vai te acompanhar nessa joranda!");
		mascote = scan.next();
	}
	
	void menucombate (viloes vilao1, viloes vilao2, viloes vilao3, jogador jogador) {
		if (jogador.viloesDerrotados == 1) {
				while (menuc == false) {
					System.out.println("\n====================================================S2=========================================================\n");
					System.out.print("\n[Kuriboh]:\n1. " + vilao1.nome + " (eliminado)\n2. " + vilao2.nome + "\n3. " + vilao3.nome + "\n4. MENU!\nComando aqui: ");
					menucombate = scan.nextInt();
					switch(menucombate) {
						case 1:
						System.out.println("\n[Kuriboh]:\nmorreu já, filhão");
							break;
						case 2:
							combate(vilao1, jogador);
							break;
						case 3:
							break;
						case 4:
							menuc = true;
							break;
						default:
							System.out.println("\n[Kuriboh]:\nVai lutar ou não? Não enche!");
							menuc = false;
							break;
					}
			}
		}
			while (menuc == false) {
				System.out.println("\n====================================================S2=========================================================\n");
				System.out.print("\n[Kuriboh]:\n1. HAKU!!\n2. KIARA!!\n3. O esquisitão... digo, o Kenku.\n4. MENU!\n" + jogador.viloesDerrotados + "\nComando aqui: ");
				menucombate = scan.nextInt();
				switch(menucombate) {
					case 1:
						combate(vilao1, jogador);
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						menuc = true;
						break;
					default:
						System.out.println("\n[Kuriboh]:\nVai lutar ou não? Não enche!");
						menuc = false;
						break;
				}
			} 
		} 
		
	}
	//HAKU
