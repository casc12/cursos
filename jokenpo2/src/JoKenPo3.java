import java.util.Scanner;

public class JoKenPo3 {
	public static void main(String[] args) {
		/*logica do Jogador*/
		/*
		 * @author: Carlos Augusto de Sousa
		 */
		int jogador;
		//Scanner mao = new Scanner(System.in);
		Scanner mao = new Scanner(System.in);
		System.out.println("____JoKenPo____");
		System.out.println("_______________");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		jogador = mao.nextInt();
		mao.close();
		switch (jogador) {
		case 3:
				System.out.println("Jogador Escolheu Tesoura");
			break;
		case 1:
				System.out.println("Jogador Escolheu Pedra");
		break;
		case 2:
				System.out.println("Jogador Escolheu Papel");
		break;
		
		default:
				System.out.println("Opção Inválida");
			break;
		}
		//lógica Computador
		int computador = (int)(Math.random()*3+1);
		switch (computador) {
		case 3:
			System.out.println("Computador Escolheu Tesoura");
			
			break;
		case 1:
			System.out.println("Computador Escolheu Pedra");
			
			break;
		case 2:
			System.out.println("Computador Escolheu Papel");
			
			break;

		default:
			break;
		}
		if (jogador != computador) {
			if ((jogador ==1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3  && computador==2)) {
				System.out.println("Jogador Venceu!");
				
			} else {
				System.out.println("Computador Venceu!");

			}
			
		} else {
			System.out.println("Empatou!");
		}
	}

}
