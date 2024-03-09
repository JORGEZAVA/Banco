package Banco;

public class Empleado {
	
	private String cod_emp;
	private String nombre;
	
	public Empleado(String cod_emp,String nombre) {
		this.cod_emp = cod_emp;
		this.nombre = nombre;
	}
	public Empleado() {
		
	}
	public Empleado crearEmpleado(String cod_emp,String nombre) {
		this.cod_emp = cod_emp;
		this.nombre = nombre;
		return this;
	}
	public void verEmpleado() {
		System.out.println("El código del empleado es:" + cod_emp);
		System.out.println("El nombre del empleado es:" + nombre);
		}
}