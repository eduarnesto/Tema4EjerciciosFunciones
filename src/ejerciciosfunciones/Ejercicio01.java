package ejerciciosfunciones;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Tabla de numeros enteros
		int enteros[] = {2, 4, 6, 23, 57};
		
		//Variable para guardar la suma de la tabla
		int suma; 
		
		//Llamo a la funciona para sumar la tabla
		suma = sumaTabla(enteros);
		
		//Muestro la suma
		System.out.println("La suma de los enteros: " + suma);
	}

	//Funcion para sumar todos los numeros de una tabla
	public static int sumaTabla (int tabla[]) {
		int suma = 0;
		
		for (int numero : tabla) {
			suma += numero;
		}
		
		return suma;
	}
}
