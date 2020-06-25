package classesFazenda;

/**
 * Pato da fazenda.
 */
public class Pato extends Ave implements Voador {

	/**
	 * Construtor padrão de Pato.
	 *
	 * @param idade       idade do pato em anos.
	 * @param tamanhoEmCM altura do pato em centímetros.
	 * @param corDePena   cor da pena do pato.
	 */
	public Pato(int idade, int tamanhoEmCM, String corDePena) {
		super(idade, tamanhoEmCM, corDePena);
	}

	@Override
	public String pegaSomEmitido() {
		return "Quack";
	}

	@Override
	public int pegaAltitudeDeVooEmMetros() {
		return 2;
	}

	@Override
	public String toString() {
		return "Pato de " + getIdade() + " anos, de " + getTamanhoEmCM() + "cm e de pena " + getCorDePena() +
				"\nEle voa " + pegaAltitudeDeVooEmMetros() + " metros";
	}
}
