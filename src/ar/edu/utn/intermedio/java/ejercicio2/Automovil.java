package ar.edu.utn.intermedio.java.ejercicio2;

public class Automovil extends Vehiculo {

	public Automovil(Integer cantidadRuedas, String color, String marca) {
		super(cantidadRuedas, color, marca);
	}
	

	@Override
	public Integer getCantidadRuedas() {
		return 4;
	}

}
