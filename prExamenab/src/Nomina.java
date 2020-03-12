

import Lectura.Leer;

public class Nomina {

	// Variables de instancia
	private float sueldoBase;
	private byte trienios;
	private boolean esJefe;
	private boolean estaCasado;
	private byte numHijos;
	
	// Constructor
	public Nomina(float sueldoBase, byte trienios, boolean esJefe,
			boolean estaCasado, byte numHijos) {
		this.sueldoBase = sueldoBase;
		this.trienios = trienios;
		this.esJefe = esJefe;
		this.estaCasado = estaCasado;
		this.numHijos = numHijos;
	}
	
	
	// Métodos get y set
	public float getSueldoBase() {return sueldoBase;}
	public byte getTrienios() {return trienios;}
	public boolean isEsJefe() {return esJefe;}
	public boolean isEstaCasado() {return estaCasado;}
	public byte getNumHijos() {return numHijos;}

	public void setSueldoBase(float sueldoBase) {this.sueldoBase = sueldoBase;}
	public void setTrienios(byte trienios) {this.trienios = trienios;}
	public void setEsJefe(boolean esJefe) {this.esJefe = esJefe;}
	public void setEstaCasado(boolean estaCasado) {this.estaCasado = estaCasado;}
	public void setNumHijos(byte numHijos) {this.numHijos = numHijos;}

	/**
	 * Calcula la nómina de un trabajador
	 * @return
	 */
	public float calculaNomina()
	{
		// Sueldo neto
		float sueldoNeto=sueldoBase;
		
		// Incrementamos la parte de trienios;
		sueldoNeto = sueldoNeto + (trienios*30);
		
		// Comprobamos si es jefe de departamento
		if (esJefe) sueldoNeto=sueldoNeto+42;
		
		// Comprobaos si esta casado
		if (estaCasado) sueldoNeto=sueldoNeto+60;
		
		// Por cada hijo cobra 18 euros más
		sueldoNeto=sueldoNeto+(numHijos*18);
		
		return sueldoNeto;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables locales
		float sueldoBase;
		byte trienios, numHijos;
		char jefe, casado;
		
		// Pedir los datos del trabajaodr
		System.out.print("Introduzca salario base: ");
		sueldoBase = Leer.leeInt();
		
		System.out.print("¿Cuántos trienios tiene? ");
		trienios = Leer.leeByte();
		
		System.out.print("¿Es jefe de departamento (S/N)? ");
		jefe = Leer.leeChar();
		
		System.out.print("¿Está casado (S/N)? ");
		casado = Leer.leeChar();
		
		System.out.print("¿Cuántos hijos tiene? ");
		numHijos = Leer.leeByte();
		
		// Crear un objeto de la clase nómina
		Nomina ob = new Nomina(sueldoBase, trienios, 
						       jefe=='S'?true:false, 
						       casado=='S'?true:false,
						       numHijos);
	
		// Calcular la nómina del trabajador
		System.out.println("Este trabajador cobra "+ob.calculaNomina()+ " €");
		
	}


	

}
