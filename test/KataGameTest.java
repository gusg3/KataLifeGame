import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KataGameTest {

	private GameOfLife juego;

	private Tablero tableroInicial;

	@Before
	public void setUp() {
		juego = new GameOfLife();
		tableroInicial = new Tablero(3, 3);
	}

	@Test
	public void DadoUnTableroVacio_AlHacerCorrida_DebeEstarVacio() {
		juego.asignarTablero(new Tablero(3, 3));
		Tablero resultadoTablero = juego.hacerCorrida();
		Assert.assertTrue(resultadoTablero.estaVacio());
	}

	@Test
	public void dadaUnaCelulaConMenosDeDosVecinos_AlHacerCorrida_debeMorir() {
		tableroInicial.crearCelula(0, 0);
		tableroInicial.crearCelula(0, 1);
		juego.asignarTablero(tableroInicial);
		Tablero tableroReSultado = juego.hacerCorrida();
		Assert.assertFalse(tableroReSultado.verificarCelulaViva(0, 0));
	}

	@Test
	public void dadaUnaCelulaConDosVecinos_AlHacerCorrida_debeVivir()
			throws Exception {
		tableroInicial.crearCelula(0, 0);
		tableroInicial.crearCelula(0, 1);
		tableroInicial.crearCelula(1, 0);
		juego.asignarTablero(tableroInicial);
		Tablero tableroReSultado = juego.hacerCorrida();
		Assert.assertTrue(tableroReSultado.verificarCelulaViva(0, 0));

	}

	@Test
	public void dataUnaCelulaConTresVecinos_AlHacerCorrida_DebeVivir() {
		tableroInicial.crearCelula(0, 0);
		tableroInicial.crearCelula(0, 1);
		tableroInicial.crearCelula(1, 1);
		tableroInicial.crearCelula(1, 0);
		juego.asignarTablero(tableroInicial);
		Tablero tableroResultado = juego.hacerCorrida();
		Assert.assertTrue(tableroResultado.verificarCelulaViva(0, 0));
	}

	@Test
	public void dadaUnaCasillaVaciaConTresVecinos_AlHacerCorrida_NaceCelulaEnLaCasilla() {
		tableroInicial.crearCelula(0, 0);
		tableroInicial.crearCelula(0, 1);
		tableroInicial.crearCelula(1, 1);
		tableroInicial.imprimirTablero();
		juego.asignarTablero(tableroInicial);
		Tablero tableroResultado = juego.hacerCorrida();
		Assert.assertTrue(tableroResultado.verificarCelulaViva(1, 0));
	}

}
