package ejercicio3;

import java.util.List;
import java.util.ArrayList;
public class CuentaBancaria {

	private static long contadorCuenta = 100_000_000_000L;

	private long numCuenta;
	private Cliente cliente;
	private List<Movimiento> movimientos;

	public CuentaBancaria(Cliente cliente) {
		this(cliente, 0);
	}

	public CuentaBancaria(Cliente cliente, double saldoInicial) {
		this.cliente = new Cliente(cliente.getId(), cliente.getNombre(), 
				cliente.getApellido(), cliente.getFechaNacimiento(), cliente.getEmail());
		
		this.movimientos = new ArrayList<Movimiento>();
		
		if (saldoInicial !=0) {
			movimientos.add(new Movimiento(TipoMoviemiento.INGRESO, 0, saldoInicial,"Apertura de cuenta"));
		}
		this.numCuenta=CuentaBancaria.contadorCuenta;
		CuentaBancaria.contadorCuenta++;
	}

	
	



}
