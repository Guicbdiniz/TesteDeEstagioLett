package classesFazenda;

/**
 * Morcego da fazenda.
 */
public class Morcego extends Mamifero implements Voador {

	/**
	 * Construtor padrão de Morcego.
	 *
	 * @param idade       idade do morcego em anos.
	 * @param tamanhoEmCM altura do morcego em centímetros.
	 * @param corDoPelo   cor do pelo do morcego.
	 */
	public Morcego(int idade, int tamanhoEmCM, String corDoPelo) {
		super(idade, tamanhoEmCM, corDoPelo);
	}

	@Override
	public String pegaSomEmitido() {
		return "Screech";
	}

	@Override
	public int pegaAltitudeDeVooEmMetros() {
		return 100;
	}

	@Override
	public String toString() {
		return "Morcego de " + getIdade() + " anos, de " + getTamanhoEmCM() + "cm e de pelo " + getCorDoPelo() +
				"\nEle voa " + pegaAltitudeDeVooEmMetros() + " metros";
	}
}
