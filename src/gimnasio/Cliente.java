package gimnasio;

import java.util.List;

public class Cliente {

	private String nombre;
	
	private List<Rutina> rutinas;
	
	private List<Dia> dias;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((rutinas == null) ? 0 : rutinas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (rutinas == null) {
			if (other.rutinas != null)
				return false;
		} else if (!rutinas.equals(other.rutinas))
			return false;
		return true;
	}
	
	
}
