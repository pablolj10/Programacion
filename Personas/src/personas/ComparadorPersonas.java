package personas;

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<persona> {
	
	public static final int ASCENDENTE= 1;
	public static final int DESCENDENTE= 2;
	public static final int EDAD = 1;
	public static final int NOMBRE = 2;
	private int comoOrdenar;
	private int prioridad; 
	
	public ComparadorPersonas () {
		comoOrdenar = ASCENDENTE;
		prioridad = EDAD;
	}

	public void setComoOrdenar(int orden) {
		if(orden==DESCENDENTE) {
			this.comoOrdenar=DESCENDENTE;
		}
		else {
			this.comoOrdenar=ASCENDENTE;
		}
	}
	
	public void setPrioridad (int prioridad) {
		if (prioridad == EDAD) {
			this.prioridad = EDAD;
		}
		if (prioridad == NOMBRE) {
			this.prioridad = NOMBRE;
		}
	}
	
	@Override
	public int compare(persona p1, persona p2) {
		int devolver = 0;
		if (comoOrdenar == ASCENDENTE) {
			devolver = p1.getEdad() - p2.getEdad();
		}
		else {
			devolver = p2.getEdad() - p1.getEdad();
		}
		return devolver;
	}

	


}
