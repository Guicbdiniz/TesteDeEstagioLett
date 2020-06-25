package classesFazenda;

/**
 * Galinha da fazenda.
 */
public class Galinha extends Ave {

	/**
	 * Construtor base da galinha.
	 *
	 * @param idade       idade da galinha em anos.
	 * @param tamanhoEmCM altura da galinha em centímetros.
	 * @param corDePena   cor da pena da galinha.
	 */
	public Galinha(int idade, int tamanhoEmCM, String corDePena) {
		super(idade, tamanhoEmCM, corDePena);
	}

	@Override
	public String pegaSomEmitido() {
		return "Cocoricó";
	}

	@Override
	public String toString() {
		return "Galinha de " + getIdade() + " anos, de " + getTamanhoEmCM() + "cm e de pena " + getCorDePena();
	}
}
