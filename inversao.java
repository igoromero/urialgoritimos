import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class No{
	private int num;
	private int nivel;
	
	public No(int num, int nivel) {
		this.num=num;
		this.nivel=nivel;	
	}
	
	public int getNumero() {
		return num;
	}
	
	public void setNumero(int num) {
		this.num = num;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public void setNivel(int nivel) {
		this.nivel=nivel;
		
	}	
	
}

public class Main {
	
	static int MAXIMO = 10001;
	static boolean[] visitados = new boolean [MAXIMO];
	static Queue <No> fila = new LinkedList<>();
	
	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		int qcasos = scanf.nextInt();
		int num;
		int destino;
		
		for (int i = 0; i < qcasos; i++) {
			num  = scanf.nextInt();
			destino = scanf.nextInt();
			System.out.println(passos(num, destino));
		}
		
		
}
	
	static int inverte(int numero) {
		int numeroInvertido = 0;
		 while (numero > 0) {
	            numeroInvertido = numeroInvertido *10;
	            numeroInvertido = numeroInvertido + (numero % 10);
	            numero = numero / 10;
			}
			return numeroInvertido;
	    }
	
	
	static int passos(int valor, int destino) {
		
		for (int i = 0; i < MAXIMO; i++) {
				visitados[i] = false;
		}
				No no = new No(valor, 0);
				fila.clear();
				visitados[valor] = true;
				fila.add(no);
				return decide(no, destino);
		
	}
	
	static void enfilera(No no) {
		if(no.getNumero() < MAXIMO && !visitados[no.getNumero()]) {
			fila.add(no); 
			visitados[no.getNumero()] = true;
		}
		
	}
	
	static int decide(No no, int destino) {
		
		while(true) {
			
		no = fila.remove();
		
		int valor = no.getNumero();
		int nivel = no.getNivel();
		
		if(valor == destino) {
			return nivel;
		}
		
		No invertido = new No(inverte(valor), nivel+1);
		enfilera(invertido);
		
		No incrementado = new No(no.getNumero()+1, no.getNivel()+1);
		enfilera(incrementado);
		
		}
			
		}
		
	}
