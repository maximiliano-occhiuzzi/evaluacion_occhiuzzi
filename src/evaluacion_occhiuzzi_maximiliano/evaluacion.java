package evaluacion_occhiuzzi_maximiliano;

import java.util.Iterator;
import java.util.Scanner;

public class evaluacion {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		String[] apellidos = { "rodriguez", "messi", "muñoz", "villegas", "alegria" };
		int[] numCamisetas = { 5, 10, 20, 16, 7 };
		int contraseñaIngreso;
		boolean flag = false;

		System.out.println("ingresa la contraseña correcta para ingresar al programa: ");
		contraseñaIngreso = dato.nextInt();

		while (contraseñaIngreso != 2121) {
			flag = false;
			System.out.println("intentalo de nuevo");
			contraseñaIngreso = dato.nextInt();
			flag = true;
			break;
		}
		for (int i = 0; i < (numCamisetas.length - 1); i++) {
			for (int j = 0; j < (numCamisetas.length - i - 1); j++) {

				if (numCamisetas[j] < numCamisetas[j + 1]) {

					int temp = numCamisetas[j];
					numCamisetas[j] = numCamisetas[j + 1];
					numCamisetas[j + 1] = temp;
					
					String tempnom = apellidos[j];
					apellidos[j] = apellidos[j + 1];
					apellidos[j + 1] = tempnom;
					
					
				}
			}
		}
		System.out.println("\nArreglo ordenado: ");
		for (int a= 0; + a< numCamisetas.length; a++) {
			System.out.println("numero de camiseta: " + numCamisetas[a] + " nombre: " + apellidos[a]);
			
		}
	

		System.out.println(" ");

		boolean buscarcamiseta = true;
		while (buscarcamiseta == true) {
			System.out.println("ingrese un numero de camiseta a buscar: ");
			int camisetaBuscada = dato.nextInt();

			boolean encontrado = false;
			for (int i = 0; i < numCamisetas.length; i++) {
				if (camisetaBuscada == numCamisetas[i]) {
					System.out.println("el numero de camiseta: " + camisetaBuscada + " pertenece a: " + apellidos[i]);
					encontrado = true;
					System.out.println("Que desea hacer? ¿quiere modificar el apellido, S/N: ");
					char opcion = dato.next().toUpperCase().charAt(0);

					switch (opcion) {
					case 'S':
						System.out.println("ingrese el nuevo apellido: ");
						String nuevoApellido = dato.next();
						if (nuevoApellido == apellidos[i]) {
							apellidos[i] = nuevoApellido;
						}
						System.out.println("Modificacion realizada correctamente.");
						System.out.println("el nuevo apellido corresponde al numero : " + camisetaBuscada
								+ " y su apellido es: " + nuevoApellido);
						break;
					case 'N':
						System.out.println("Saliendo del programa.");
						buscarcamiseta = false;
						break;
					default:
						System.out.println("Opcion no valida.");
						break;

					}

				}

			}
			break; // Salir del bucle al encontrar camiseta

		}
		System.out.println("------------------------------");
		System.out.println("FIN DEL PROGRAMA");
	}
}