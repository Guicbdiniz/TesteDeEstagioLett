package classesFazenda;

/**
 * Ave da fazenda.
 */
public abstract class Ave extends Animal {

	private final String corDePena;

	/**
	 * Construtor base da ave.
	 *
	 * @param idade       idade da ave em anos.
	 * @param tamanhoEmCM altura da ave em centímetros.
	 * @param corDePena   cor da pena da ave.
	 */
	public Ave(int idade, int tamanhoEmCM, String corDePena) {
		super(idade, tamanhoEmCM);
		this.corDePena = corDePena;
	}

	/**
	 * @return cor de pena da ave.
	 */
	public String getCorDePena() {
		return corDePena;
	}

	/**
	 * @return mensagem de alerta que a ave botou um ovo.
	 */
	public String botaOvo() {
		return "Botou um ovo";
	}
}
