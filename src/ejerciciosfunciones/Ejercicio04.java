package ejerciciosfunciones;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Tabla de numeros enteros
		int tabla[] = {2, 4, 6, 23, 57};
		
		//Variable para guardar la posicion de la variable
		int posicion; 
		
		//Variable para guardar el numero que el usuario quiere que se busque
		int num;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por el numero que hay que buscar en la tabla
		System.out.println("Introduzca el numero que hay que buscar en la tabla");
				
		//Leo del teclado
		num = sc.nextInt();
		
		//Llamo a la funciona para calcular la posicion de la tabla
		posicion = buscar(tabla, num);
		
		//Muestro la posicion
		System.out.println("La posicion del numero es: " + posicion);
		
		//Cierro el Scanner
		sc.close();
	}

	//Funcion para econtrar el numero que el usuario introduzca
	public static int buscar (int tabla[], int num){
		int contador=0;
		
		while (contador<tabla.length && num != tabla[contador]) {
			contador++;
		}
		
		if(contador==tabla.length) {
			contador=-1;
		}
		
		return contador;
	}

}
