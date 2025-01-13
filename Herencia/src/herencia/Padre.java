package herencia;

public class Padre {
	public String nombre;
	private String herencia;
	private String cantidad;
	public String num_hijas;	
	
	public Padre() {
	super();
	this.nombre = "";
	this.herencia = "";
	this.cantidad = "";
	this.num_hijas = "";
	}
	
	public Padre(String nombre, String herencia, String cantidad, String num_hijas) {
	super();
	this.nombre = nombre;
	this.herencia = herencia;
	this.cantidad = cantidad;
	this.num_hijas = num_hijas;
	}
	public void mostrar(String TipoImpresion) 
	{
		if (TipoImpresion.equals("Confidencial")) 
		{
			System.out.println("**CONFIDENCIAL**");
			System.out.println("Nombre: "+ this.nombre);
			System.out.println("herencia: "+ this.herencia);
			System.out.println("cantidad: "+ this.cantidad);
			System.out.println("numdehijas: "+ this.num_hijas);
		}
		else 
		{
			System.out.println("**DATOS PUBLICOS**");
			System.out.println("Nombre: "+ this.nombre);
			System.out.println("numdehijas: "+ this.num_hijas);
		
	}}}


