package webScraperAmericanas;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Coletor de dados de produtos do site de compras da Americanas (americanas.com.br)
 */
public class AmericanasProductScraper {

	private final Document documentoHtml;

	/**
	 * Construtor privado padrão.
	 *
	 * @param urlDoProduto - url do produto que terá seus dados analisado.
	 * @throws IOException se a url passada não for válida ou se não for possível fazer uma conexão.
	 */
	private AmericanasProductScraper(String urlDoProduto) throws IOException {
		documentoHtml = Jsoup.connect(urlDoProduto).get();
	}

	/**
	 * @return dados do produto do documento HTML analisado.
	 */
	private ProdutoAmericanas pegaProdutoDoDocumentoHTML() {
		String titulo = pegaTituloDoProdutoDoDocumento();
		String preco = pegaPrecoDoProdutoDoDocumento();
		List<String> urlDasImagens = pegaUrlDasImagensDoProdutoDoDocumento();
		Map<String, String> fichaTecnica = pegaFichaTecnicaDoProdutoDoDocumento();

		return new ProdutoAmericanas(urlDasImagens, titulo, preco, fichaTecnica);
	}

	/**
	 * Usa de seletores de tags CSS para identificar o título do produto do documento HTML.
	 *
	 * @return título do produto do documento HTML analisado.
	 */
	private String pegaTituloDoProdutoDoDocumento() {
		return documentoHtml
				.select("#product-name-default")
				.text();
	}

	/**
	 * Usa de seletores de tags CSS para identificar o preço do produto do documento HTML.
	 *
	 * @return preço do produto do documento HTML analisado.
	 */
	private String pegaPrecoDoProdutoDoDocumento() {
		String preco = documentoHtml
				.select(".main-price .sales-price")
				.text();

		if (preco == null) {
			preco = "";
		}

		return preco;
	}

	/**
	 * Usa de seletores de tags CSS para identificar a url das imagens do produto do documento HTML.
	 *
	 * @return lista de URLs das imagens do produto do documento HTML analisado.
	 */
	private List<String> pegaUrlDasImagensDoProdutoDoDocumento() {
		return documentoHtml
				.select(".image-gallery-thumbnails a img")
				.stream()
				.map(element -> element.attr("src"))
				.collect(Collectors.toList());
	}

	/**
	 * Usa de seletores de tags CSS para identificar as informações técnicas do produto do documento.
	 *
	 * @return dicionário de informações técnicas do produto do documento HTML analisado.
	 */
	private Map<String, String> pegaFichaTecnicaDoProdutoDoDocumento() {
		Elements elementoDeFichaTecnica = documentoHtml.select("#info-section table tr");

		if (elementoDeFichaTecnica == null || elementoDeFichaTecnica.isEmpty()) {
			return new HashMap<>();
		} else {
			return elementoDeFichaTecnica.stream()
					.map(element -> {
						Elements elementosDaInformacaoTecnica = element.select("td span");
						String nomeDaInformacaoTecnica = elementosDaInformacaoTecnica.get(0).text();
						String valorDaInformacaoTecnica = elementosDaInformacaoTecnica.get(1).text();
						return new AbstractMap.SimpleEntry<>(nomeDaInformacaoTecnica, valorDaInformacaoTecnica);
					})
					.collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
		}
	}

	/**
	 * @param url - url do produto que terá seus dados analisado.
	 * @return dados do produto da url.
	 * @throws IOException se a url passada não for válida ou se não for possível fazer uma conexão
	 */
	public static ProdutoAmericanas pegaProdutoDeURL(String url) throws IOException {
		AmericanasProductScraper scraper = new AmericanasProductScraper(url);

		return scraper.pegaProdutoDoDocumentoHTML();
	}

}
