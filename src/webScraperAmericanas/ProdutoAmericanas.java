package webScraperAmericanas;

import java.util.List;
import java.util.Map;

/**
 * Dados de um produto do catálogo online da loja Americanas.
 * <p>
 * Os dados analisados foram o nome do produto (título), seu preço (se disponível), as urls das imagens do produto e sua
 * ficha técnica (uma tabela com informações técnicas do produto).
 */
public class ProdutoAmericanas {

	private final List<String> urlDasImagens;
	private final String titulo;
	private final String preco;
	private final Map<String, String> fichaTecnica;

	/**
	 * Construtor padrão.
	 *
	 * @param urlDasImagens lista de urls das imagens do produto.
	 * @param titulo        título do produto.
	 * @param preco         preço do produto.
	 * @param fichaTecnica  dicionário com informações tecnicas do produto.
	 */
	public ProdutoAmericanas(List<String> urlDasImagens, String titulo, String preco,
							 Map<String, String> fichaTecnica) {
		this.urlDasImagens = urlDasImagens;
		this.titulo = titulo;
		this.preco = preco;
		this.fichaTecnica = fichaTecnica;
	}

	@Override
	public String toString() {
		StringBuilder produtoEmTexto = new StringBuilder();

		// Escreve título do produto.
		produtoEmTexto
				.append("Título: ")
				.append(titulo)
				.append("\n");

		// Escreve preço.
		if (preco == null || preco.equals("")) {
			produtoEmTexto
					.append("Produto Indisponível.");
		} else {
			produtoEmTexto
					.append("Preço: ")
					.append(preco)
					.append("\n");
		}

		// Escreve url das imagens.
		produtoEmTexto.append("Url das imagens:\n");
		for (String url : urlDasImagens) {
			produtoEmTexto
					.append("\t")
					.append(url)
					.append("\n");
		}

		// Escreve ficha técnica.
		produtoEmTexto.append("Ficha Técnica:\n");
		for (Map.Entry<String, String> informacaoTecnica : fichaTecnica.entrySet()) {
			produtoEmTexto
					.append("\t")
					.append(informacaoTecnica.getKey())
					.append(": ")
					.append(informacaoTecnica.getValue())
					.append("\n");
		}

		return produtoEmTexto.toString();
	}
}
