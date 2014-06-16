
public class MiClase
{
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	{
		return a+b;//devuelve el calculo de el valor ingresado en a mas el valor ingresado en b
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		return a-b;//devuelve el calculo de el valor ingresado en a menos el valor ingresado en b
	}
	
	//devuelve la multiplicación de a y b
	static int multiplicarNumeros(int a, int b)
	{
		return a*b;//devuelve el calculo de el valor ingresado en a por el valor ingresado en b
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	static boolean esPar(int num)
	{
		if (num%2==0){//evalua la condicion si el numero al dividirlo entre 2 es 0 devuelve true
			return true;
		}
		return false;//de lo contrario devuelve false 
	}
	
	//devuelve el numero mayor entre a, b o c
	static int getMayor(int a, int b, int c)
	{
		if (a>b && a>c)//evalua la condicion 
			return a;//devuelve el valor de a si esta es mayor que b y c
		
		if (b>a && b>c)//evalua la condicion
			return b;//devuelve el valor de b si esta es mayor que a y c
		
		if (c>b && c>a)//evalua la condicion
			return c;//devuelve el valor de c si esta es mayor que b y a
		return a;//si todos los valores son iguales devuelve el valor de a,b o c en este caso devuelve a 
	}
		
	
	//devuelve num elevado a la potencia
	static int potencia(int num, int potencia)
	{
		int resul=1;//se declara la variable 
		for (int i=0; i<potencia; i++)//se inicia el ciclo for y el contador 
		{
			resul=resul*num;//realiza el calculo de la potencia 
		}
		return resul;//devuelve el resultado 
	
	}
	
	//devuelve el numero mayor del arreglo
	static int sumarArreglo(int arreglo[])
	{	
		int suma=0;//se declara la variable 
		for (int i=0; i<arreglo.length;i++)//se inicia el ciclo for y el contador 
			suma +=arreglo[i];//se suma los valores del arreglo cuando este es i 
		return suma ;// devuelve el resultado del calculo 
	}
	
	//devuelve el numero mayor de un arreglo
	static int getMayorArreglo(int arreglo[])
	{
	   
		int mayor=arreglo[0];//se declara la variable igualada al arreglo cuando este es 0
		
		for (int i=0; i<arreglo.length; i++ ){//se inicia el ciclo y el contador 
			if (arreglo[i]>mayor){// evalua la condicion si el valor del arreglo cuando es i es mayor que la variable mayor 
				mayor=arreglo[i];//se iguala la variable mayor al arreglo cuando este es i 
			}
		}
		return mayor;//devuelve el valor del num mayor 
		}
		
	   
	//devuelve el numero menor de un arreglo
	static int  getMenorArreglo(int arreglo[])
	{
		
		int menor=arreglo[0];//se declara la variable igualada al arreglo cuando este es 0
		
		for (int i=0; i<arreglo.length; i++ ){//se inicia el ciclo y el contador
			if (arreglo[i]<menor){//evalua la condicion si el valor del arreglo cuando es i es menor que la variable mayor
				menor=arreglo[i];//se iguala la variable mayor al arreglo cuando este es i 
			}
		}
		return menor;//devuelve el valor del num menor
		 
	 	  
	    }
	
	 
	
	//devuelve true si encuentra cadena dentro arreglo
	static boolean existe(String arreglo[],String cadena)
	{ 
		    
		    for (int i=0; i<arreglo.length; i++){//se inicia el ciclo y el contador 
		    String palabra=arreglo[i];//declaramos la variable palabra y la igualamos al arreglo cuando este es i
		    	if (palabra.equals(cadena)){// evalua la condicion si la palabra es igual a la cadena 
		    
		    		return true;//si la condicion se cumple devuelve true 
		    	}
		    }
		    return false;//de lo contrario devuelve false  
	}
			

	
	public static void main(String args[])
	{

	}
}

