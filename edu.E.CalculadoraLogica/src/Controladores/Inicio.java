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
		
		String exp1 , exp2;
		
		
			
		MenuInterfaz MI = new MenuImplementacion();
		OperacionInterfaz OI = new OperacionImplementacion();
		
		boolean cerrarMenu = false;
		int opcionUsuario;
		Scanner comunicacionTeclado = new Scanner(System.in);
		
		
		while(!cerrarMenu)
		{
			opcionUsuario = MI.mostarMenuYSeleccion(comunicacionTeclado);
			
			switch(opcionUsuario)
			{
			case 0:
				System.out.println("Se ha ejecutado la opcion 0");
				cerrarMenu=true;
				break;
				
			case 1:
				System.out.println("Se ha ejecutado la opcion 1");
				exp1=MI.expresion(comunicacionTeclado);
				exp2=MI.expresion(comunicacionTeclado);
				
				OI.operacionIgualdad(exp1, exp2);
				
				break;
		
		
			case 2:
				System.out.println("Se ha ejecutado la opcion 2");
				exp1=MI.expresion(comunicacionTeclado);
				exp2=MI.expresion(comunicacionTeclado);
				OI.operacionDesigualdad(exp1, exp2);
				break;
				
			default:
				System.out.println("La opcion no corresponde a ninguna");
				break;
				
				
			
			
			
			}
			
			
		}
		
		
	}

}
