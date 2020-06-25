package webScraperAmericanas;

/**
 * Classe de demonstração do Scraper de produtos da loja Americanas (americanas.com.br)
 */
public class App {

	/**
	 * Imprime os dados do produto da URL passada pela linha de comando.
	 *
	 * @param args valores a serem passados pela linha de comando ao programa.
	 *             <p> O primeiro argumento deve ser uma URL do site da Americanas com o produto selecionado.
	 */
	public static void main(String[] args) {

		try {
			if (args[0] != null) {
				System.out.println(AmericanasProductScraper.pegaProdutoDeURL(args[0]));
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("URL inválida. Reinicie o programa com uma URL válida");
		}


	}
}
