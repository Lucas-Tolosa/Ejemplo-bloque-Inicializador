package bloqInic;

public class Empleado {
	
	public Empleado(int sueldo) {
		Inicio i = new Inicio(sueldo);
		this.Id = i.getId();
	}
	private int Id;
	public void responderGritos() {
		System.out.println("Disculpe señora, nosotros no ponemos los precios");
	}
}
