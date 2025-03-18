package exercicios.exercicio6;

import java.util.List;

/**
 * 
 * Implementar os metodos abaixo como orientado de forma a completar o objetivo dessa tarefa.
 * 
 * Ao executar o metodo main dessa classe, deverá ser exibido o seguinte menu de operações.
 * 1. Incluir Novos Valores na Lista
 * 2. Calcular Média dos Valores na Lista
 * 3. Exibir Maior Valor na Lista
 * 4. Exibir Menor Valor na Lista
 * 5. Remover Valor na Lista
 * 6. Exibir Valores na Lista
 * 7. Sair
 * 
 * Após exibir o menu o usuário irá inserir no console a operação desejada e assim o sistema deverá realizar a operação.
 * 
 * @author vitor
 *
 */
public class ListManipulation {

	/**
	 * Quando finalizar a implementação dos metodos, execute esse metodo para testar a implementação
	 */
	public static void main(String[] args) {
		//Exibir no console a o menu com as opções de operações
		
		//Utilizar a classe Scanner para ler o que o usuário digitar no console, opção desejada
		//OBS: O menu devera utilizar condição "while" para que se o usuario não escolher a opção "sair" deverá continuar como um loop
		
		//Criar um bloco de condições "switch", pesquisar como é feito condições com "switch" em Java.
		//Esse bloco irá validar a opção selecionada pelo usuário e para cada caso irá chamar um metodo especifico.
		//Caso a operação necessite de um valor de entrada do usuário, realize a pergunta e a leitura do valor antes de chamar o método desejado
		//OBS: Caso tenha um valor a ser recebido pelo usuário antes de chamar o método desejado, criar uma váriavel dentro do Case que deve estar dentro do Switch para decidir as operações do menu
		
		//OBS: Caso não tenha conhecimento sobre metodos em Java, pesquise, porém segue uma breve explicação sobre sua estrutura.
		//--- Metodos pode ter nenhum ou multiplos valores de entradas, sempre exibidos dentro de parenteses.
		//--- Metodos tem um nome, utilizado para invocar/chamar esse metodo, sempre exibidos antes do parenteses.
		//--- Metodos sempre tem um retorno, caso não retorne nenhum valor, irá ter a palavra "void", o valor de retorno vem sempre antes nome do metodo
		//OBS: Para chamar um método, basta utilizar o nome do metodo, seguido por parenteses com os valores de entrada, exemplo "adicionarValorNaLista(lista, valor)"
	}
	
	private static void adicionarValorNaLista(List<Integer> lista, int valor) {
		//Implementar método para carregar valor dentro da lista, após carregar o valor, exibir mensagem "Valor XX, carregado na lista com sucesso!"
	}
	
	private static int calcularMediaValoresNaLista(List<Integer> lista) {
		//Implementar método para localizar dentro da lista o menor valor
		//Caso a lista seja vazia, exibir a mensagem "Não foi possível localizar o maior valor da lista, pois a lista está vazia!"
		//Caso consiga calcular a média retorne-a e exiba a mensagem "Média da lista valor XX!"
		return 0;
	}
	
	private static int encontrarMaiorValorNaLista(List<Integer> lista, int valor) {
		//Implementar método para localizar dentro da lista o menor valor
		//Caso a lista seja vazia, exibir a mensagem "Não foi possível localizar o maior valor da lista, pois a lista está vazia!"
		//Caso encontre o maior valor retorne-o e exiba a mensagem "Valor XX, é o maior valor da lista!"
		return 0;
	}
	
	private static int encontrarMenorValorNaLista(List<Integer> lista, int valor) {
		//Implementar método para localizar dentro da lista o menor valor
		//Caso a lista seja vazia, exibir a mensagem "Não foi possível localizar o menor valor da lista, pois a lista está vazia!"
		//Caso encontre o menor valor retorne-o e exiba a mensagem "Valor XX, é o menor valor da lista!"
		return 0;
	}
	
	private static void removerValorNaLista(List<Integer> lista, int valor) {
		//Implementar método para remover um valor especifico dentro da lista
		//Caso a lista seja vazia, exibir a mensagem "Não foi possível remover o valor da lista, pois a lista está vazia!"
		//Caso não encontre o valor a ser removido na lista, exibir a mensagem "Não foi possível remover o valor da lista, pois valor não foi localizado na lista!"
		//Caso encontre o valor e consiga remover da lista, exibir a mensagem "Valor XX, removido da lista com sucesso!"
	}
	
	private static void exibirLista(List<Integer> lista) {
		//Implementar método para exibir os valores dentro da lista
	}
	
}
