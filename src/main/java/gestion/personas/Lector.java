package gestion.personas;

import gestion.inventario.Ejemplar;
import gestion.inventario.Prestamo;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Lector extends Persona {
	private boolean estaMultado;
        private Prestamo prestamo;
        private ArrayList<Ejemplar> listaLibros = new ArrayList();

	public Lector() {
	}

	public Lector(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad,
				String domicilio, int codPostal, String localidad, String numCelular, String mail, boolean estaMultado) {
		
		super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, 
				codPostal, localidad, numCelular,mail);
		
		this.estaMultado = estaMultado;
	}

    public boolean isEstaMultado() {
        return estaMultado;
    }

    public void setEstaMultado(boolean estaMultado) {
        this.estaMultado = estaMultado;
    }
    

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    
    public void agragarPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public void agregarLibro(Ejemplar ejemplar) {
        this.listaLibros.add(ejemplar);
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "%nMultado:%s", 
                super.toString(), estaMultado);
    }
	
    
}
