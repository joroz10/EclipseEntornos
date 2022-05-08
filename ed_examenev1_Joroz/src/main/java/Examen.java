import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		Scanner miscan = new Scanner(System.in);
		int numenu, num2, num3, suma, cont;
		String numstr, palabra;
		do {
			System.out.println(" ");
			System.out.println("Menu");
			System.out.println("====");
			System.out.println("1. Palabra invertida");
			System.out.println("2. Triángulo números");
			System.out.println("3. Suma/Media");
			System.out.println("4. Salir");
			System.out.println(" ");
			System.out.println("Introduce una opción: ");
			numstr = miscan.nextLine();
			numenu = Integer.parseInt(numstr);
			if (numenu == 1) {
				System.out.println("Introduce una palabra");
				palabra = miscan.nextLine();
					for (int i = palabra.length() - 1; i >= 0; i--) {
						System.out.print(palabra.charAt(i));
					};
			
			}else if (numenu == 2) {
					System.out.println("introduce un numero");
					numstr = miscan.nextLine();
					num2 = Integer.parseInt(numstr);
					if (num2 < 0) {
						System.out.println("El numero debe de ser positivo");
					}
				
					for (int i = num2 ; i >= 0; i--) {
							for(int j = 1;j<= i; j++) {
								System.out.print(j+" ");
							}
							System.out.println();
					}
			}else if (numenu == 3) {
				suma = 0;
				cont = 0;
				do {
					System.out.println("Introduce un número (Negativo para salir)");
					numstr = miscan.nextLine();
					num3 = Integer.parseInt(numstr);
					if (num3 >= 0) {
						suma = suma + num3;
						cont++;
					}
				}while(num3 >= 0);
				System.out.println("La suma de los números es: " + suma);
				System.out.println("La suma de los números es: " + suma / cont);
			}else if (numenu == 4) {
				System.out.println("");
				System.out.println("Saliendo...");
			}else {
				System.out.println("Opcion incorrecta");
			}
			}while(numenu != 4);

		}

}
