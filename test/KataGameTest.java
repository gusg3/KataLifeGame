import org.junit.Test;

public class KataGameTest {

	private int tamañoX;

	private int tamañoY;

	private int[][] coordenadas;

	private int numCorridas;

	private int[][] tablero;

	/*
	 * - Si una celula tiene menos de dos vecinos - muere - Si una celula tiene
	 * dos o tres vecinos - vive - Si una celula tiene mas de tres vecinos -
	 * muere - Si una celula muerta tiene tres vecinos - nace
	 * 
	 * no funcionales - la celula se encuentra en la esquina - la celula se
	 * encuentra en un borde - la celula se encuentra en el centro
	 */

	@Test
	public void cuando_la_celula_esta_en_la_esquina() {
		int x = 0;
		int y = 0;
		int vecinos = checarVecinos(x, y);
	}

	private int checarVecinos(final int x, final int y) {
		if (x - 1 >= 0) {
			// se verifica
		}
		if (y - 1 >= 0) {
			// se verifica
		}
		return 0;
	}

}
