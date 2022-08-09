package ComRunnable;

import javax.swing.JOptionPane;

public class TesteRunnable {

	public static void main(String[] args) {

		// O runnable é passado dentro do construtor da Thread
		new Thread(emailT1).start();
		new Thread(geraPdfT2).start();
		JOptionPane.showMessageDialog(null, "O código terminou agora continua executando as Threads");
	}

	// O Runnable tem que ser feito fora da classe static main
	// Instancia a classe Runnable e implementa o metodo run()
	private static Runnable emailT1 = new Runnable() {
		public void run() {

			System.out.println("Iniciando a Thread que envia email");
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println("Enviando o email de número: " + i);
					Thread.sleep(1000); /*O tempo é de um segundo*/
				}

				System.out.println("A Thread Email foi finalizada ");

			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	};

	// Instancia a classe Runnable e implementa o metodo run()
	private static Runnable geraPdfT2 = new Runnable() {
		public void run() {
			System.out.println("Iniciando a Thread que gera PDF");
			try {
				for (int j = 0; j < 10; j++) {
					System.out.println("Executando o pdf de número: " + j);
					Thread.sleep(2000); /*O tempo é de dois segundos*/
				}
				System.out.println("A Thread que gera o pdf terminou");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	};
}
