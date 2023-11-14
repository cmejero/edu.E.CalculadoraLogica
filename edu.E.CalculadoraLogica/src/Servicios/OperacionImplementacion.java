package Servicios;

public class OperacionImplementacion implements OperacionInterfaz
{

	
	public void operacionIgualdad(String expresion1 , String expresion2)
	{
		if(expresion1.equals(expresion2) ) 
		{
			
			System.out.println("Es verdadero");	
		}
		else
			 {
			System.out.println("Es falso");
			 }		
	}
	
	public void operacionDesigualdad(String expresion1 , String expresion2)
	{
		if(!expresion1.equals(expresion2))
		{
			System.out.println("Es verdadero");
		}
		else
		{
			System.out.println("Es falso");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
