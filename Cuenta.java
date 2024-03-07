package Banco;

public class Cuenta {
	double cantidad;
	public Cuenta() { /*Constructor por defecto */
		
	}
	public void ingresar(double cantidad) { /*Metodo para ingresar dinero */ 
		this.cantidad+=cantidad;
	}
	public void sacar(double cantidad) { /*Metodo para sacar dinero*/
		this.cantidad-=cantidad;
	}
	public void verCuenta() { /*Metodo para ver la cantidad de dinero en la cuenta */
		System.out.println("La cantidad actual de dinero que tienes es "+cantidad);
	}
}
