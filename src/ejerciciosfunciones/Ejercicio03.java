package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Tabla para guardar los numeros
		int tabla[];
		
		//Variable para guardar el tamaño de la tabla
		int size; 
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por el tamaño de la tabla
		System.out.println("Introduzca el tamaño de la tabla");
		
		//Leo del teclado
		size = sc.nextInt();
		
		//Llamo a la funciona para generar la tabla
		tabla = rellenaPares(size);
		
		//Muestro el maximo
		System.out.println("La nueva tabla es: " + Arrays.toString(tabla));
		
		//Cierro el Scanner
		sc.close();
	}

	//Funcion para sumar todos los numeros de una tabla
	public static int[] rellenaPares (int size) {
		int tabla[] = new int[size];
		Random rand = new Random();
		for (int i=0;i<size;i++){
			tabla[i]=rand.nextInt()*2;
		}
		Arrays.sort(tabla);
		return tabla;
	}

}
