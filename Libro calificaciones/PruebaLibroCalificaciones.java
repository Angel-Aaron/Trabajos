
package librocalificaciones;

import java.util.Scanner;

public class PruebaLibroCalificaciones {

	public static void main(String[] args) 
	{
		
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
		

		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escriba el Nombre del Curso: ");
		String nombreCurso = entrada.nextLine();
		miLibroCalificaciones.setNombreCurso(nombreCurso);
		System.out.println();
		
		System.out.print("Nombre del profesor: ");
		String nomProf = entrada.nextLine();
		miLibroCalificaciones.setNombreProfesor(nomProf);
		System.out.println();
		

		miLibroCalificaciones.mostrarMensaje();

		
	}
	
}
