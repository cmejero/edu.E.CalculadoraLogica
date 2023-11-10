package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperacionImplementacion;
import Servicios.OperacionInterfaz;

public class Inicio 
{

	public static void main(String[] args) 		
	{
		String exp1, exp2; 
		MenuInterfaz MI = new MenuImplementacion();
		OperacionInterfaz OI = new OperacionImplementacion();
		
		boolean cerrarMenu = false;
		int opcionUsuario;
		Scanner comunicacionTecladoM = Scanner(System.in);
		while(!cerrarMenu)
		{
			opcionUsuario = mi.mostarMenuYSeleccion(comunicacionTecladoM);
			
			switch(opcionUsuario)
			{
			case 0:
				System.out.println("Se ha ejecutado la opcion 0");
				cerrarMenu=true;
				break;
				
			case 1
				
			
			
			
			}
			
			
		}
		
		
	}

}
