# TesteDeEstagioLett
Teste desenvolvido em Java para o processo seletivo da empresa Lett para a vaga de estágio em WEB Scraping.

## Primeira Etapa
O arquivo UML para a solução da primeira etapa se encontra no diretório inicial do repositório. Todos os demais arquivos Java se encontram na pasta src/classesFazenda. 
Para testar essa primeira etapa, criei uma classe estática chamada App. Para utilizá-la, existe um arquivo já compilado na pasta out/production/AvaliacaoLett/classeFazenda.  
4 parâmetros devem ser passados ao rodá-lo:
1. O tipo de animal criado.
2. A idade do animal (em anos inteiros).
3. O tamanho do animal (sua altura em cm inteiros).
4. A cor da pele (se mamífero) ou a cor da pena (se ave) do animal.

Exemplo de conjunto de parâmetros aceitável:
```
galinha 2 34 Branca
```

## Segunda Etapa
O e-commerce por mim escolhido foi a loja digital da empresa [Americanas](https://www.americanas.com.br/).  
Todos os arquivos Java se encontram na pasta src/webScraperAmericanas.  
Para utiliza-lo, existe um arquivo já compilado na pasta out/production/AvaliacaoLett/webScraperAmericanas chamado App.class.  
Apenas a URL do produto deve ser passada como parâmetro ao rodá-lo.  
O programa irá imprimir na saída de dados padrão todos as informações coletadas do produto, elas sendo:
* Nome do produto
* Preço do produto (se esse estiver disponível)
* Lista de URLs das imagens do produto.
* Lista de informações ténicas do produto.
