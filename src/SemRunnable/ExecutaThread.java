package SemRunnable;

import javax.swing.*;

public class ExecutaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnvioEmail Thread1 = new EnvioEmail();
		
		GeraPDF Thread2 = new GeraPDF();
		
		Thread1.start();
		
		Thread2.start();
		
		System.out.println("A execução do código terminou agora continua a execução da Thread"
				+" " + "que é uma execução assincrona");
		
		JOptionPane.showMessageDialog(null, "A execução do código terminou agora continua a execução da Thread");

	}
	
   	

}
