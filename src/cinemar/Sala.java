package cinemar;

public class Sala {
	private int fila = 0;
	private int columna = 0;
	private boolean[][] matriz;

	public Sala() {

	}

	public Sala(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public boolean[][] getMatriz() {
		return matriz;
	}

	public void generarsala() {
		this.matriz = new boolean[fila][columna];
		for (int f = 0; f < fila; f++) {
			for (int c = 0; c < columna; c++) {
				matriz[f][c] = true;
			}
		}
	}

	public void ocupar(int f, int c) {
		if (f < this.fila & c < this.columna) {
			this.matriz[f][c] = false;
		} else
			System.out.println("Fuera de rango");
	}

	public void mostrar() {
		for (int f = 0; f < this.fila; f++) {
			for (int c = 0; c < this.columna; c++) {
				if (matriz[f][c] == true) {
					System.out.printf("D ");
				} else
					System.out.printf("O ");
			}
			System.out.println();
		}
	}
}