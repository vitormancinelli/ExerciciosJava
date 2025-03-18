package exercicios.exercicio5;

/**
 * 
 * Implementar os metodos abaixo como orientado de forma a completar o objetivo dessa tarefa.
 * 
 * Ao executar o metodo main dessa classe, deverá ser exibido o seguinte menu de operações.
 * 1. Buscar Texto no Vetor
 * 2. Remover Texto do Vetor
 * 3. Adicionar Texto ao Vetor
 * 4. Sair
 * 
 * Após exibir o menu o usuário irá inserir no console a operação desejada e assim o sistema deverá processar.
 * 
 * @author vitor
 *
 */
public class ArrayStarter {

	/**
	 * Quando finalizar a implementação dos metodos, execute esse metodo para testar a implementação
	 */
	public static void main(String[] args) {
		//Exibir no console a o menu com as opções de operações
		
		//Utilizar a classe Scanner para ler o que o usuário digitar no console, opção desejada
		
		//Exibir no console a primeira mensagem perguntando ao usuário qual será o primeiro valor da operação
		//Após conseguir ler o primeiro valor
		//OBS: O primeiro numero deve ser armazenado em variável do tipo int, criadas no metodo main.
		
		//Criar um bloco de condições "switch", pesquisar como é feito condições com "switch" em Java.
		//Esse bloco irá validar a opção selecionada pelo usuário e para cada caso irá chamar um metodo especifico.
		//OBS: Caso não tenha conhecimento sobre metodos em Java, pesquise, porém segue uma breve explicação sobre sua estrutura.
		//--- Metodos pode ter nenhum ou multiplos valores de entradas, sempre exibidos dentro de parenteses.
		//--- Metodos tem um nome, utilizado para invocar/chamar esse metodo, sempre exibidos antes do parenteses.
		//--- Metodos sempre tem um retorno, caso não retorne nenhum valor, irá ter a palavra "void", o valor de retorno vem sempre antes nome do metodo
		//OBS: Para chamar um método, basta utilizar o nome do metodo, seguido por parenteses com os valores de entrada, exemplo "searchTextOnArray(array, target)"
		
		//Dicas
		//Quando estiver trabalhando com Vetores em Java, será quase sempre necessário criar um for loop usando um index para iterar pelo vetor
		//e.g for (int i = 0; i < tamanho do vetor; i++) 
	}
	
	private static String[] searchTextOnArray(String[] array, String target) {
		return null; //Alterar aqui, para buscar no vetor de texto recebido (array) o valor de texto recebido (target)
	}
	
	private static String[] removeTextFromArray(String[] array, String target) {
		return null; //Alterar aqui, para remover no vetor de texto recebido (array) o valor de texto recebido (target)
	}
	
	private static String[] addTextToArray(String[] arrary, String target) {
		return null; //Alterar aqui, para adicionar no vetor de texto recebido (array) o valor de texto recebido (target)
	}
	
}