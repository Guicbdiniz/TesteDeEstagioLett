package classesFazenda;

/**
 * Classe de demonstração das classes da primeira parte do projeto.
 */
public class App {

	/**
	 * Imprime os dados do animal criado a partir dos dados passado pela linha de comando.
	 *
	 * @param args valores a serem passados pela linha de comando ao programa.
	 *             <p> O primeiro valor deve ser o nome do tipo de animal criado.
	 *             <p> O segundo e o terceiro devem ser a idade e tamanho do animal, respectivamente.
	 *             <p> O quarto deve ser a cor do pelo (ou cor da pena) do animal.
	 */
	public static void main(String[] args) {

		try {
			if (args.length == 4) {

				String tipoDeAnimal = args[0].toLowerCase();
				int idadeDoAnimal = Integer.parseInt(args[1]);
				int alturaDoAnimal = Integer.parseInt(args[2]);
				String corDoPeloOuPenaDoAnimal = args[3];

				Animal animal = switch (tipoDeAnimal) {
					case "galinha" -> new Galinha(idadeDoAnimal, alturaDoAnimal, corDoPeloOuPenaDoAnimal);
					case "morcego" -> new Morcego(idadeDoAnimal, alturaDoAnimal, corDoPeloOuPenaDoAnimal);
					case "pato" -> new Pato(idadeDoAnimal, alturaDoAnimal, corDoPeloOuPenaDoAnimal);
					case "vaca" -> new Vaca(idadeDoAnimal, alturaDoAnimal, corDoPeloOuPenaDoAnimal);
					default -> throw new Exception();
				};

				imprimeAnimal(animal);

			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			imprimeMensagemDeErro();
		}

	}

	/**
	 * Imprime mensagem de erro no std output.
	 */
	private static void imprimeMensagemDeErro() {
		System.out.println("Houve um erro no programa, favor reiniciá-lo com os valores corretos.");
	}

	/**
	 * Imprime animal criado no std output.
	 */
	private static void imprimeAnimal(Animal animal) {
		System.out.println("Animal criado:\n");
		System.out.println(animal);
	}

}
