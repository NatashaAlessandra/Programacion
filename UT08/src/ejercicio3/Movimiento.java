package ejercicio3;

import java.time.LocalDateTime;

public class Movimiento {

	private TipoMoviemiento tipoMovimiento;
	private LocalDateTime fechaHora;
	private double saldoInicial;
	private double importe;
	private double saldoFinal;
	private String concepto;

	public Movimiento(TipoMoviemiento tipoMovimiento, double saldoInicial, double importe, String concepto) {
		switch (tipoMovimiento) {
		case INGRESO, TRANSFERENCIA_FAVOR:
			if (importe < 0) {
				throw new IllegalArgumentException(
						"El importe para ingresos o transferencias bancarias debe ser mayor a que cero");
			}
			break;
		case REINTEGRO, TRANSFERENCIA_CONTRA:
			if (importe >= 0) {
				throw new IllegalArgumentException(
						"El importe para reintegros o transferecnias bancarias de la cuenta debe ser menor que cero");

			}
			break;

		}
		this.tipoMovimiento = tipoMovimiento;
		this.saldoInicial = saldoInicial;
		this.importe = importe;
		this.concepto = concepto;
		this.fechaHora = LocalDateTime.now();
		this.saldoFinal = this.saldoInicial + this.importe;
	}

	public TipoMoviemiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public double getImporte() {
		return importe;
	}

	public double getSaldoFinal() {
		return saldoFinal;
	}

	public String getConcepto() {
		return concepto;
	}

	@Override
	public String toString() {
		return "Movimiento [tipoMovimiento=" + tipoMovimiento + ", fechaHora=" + fechaHora + ", saldoInicial="
				+ saldoInicial + ", importe=" + importe + ", saldoFinal=" + saldoFinal + "]";
	}

	
	
}
