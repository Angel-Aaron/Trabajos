/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PruebaEmpleado {

	public static void main(String[] args) 
	{
		
				
		Scanner entrada = new Scanner(System.in);

     	System.out.printf("\n%s\n","Empleado 1:");
		System.out.print("Nombre: ");
		String nom2 = entrada.nextLine();
		System.out.print("Apellido: ");
		String ape2 = entrada.nextLine();
		System.out.print("Salario: ");
		double sal2 = entrada.nextDouble();
		Empleado miEmpleado2 = new Empleado(nom2,ape2,sal2);
		

		String n2 = entrada.nextLine();
		
		
		System.out.println();
			
		System.out.printf("\n%s\n","Empleado 2:");
		System.out.print("Nombre: ");
		String nom = entrada.nextLine();
		System.out.print("Apellido: ");
		String ape = entrada.nextLine();
		System.out.print("Salario: ");
		double sal = entrada.nextDouble();
		Empleado miEmpleado = new Empleado();
		miEmpleado.setNombre(nom);
		miEmpleado.setApellido(ape);
		miEmpleado.setSalario(sal);
		
				
		System.out.printf("\n\t%s\n","Datos de Empleados");
	
		System.out.printf("\n%s","Empleado 1:");
		System.out.printf("\n%s %s\n","- Nombre:",miEmpleado2.getNombre());
		System.out.printf("%s %s\n","- Apellido:",miEmpleado2.getApellido());
		System.out.printf("%s %.2f %s\n","- Salario Anual:",miEmpleado2.SueldoAnual(),"Bs.");
		
		System.out.printf("\n%s","Empleado 2:");
		System.out.printf("\n%s %s\n","- Nombre:",miEmpleado.getNombre());
		System.out.printf("%s %s\n","- Apellido:",miEmpleado.getApellido());
		System.out.printf("%s %.2f %s\n","- Salario Anual:",miEmpleado.SueldoAnual(),"Bs.");
	
		System.out.println("\nAumento del 10%");
		System.out.printf("\n%s","Empleado 1:");
		System.out.printf("\n%s %.2f %s\n","- Nuevo Salario Anual:",miEmpleado2.NuevoSueldo(),"Bs.");
		System.out.printf("\n%s","Empleado 2:");
		System.out.printf("\n%s %.2f %s\n","- Nuevo Salario Anual:",miEmpleado.NuevoSueldo(),"Bs.");
	
	}
	
}

