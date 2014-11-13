public class Tablero {

	private int[][] areaDeJuego;
	private int tamañoX;
	private int tamañoY;

	public Tablero(final int tamañoX, final int tamañoY) {
		this.tamañoX = tamañoX;
		this.tamañoY = tamañoY;
		areaDeJuego = new int[this.tamañoX][this.tamañoY];
	}

	public boolean estaVacio() {
		return true;
	}

	public void crearCelula(final int x, final int y) {
		areaDeJuego[x][y] = 1;
	}

	public boolean verificarCelulaViva(final int x, final int y) {
		int vecinos = 0;
		vecinos += existeVecinoALaDerecha(x, y);
		vecinos += existeVecinoArribaALaDerecha(x, y);
		vecinos += existeVecinoArriba(x, y);
		vecinos += existeVecinoArribaALaIzquierda(x, y);
		vecinos += existeVecinoALaIzquierda(x, y);
		// System.out.println("Num vecinos: " + vecinos);
		if (vecinos < 2) {
			return false;
		}
		return true;
	}

	private int existeVecinoALaIzquierda(final int x, final int y) {
		if (x - 1 > 0) { // Si hay columna izquierda
			return areaDeJuego[x - 1][y];
		}
		return 0;
	}

	private int existeVecinoArribaALaIzquierda(final int x, final int y) {
		if (x - 1 > 0) { // Si hay columna izquierda
			return areaDeJuego[x - 1][y + 1];
		}
		return 0;
	}

	private int existeVecinoArribaALaDerecha(final int x, final int y) {
		return areaDeJuego[x + 1][y + 1];
	}

	private int existeVecinoArriba(final int x, final int y) {
		return areaDeJuego[x][y + 1];
	}

	private int existeVecinoALaDerecha(final int x, final int y) {
		return areaDeJuego[x + 1][y];
	}

	public void imprimirTablero() {
		for (int y = tamañoY - 1; y >= 0; y--) {
			for (int x = 0; x < tamañoX; x++) {
				System.out.print(areaDeJuego[x][y] + " ");
			}
			System.out.println();
		}
	}

}
