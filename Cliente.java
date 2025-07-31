package bloqInic;

import java.util.Random;

public class Cliente {
	public Cliente(int sueldo){
		Inicio i = new Inicio(sueldo);
	}
	
	
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente(2);
		Cliente c2 = new Cliente(3);
		Cliente c3 = new Cliente(4);
	}
}
