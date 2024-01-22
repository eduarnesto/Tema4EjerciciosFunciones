package ejerciciosfunciones;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Tabla de numeros enteros
		int enteros[] = {2, 4, 6, 23, 57};
		
		//Variable para guardar el valor maximo de la tabla
		int max; 
		
		//Llamo a la funciona para calcular el maximo de la tabla
		max = maxTabla(enteros);
		
		//Muestro el maximo
		System.out.println("La suma de los enteros: " + max);
	}

	//Funcion para sumar todos los numeros de una tabla
	public static int maxTabla (int tabla[]) {
		int max = tabla[0];
		
		for (int numero : tabla) {
			if (numero>max) {
				max=numero;
			}
		}
		
		return max;
	}

}
