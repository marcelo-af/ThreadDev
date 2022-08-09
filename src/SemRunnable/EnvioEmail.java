package SemRunnable;

public class EnvioEmail extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Iniciando a Thread envio de Email");
		
					
			try {
				for(int i = 0; i < 10; i++) {
					
					System.out.println("Enviando o email de número: " + i);
				
				Thread.sleep(1000);
				}
				
				System.out.println("Finalizado a Thread EnvioEmail");

				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
