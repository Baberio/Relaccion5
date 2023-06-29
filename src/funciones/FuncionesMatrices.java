package funciones;

import java.util.Scanner;

public class FuncionesMatrices {

	public static void pedirMatriz(int m[][]) {
		Scanner teclado = new Scanner(System.in);
		for (int fila=0; fila<m.length;fila++) {
			for(int col=0;col<m[0].length;col++) {
				System.out.printf("Introduce el elemento (%d,%d):",fila,col);
				m[fila][col]=teclado.nextInt();
			}
		}
	}
	
	public static void mostrarMatriz(int m[][]) {
		for (int fila=0; fila<m.length;fila++) {
			for(int col=0;col<m[0].length;col++) {
				System.out.printf("%d ",m[fila][col]);
			}
			System.out.println();
		}
	}
	
	public static void inicializar (int m[][], int num) {
		for (int fila = 0; fila < m.length; fila++) {
			for (int col = 0; col < m[0].length; col++){
				m[fila][col]=num;
			}
		}
		System.out.println();
	}
	public static boolean sonTodosCero(int m [][] ) {
	    for (int fila = 0; fila < m.length; fila++) {
	        for (int col = 0; col < m[fila].length; col++) {
	            if (m[fila][col] != 0) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	public static int igualNumero (int m [][], int num) {
		int contador=0;
		for (int fila = 0; fila < m.length; fila++) {
			for(int col=0; col<m[0].length; col++) {
				if (m [fila][col]== num ){
					contador = contador+1;
				}
				}
			}
		return contador;
		}
	}
	

