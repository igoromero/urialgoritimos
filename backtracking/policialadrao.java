import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int matriz[][] = new int[5][5];
		
		String resultado = "";
		Scanner scanf = new Scanner(System.in);
		
		int qcasos = scanf.nextInt();
	
		while(qcasos > 0) {
			
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					
					matriz[i][j] = scanf.nextInt();
					
				}
			}
				  
	            if (back(matriz) == true) {
					resultado = resultado +"COPS"+"\n";
				}else {
					resultado = resultado + "ROBBERS" +"\n";
				}	
				
				qcasos--;
			
		}
		        
            System.out.print(resultado);
        }  
	
		


	public static boolean back(int[][] matrix) {

		if (recursiva(matrix, 0, 0) == false) {
			return false;
		}
		return true;
	}

	public static boolean recursiva(int[][] matrix, int x, int y) {
		if (x == 4 && y == 4) {
			return true;
		}

		if (validar(matrix, x, y) == true) {
			matrix[x][y]=2;
			if (recursiva(matrix, x , y + 1) == true) {
				return true;}
			if (recursiva(matrix, x+1, y) == true) {
				return true;}
			if (recursiva(matrix, x-1 , y) == true) {
				return true;}
			if (recursiva(matrix, x, y-1) == true) {
				return true;}
		}
		return false;
	}

	public static boolean validar(int[][] matrix, int x, int y) {

		if (x >= 0 && x < 5 && y >= 0 && y < 5 && matrix[x][y] == 0) {
			return true;
		}
		return false;
	}

}
