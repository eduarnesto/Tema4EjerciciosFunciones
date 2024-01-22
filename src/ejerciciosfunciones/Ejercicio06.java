package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Tabla de numeros enteros
		int tabla[] = {2, 4, 2, 23, 57};
		
		//Tabla para guardar la tabla con las sumas
		int sumas[]; 

		//Variable para guardar de cuanto en cuanto se deben de suamar los numeros
		int numElementos;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);

		//Pregunto de cuanto en cuanto se deben de sumar los numeros
		System.out.println("De cuanto en cuanto se deben de sumar los numeros");
		
		//Leo del teclado
		numElementos = sc.nextInt();
		
		//Llamo a la funciona para calcular la posicion de la tabla
		sumas = suma(tabla, numElementos);
		
		//Muestro la posicion
		System.out.println("La tabla con las sumas es: " + Arrays.toString(sumas));
		
		//Cierro el Scanner
		sc.close();
	}

	//Funcion para econtrar el numero que el usuario introduzca
	public static int[] suma (int t[], int numElementos){
		int sumas[] = new int [t.length-numElementos+1];
		for (int i=0; i<sumas.length; i++) {
			for (int j=i; j<i+numElementos;j++) {
				sumas[i] += t[j];
			}
		}
		return sumas;
	}

}
