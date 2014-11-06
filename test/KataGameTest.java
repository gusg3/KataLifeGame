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
			if (x + 1 <= tamañoX) {
				if (y - 1 < 0) {
					//y esta en el borde de abajo de las y no es esquina
					verificarCelula(x + 1, y); //verifica lado derecho
					verificarCelula(x - 1, y); //verifica lado izquierdo
					verificarCelula(x, y + 1); // verifica arriba
					verificarCelula(x + 1, y + 1); //verifica superior derecho
					verificarCelula(x - 1, y + 1); //verifica superrior izquierdo
				} else {
					if(y+1 <= tamañoY){
						//esta en centro de x y
						verificarCelula(x + 1, y);
						verificarCelula(x + 1, y - 1);
						verificarCelula(x + 1, y + 1);
						verificarCelula(x, y - 1);
						verificarCelula(x, y + 1);
						verificarCelula(x - 1, y);
						verificarCelula(x - 1, y - 1);
						verificarCelula(x - 1, y + 1);
					} else {
						//esta en borde superior en el centro no es equina
						verificarCelula(x + 1, y); //verifica lado derecho
						verificarCelula(x - 1, y); //verifica lado izquierdo
						verificarCelula(x, y - 1); //verifica abajo
						verificarCelula(x + 1, y - 1); //verifica abajo derecho
						verificarCelula(x - 1, y - 1); //verifica abajo izquierdo
					}
				}
				
			} else {
				if (y - 1 < 0) {
					// esta en la esquina inferior derecha
					verificarCelula(x - 1, y); //verifica lado izquierdo
					verificarCelula(x, y + 1); // verifica arriba
					verificarCelula(x - 1, y + 1); //verifica superrior izquierdo
				} else {
					//y esta en medio
					if(y+1 <= tamañoY){
						//esta en el borde derecho
						verificarCelula(x, y + 1); // verifica arriba
						verificarCelula(x, y - 1); //verifica abajo
						verificarCelula(x - 1, y); //verifica lado izquierdo
						verificarCelula(x - 1, y + 1); //verifica superrior izquierdo
						verificarCelula(x - 1, y - 1); //verifica abajo izquierdo
					} else {
						//esta en esquina superior derecha
					}
				}
			}
		} else {
			//x esta en el borde izquierdo
			if (y - 1 < 0) {
				// esta en la esquina inferior izquierda
			} else {
				//y esta en medio
				if(y+1 <= tamañoY){
					//esta en el borde izquierdo
				} else {
					//esta en esquina superior izquierda
				}
			}
		}
		return 0;
	}
	
	
	verificarCelula(x + 1, y);
	verificarCelula(x + 1, y - 1);
	verificarCelula(x + 1, y + 1);
	verificarCelula(x, y - 1);
	verificarCelula(x, y + 1);
	verificarCelula(x - 1, y);
	verificarCelula(x - 1, y - 1);
	verificarCelula(x - 1, y + 1);

	private int verificarCelula(final int x, final int y) {
		if (coordenadas[x][y] == 1) {
			return 1;
		} else {
			return 0;
		}
	}

}
