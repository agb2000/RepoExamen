

public class Libreria {

	/**
	 * Variables de instancia
	 */
	private int num;
	
	/**
	 * Constructor
	 */
	public Libreria(int num) {
		this.num = num;
	}
	

	public boolean esPrimo() 
	{
		boolean p=true;
	    int cont=2;
	    while ((cont<=(num/2)) && (p==true))  
	    {
	        if ((num%cont)==0) // He encontrado un divisor
	            p=false;                
	        cont++;                  
	    }
	    return p;
	}
	
	public long factorial() 
	{
		
		if (num<0) return -1;  // No existe el factorial de numeros negativos
		
		int f=1, i;
		for (i=2; i<=num; i++)
		    f=f*i;
		return f;   
	}
}
