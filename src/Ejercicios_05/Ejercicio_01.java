package Ejercicios_05;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ejercicio_01 {

	public static void main(String[] args) {
		// 1. Dado un array de tamaño (N,M) de enteros, inicializarlo a un valor dado A
		
		Scanner teclado =new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres:?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres:?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		System.out.println("A que numero quieres inicializar la matirz");
		int num=teclado.nextInt();
		
		System.out.println("Su matriz quedaria:");
		FuncionesMatrices.inicializar(matriz, num);
		FuncionesMatrices.mostrarMatriz(matriz);
		teclado.close();

	}

}
