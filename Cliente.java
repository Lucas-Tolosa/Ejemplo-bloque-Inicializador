package bloqInic;

import java.util.Random;

public class Cliente {
	public Cliente(int sueldo){
		Inicio i = new Inicio(sueldo);
		int id = Inicio.getId();
	}
	private int id;
	public void gritarAEmpleado() {
		System.out.println("¡Pero como puede ser que este todo tan caro!¡que verguenza!");
	}
}
