package Servicios;

public class MenuImplementacion implements MenuInterfaz 
{

public int mostarMenuYSeleccion(comunicacionTecladoM)
   {
		
		int opcionSeleccionada;
		
		System.out.println("###########################");
		System.out.println("0-Cerrar la aplicación");
		System.out.println("1-Operacion igualdad");
		System.out.println("2-Operacion desigualdad");
		System.out.println("###########################");
		
		opcionSeleccionada = comunicacionTecladoM.nextInt();
		return opcionSeleccionada;
   }


public String expresion()
     {
	   String expresion;
	  System.out.println("Introduzca una palabra");
	  
	  expresion= System.in.toString();
	  return expresion;	
     }
}