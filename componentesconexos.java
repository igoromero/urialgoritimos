import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List <List<Integer>> listadj;
	static boolean visitados [];
	static List <Integer> trilha;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Entrada de dados
	Scanner scanf = new Scanner(System.in);
	int qcasos = scanf.nextInt();
	int vertices, arestas;
	
	for (int i = 0; i < qcasos; i++) {
		vertices = scanf.nextInt();
		arestas = scanf.nextInt();	
		
		listadj = new ArrayList<>();
		visitados = new boolean [vertices];
		
		for (int j = 0; j < vertices; j++) {
			listadj.add(new ArrayList<>());	
		}
		
		for (int j = 0; j < arestas; j++) {
		 char vertice1 = scanf.next().charAt(0);
		 char vertice2 = scanf.next().charAt(0);	
		 
		 int v1 = vertice1 - 'a';
		 int v2  = vertice2 - 'a';

		 listadj.get(v1).add(v2);
		 listadj.get(v2).add(v1);
		}
		
		System.out.println("Case #"+(i+1)+":");
		int componentes = BuscaP();
		System.out.println(componentes+" connected components\n");	
	}



	}
	
	
static void Visita(int vertice) {
		visitados[vertice] = true; //adiciona o vertice no array de visitados
		trilha.add(vertice); // coloca na lista os vertice visitados
		for (Integer vizinho : listadj.get(vertice)) {
			if(!visitados[vizinho]) {
				Visita(vizinho);
			}		
		}
		
	}
	
   static int BuscaP() {
		int count = 0;
		for (int i = 0; i < visitados.length; i++) {
			if (visitados[i] != true ) {
				trilha = new ArrayList();
				Visita(i);
				Collections.sort(trilha);// ordena os elementos da trilha 
				imprime();	
			count ++;
			}	
		}
	return  count;
	}
	
   static void imprime() {  
	   for (Integer vertice : trilha) {
		   char c = (char) (vertice + 'a');
		   System.out.print(c+",");	   
	   }   
	   System.out.println();
   }
	
	
	
	

}

