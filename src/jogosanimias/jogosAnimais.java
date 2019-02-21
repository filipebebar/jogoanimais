package jogosanimias;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * @author Filipe Barbosa
 *
 */
public class jogosAnimais {

	public static void main(String[] args) {
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		UIManager.put("OptionPane.noButtonText", "Não");
		UIManager.put("OptionPane.yesButtonText", "Sim");

		// variavel
		int resposta;

		while (true) {

			JOptionPane.showMessageDialog(null, "Jogo: Que animal sou eu! - by Filipe Barbosa");

			while (true) {
				JOptionPane.showMessageDialog(null, "Pense em um animal");

				resposta = JOptionPane.showConfirmDialog(null, "O animal que voncê pensou sabe voar ?");

				if (resposta == JOptionPane.NO_OPTION) {
					acao2();

				} else if (resposta == JOptionPane.YES_OPTION) {
					acao1();

				} else {
					break;
				}
			}
			break;
		}
	}

	public static void acao1() {
		int resposta;

		resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou é um Papagaio?");
		if (resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Acertei de novo!");
		} else if (resposta == JOptionPane.NO_OPTION) {
			acao3();
		} else {
			return;
		}

	}

	public static void acao2() {
		int resposta;

		resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou é um Leão?");
		if (resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Acertei de novo!");
		} else if (resposta == JOptionPane.NO_OPTION) {
			acao4();
		} else {
			return;
		}

	}

	public static void acao3() {
		String animal;
		String acao;
		int resposta;

		animal = JOptionPane.showInputDialog("Que animal você pensou ??");
		acao = JOptionPane.showInputDialog("Um (a) " + animal + "______ mas um gato não ?");
		JOptionPane.showMessageDialog(null, "O " + animal + " "+ acao + " mas o pintinho piu ?");
		JOptionPane.showMessageDialog(null, "Pense em um animal");

		resposta = JOptionPane.showConfirmDialog(null, "O animal que voncê pensou sabe nadar ?");

		if (resposta == JOptionPane.NO_OPTION) {
			acao2();

		} else if (resposta == JOptionPane.YES_OPTION) {
			acao1();

		} else {

			finalizar();
		}
	}

	public static void acao4() {
		String animal;
		String acao;
		int resposta;

		animal = JOptionPane.showInputDialog("Que animal você pensou ??");
		acao = JOptionPane.showInputDialog("Um (a) " + animal + "______ mas um pintinho não ?");
		JOptionPane.showMessageDialog(null, "O " + animal + " " + acao + " mas o gato, mia ?");
		JOptionPane.showMessageDialog(null, "Pense em um animal");
		resposta = JOptionPane.showConfirmDialog(null, "O animal que voncê pensou sabe pular ?");

		if (resposta == JOptionPane.NO_OPTION) {
			acao2();

		} else if (resposta == JOptionPane.YES_OPTION) {
			acao1();

		} else {

			finalizar();
		}
	}

	public static void finalizar() {

		int resposta;

		JOptionPane.showMessageDialog(null, "Obrigado por Jogar!");
		resposta = JOptionPane.showConfirmDialog(null, "Gostaria de jogar novamente ?", null,
				JOptionPane.YES_NO_OPTION);
		if (resposta == JOptionPane.YES_NO_OPTION) {
			return;
		} else {
			System.exit(0);
			;
		}

	}
}
