package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Tabla de numeros enteros
		int tabla[] = {2, 4, 2, 23, 57};
		
		//Variable para guardar la posicion de la variable
		int indice[]; 
		
		//Variable para guardar el numero que el usuario quiere que se busque
		int num;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por el numero que hay que buscar en la tabla
		System.out.println("Introduzca el numero que hay que buscar en la tabla");
				
		//Leo del teclado
		num = sc.nextInt();
		
		//Llamo a la funciona para calcular la posicion de la tabla
		indice = buscarTodos(tabla, num);
		
		//Muestro la posicion
		System.out.println("La posicion del numero es: " + Arrays.toString(indice));
		
		//Cierro el Scanner
		sc.close();
	}

	//Funcion para econtrar el numero que el usuario introduzca
	public static int[] buscarTodos (int tabla[], int num){
		int size = 0;
		int indice[];
		for (int i=0; i<tabla.length; i++) {
			if (num == tabla [i]) {
				size += 1;
			}
		}
		indice = new int [size];
		int contador=0;
		for (int i=0; i<tabla.length; i++) {
			if (num == tabla [i]) {
				indice[contador]=i;
				contador++;
			}
		}
		return indice;
	}

}
