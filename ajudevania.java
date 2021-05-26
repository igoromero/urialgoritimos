import java.util.Scanner;

public class Main {
	static	int [] peso;
	static int [] valor;
    static int memo[][];
	public static void main(String[] args) {
	
		int N, C, caso = 1;	
		int result=0;
		Scanner scanf = new Scanner(System.in);

		while(true) {

			N = scanf.nextInt();
			C = scanf.nextInt();
			if(N == 0 && C == 0)
				break;
			memo = new int[N][C+1];
			peso = new int[N];
			valor = new int[N];
			
			for (int i = 0; i < N; i++) {
				peso[i] = scanf.nextInt();
				valor[i] = scanf.nextInt();
			}
			
			result = mochila(N-1, C);
			System.out.print("Caso "+caso++ +": " );
			System.out.println(result);
			
		} 
		
	}
	
	
static int mochila(int i, int cap){
	int ganhoAtual, levo, nlevo;
	if(i < 0 || cap <= 0)
		return 0;
	if(memo[i][cap] != 0)
		return (memo[i][cap]-1) ;
	
	if(peso[i] > cap)
		ganhoAtual = mochila(i - 1, cap);
	else{
		nlevo = mochila(i - 1, cap);
		levo = mochila(i - 1, cap - peso[i])
		 + valor[i];
		ganhoAtual = Math.max(levo, nlevo);
	memo[i][cap] = ganhoAtual+1;
	}
	return ganhoAtual;
}


}
