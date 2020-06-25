package classesFazenda;

/**
 * Vaca da fazenda.
 */
public class Vaca extends Mamifero {

	/**
	 * Construtor padrão de Vaca.
	 *
	 * @param idade       idade da vaca em anos.
	 * @param tamanhoEmCM altura da cava em centímetros.
	 * @param corDoPelo   cor do pelo da vaca.
	 */
	public Vaca(int idade, int tamanhoEmCM, String corDoPelo) {
		super(idade, tamanhoEmCM, corDoPelo);
	}

	@Override
	public String pegaSomEmitido() {
		return "Muuuuuuuuu";
	}

	@Override
	public String toString() {
		return "Vaca de " + getIdade() + " anos, de " + getTamanhoEmCM() + "cm e de pelo " + getCorDoPelo();
	}
}
