import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			Scanner scanf = new Scanner(System.in);
			
			int tam = 0;
			int qteapaga  = 0;
			int resto;
			String config;
			String numero;
			String linha[];	
			
		
		
	        	
			while (true){
			
			config = scanf.nextLine();
	        	linha =  config.split(" ");
	        	
	        	tam = Integer.parseInt(linha[0]);
	        	qteapaga = Integer.parseInt(linha[1]);
				
		
				if(tam == 0 && qteapaga ==  0)
					break;
		        	// pegar o numero e passa para uma vetor de inteiros 
				
		        	numero = scanf.nextLine();
		        	int vetor[] = new int[numero.length()];
		        	for (int i = 0; i < numero.length(); i++) {
		        		vetor[i]  = Integer.parseInt(numero.substring(i, i+1));
		        	}
				
				Stack<Integer>  pilha = new Stack();
				
				// pegar os dados de configuracao do problema tamano do numeoro e qte para apagar 
		        	
					resto = tam-qteapaga;
					
					int atual;
					
				
					
					for (int i = 0; i < tam; i++) {
						atual = vetor[i];
						while (pilha.size() > 0 && pilha.size()+tam - i > resto && pilha.peek() < atual){
							pilha.pop();
						} if(pilha.size() < resto) {
						 pilha.push(atual);
					}
					}
						
					int tpilha = pilha.size();	
					
					int resul[] = new int[tpilha];
					
					for (int j = 0; j < tpilha; j++) {
						resul[j] = pilha.peek();
						pilha.pop();
					}	
				
					for (int i = tpilha - 1; i >= 0; i--) {
						System.out.print(resul[i]);
					}
					System.out.println("\n");
				

}
}
}
