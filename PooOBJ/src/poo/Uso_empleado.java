package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
		
		
	
		/*Empleado empleado1= new Empleado("manuela garcia ", 85000, 1990,12,17);
		Empleado empleado2 = new Empleado("jorge garcia ", 96000, 1998,06,20);
		Empleado empleado3 = new Empleado("maria silva ", 61000, 2001,03,12);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		System.out.println("Nombre: "+ empleado1.dameNombre() + 
				" sueldo: " + empleado1.dameSueldo()+ " fecha de alta: "+
				empleado1.dameFechaContrato());
		System.out.println("Nombre: "+ empleado2.dameNombre() + 
				" sueldo: " + empleado2.dameSueldo()+ " fecha de alta: "+
				empleado2.dameFechaContrato());
		System.out.println("Nombre: "+ empleado3.dameNombre() + 
				" sueldo: " + empleado3.dameSueldo()+ " fecha de alta: "+
				empleado3.dameFechaContrato()); */

	
		Empleado[] misEmpleados= new Empleado[4];
		misEmpleados[0]=new Empleado("manuela garcia", 85000, 1990,12,17);
		misEmpleados[1]=new Empleado("jorge garcia", 96000, 1998,06,20);
		misEmpleados[2]=new Empleado("maria silva ", 61000, 2001,03,12);
		misEmpleados[3]=new Empleado("juan andres");
		
		 /*for(int i=0; i<misEmpleados.length; i++) {
			misEmpleados[i].subeSueldo(5);
			} */
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		/*for(int i=0;i<misEmpleados.length; i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre()+
					" sueldo: "+ misEmpleados[i].dameSueldo()
					+ "fecha de alta: "+ misEmpleados[i].dameFechaContrato());
					} 
					*/
		 for (Empleado e: misEmpleados) {
			 System.out.println("Nombre: " + e.dameNombre()+
						" sueldo: "+ e.dameSueldo()
						+ " fecha de alta: "+ e.dameFechaContrato());
						
			 
		 }
	}
}

class Empleado{
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
	}
	public Empleado(String nom) {
		this(nom, 3000,2000,01,01);
	}
	
	public String dameNombre() { //getter
		return nombre;
	}
	public double dameSueldo() { //getter
		return sueldo;
	}
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	private String nombre;
	private  double sueldo;
	private Date altaContrato;
}