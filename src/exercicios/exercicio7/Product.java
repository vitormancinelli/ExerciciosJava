package exercicios.exercicio7;

/**
 * Essa classe tem como objetivo armazenar as informações do Produto
 * 
 * Essa classe deve ter a estrutura do Objeto Produto, para depois ser utilizado no sistema
 * 
 * @author vitor
 *
 */
public class Product {

	//Variável utilizada para armazenar o valor do código do produto
	//Deve ser publica para poder ser acessada de fora dessa classe, utilizando a seguinte forma: nome da variavel + .codigo
	//Exemplo: Product produto = new Product();
	//produto.codigo = 1;
	//System.out.println("Codigo do produto = " + produto.codigo)
	public Integer codigo;
	
	//Variável utilizada para armazenar o valor do nome do produto
	//Deve ser publica para poder ser acessada de fora dessa classe, utilizando a seguinte forma: nome da variavel + .nome
	//Exemplo: Product produto = new Product();
	//produto.nome = "banana";
	//System.out.println("Nome do produto = " + produto.nome)
	public String nome;
	
	//Variável utilizada para armazenar o valor do valor do produto
	//Deve ser publica para poder ser acessada de fora dessa classe, utilizando a seguinte forma: nome da variavel + .valor
	//Exemplo: Product produto = new Product();
	//produto.valor = 10;
	//System.out.println("Valor do produto = " + produto.valor)
	public Integer valor;
	
	//Variável utilizada para armazenar o valor do código do produto
	//Deve ser publica para poder ser acessada de fora dessa classe, utilizando a seguinte forma: nome da variavel + .tipo
	//Exemplo: Product produto = new Product();
	//produto.tipo = "fruta";
	//System.out.println("Codigo do produto = " + produto.tipo)
	public String tipo;
	
	//Método construtor padrão, onde não é recebido nenhum valor, porém por padrões de código não colocamos nenhum valor nas váriaveis, retornado todos as váriaveis do Objeto sem valor
	public Product() {
		
	}
	
	//Método construtor com valor para todas váriaveis
	//Por padrão de código normalmente utilizamos o mesmo nome das váriaveis da classe
	//Para que seja possível apontarmos no código que queremos colocar o valor da váriavel recebida no método na várivel da classe é necessário utilizarmos o "this."
	//O uso do "this." é necessário para indicarmos que queremos acessar algo dentro da Classe e não utilizarmos a váriavel local do método
	//Dessa forma estamos pegando os valores recebidos no método e carregando-os dentro das váriaveis da classe
	//Por isso ao utilizar essa método construtor a instancia dessa classe já vai ter os valores carregados nas váriaveis
	public Product(Integer codigo, String nome, Integer valor, String tipo) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	
}
