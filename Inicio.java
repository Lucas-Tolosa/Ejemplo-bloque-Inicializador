package bloqInic;

public class Inicio {

	    private int sueldo;
	    private static int id;
	    
	    
	    public int getSueldo() {
			return sueldo;
		}

		public void setSueldo(int sueldo) {
			this.sueldo = sueldo;
		}

		public static int getId() {
			return id;
		}

		{ // Bloque de inicialización de instancia
	        sueldo = 0;
	        System.out.println("Bloque de instancia ejecutado");
	        
	    }

	    static { // Bloque de inicialización estático
	        id = 0;
	        System.out.println("Bloque estático ejecutado");
	    }

	    public Inicio(int valor) {
	    	Inicio.id++;
	        this.sueldo = valor;
	        System.out.println(this.id);
	        System.out.println(this.sueldo);
	    }
}
