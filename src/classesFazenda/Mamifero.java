package classesFazenda;

/**
 * Mamífero da fazenda.
 */
public abstract class Mamifero extends Animal {

	private final String corDoPelo;

	/**
	 * Construtor base de Mamifero.
	 *
	 * @param idade       idade do mamífero em anos.
	 * @param tamanhoEmCM altura do mamífero em centímetros.
	 * @param corDoPelo   cor do pelo do mamífero.
	 */
	public Mamifero(int idade, int tamanhoEmCM, String corDoPelo) {
		super(idade, tamanhoEmCM);
		this.corDoPelo = corDoPelo;
	}

	/**
	 * @return cor do pelo do mamífero.
	 */
	public String getCorDoPelo() {
		return corDoPelo;
	}

	/**
	 * @return mensagem de aviso que o mamífero amamentou.
	 */
	public String amamenta() {
		return "Amamentou";
	}
}
