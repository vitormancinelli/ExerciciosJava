package exercicios.exercicio7;

/**
 * 
 * Implementar os metodos abaixo como orientado de forma a completar o objetivo dessa tarefa.
 * 
 * Ao iniciar o sistema deverá ser realizado as perguntas para receber os valores do Produto a ser Criado
 * 
 * Esse sistema não precisará de menu, pois sua execução será simples, tendo como foco a criação de Objetos.
 * 
 * @author vitor
 *
 */
public class ProductRegister {

	/**
	 * Quando finalizar a implementação dos metodos, execute esse metodo para testar a implementação
	 */
	public static void main(String[] args) {
		//Utilizar a classe Scanner para ler os valores que o usuário digitar no console
		//Os valores inseridos pelo usuário serão utilizados para criar o Produto
		//Os valores necessários serão:
		//Codigo -> Numerico
		//Nome -> Texto
		//Valor -> Numerico
		//Tipo -> Texto
		
		//OBS: Caso não tenha conhecimento sobre Objetos em Java, pesquise, porém segue uma breve explicação sobre sua estrutura.
		//--- Java é uma linguagem orientada a objetos, ou seja os fluxos dos sistemas criados em Java devem ser focados em Objetos e não a processos
		//--- Objeto normalmente é uma classe que deve ter váriaveis contendo a estrutura dos valores que serão armazenados no mesmo.
		//--- Para utilizar um Objeto é necessário criar uma instancia do Objeto, dessa forma você cria uma váriavel contendo a estrutura do Objeto, porém sem nenhum valor dessa forma você pode ter varias intancias do mesmo Objeto sem interferir um no outro
		//--- Para criar uma instancia de um Objeto é necessário utilizar um método construtor para gerar a estrutura do Objeto, new + Nome da Classe + Valores de Entrada do Método, Exemplo: new Product()
		//OBS: Para criar uma instancia de um Objeto é similar a criação de uma váriavel normal, Nome do Objeto + Nome da Variavel. Exemplo: Product primeiroProduto = new Product();
		//OBS: Por padrão toda classe tem um construtor que não recebe nenhum valor de entrada e retorna a estrutura do Objeto sem nenhum valor preenchido, porém podemos sobrescrever o construtor padrão apenas criando um novo construtor
		//--- No caso de criação do produto temos duas forma comuns de criar carregar os valores no Produto criado, Exemplo 1: new Product(1, "banana", 10, "fruta");
		//--- Exemplo 2: Product primeiroProduto = new Product(); 
		//--- primeiroProduto.codigo = 1;
		//--- primeiroProduto.nome = "banana";
		//--- primeiroProduto.valor = 10;
		//--- primeiroProduto.tipo = "fruta";
		//OBS: Ambos os exemplos tem o mesmo resultado, PORÉM para que o Exemplo 1 seja possível é ncessário criar um construtor para receber os 4 valores
		//--- Para facilitar o entendimento consulte a classe Product dentro do pacote "exercicio6" onde irá ter um construtor padrão e um construtor para o Exemplo 1
	}
	
}
