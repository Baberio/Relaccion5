package Ejercicios_05;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// 3. Dado un array de tamaño (N,M) de reales, decir cuántos elementos tiene igual a un 
		//número A dado.
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres:?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres:?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		System.out.println("Introduce los datos de la mnatriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Tu matriz es: ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.println("Introduce un numero");
		int num=teclado.nextInt();
		
		System.out.println("Se repite "+FuncionesMatrices.igualNumero(matriz, num)+" veces");
		
		
		teclado.close();
		

	}

}
