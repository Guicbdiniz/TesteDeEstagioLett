package classesFazenda;

/**
 * Animal da fazenda.
 */
public abstract class Animal {

	private int idade;
	private final int tamanhoEmCM;

	/**
	 * Construtor base do animal.
	 *
	 * @param idade       idade do animal em anos.
	 * @param tamanhoEmCM altura do animal em centímetros.
	 */
	public Animal(int idade, int tamanhoEmCM) {
		this.idade = idade;
		this.tamanhoEmCM = tamanhoEmCM;
	}

	/**
	 * Aumenta idade do animal em um ano.
	 */
	public void aumentaIdadeEmUmAno() {
		this.idade++;
	}

	/**
	 * @return idade em anos do animal.
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @return altura do animal em centímetros.
	 */
	public int getTamanhoEmCM() {
		return tamanhoEmCM;
	}

	/**
	 * @return onomatopeia de som emitido pelo animal.
	 */
	public abstract String pegaSomEmitido();
}
