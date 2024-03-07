public class Cliente {
	
	private String cod_cliente;
	private String nombre;
	private Integer edad;
	
	public Cliente(String cod_cliente,String nombre,Integer newAttr) {
		this.cod_cliente = cod_cliente;
		this.nombre = nombre;
		this.edad = edad;
	}
	public Cliente() {
		this("", "", 0);
	}
	public Cliente crearCliente(String cod_cliente,String nombre,Integer edad) {
		this.cod_cliente = cod_cliente;
		this.nombre = nombre;
		this.edad = edad;
		return this;
	}
	public void verCliente() {
		System.out.println("El código del cliente es:" + cod_cliente);
		System.out.println("El nombre del cliente es:" + nombre);
		System.out.println("El cliente tiene: "+ edad + " años");
		}
}