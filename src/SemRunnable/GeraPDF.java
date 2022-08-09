package SemRunnable;

public class GeraPDF extends Thread{
	
	@Override
	public void run() {
		
		try {
			
			System.out.println("Iniciando a Thread que GeraPDF");
			
			for(int j = 0; j < 10; j++ ) {
				
				System.out.println("Gerando o PDF de número: " + j);
				
				Thread.sleep(2000);
			}
			
			System.out.println("Finalizado a Thread GeraPDF");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
