package ar.edu.utn.intermedio.java.ejercicio2;

import java.util.Comparator;

public class CompararAlfabetico implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}

}
