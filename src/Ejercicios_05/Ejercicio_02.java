package Ejercicios_05;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// 2. Dado un array de tamaño (N,M) de enteros, decir si todos sus elementos son cero
		
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
		
		
		if(FuncionesMatrices.sonTodosCero(matriz))
			System.out.println("Son todos cero");
		else System.out.println("No son todos cero");
		
		teclado.close();
		

	}

}
