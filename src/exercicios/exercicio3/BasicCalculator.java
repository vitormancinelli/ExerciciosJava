package exercicios.exercicio3;

/**
 * 
 * Implementar os metodos abaixo como orientado de forma a completar o objetivo dessa tarefa.
 * 
 * Ao executar o metodo main dessa classe, deverá ser exibido o seguinte menu de operações.
 * 1. Somar
 * 2. Subtração
 * 3. Divisão
 * 4. Multiplicação
 * Após exibir o menu o usuário irá inserir no console a operação desejada e assim o sistema deverá calcular.
 * 
 * @author vitor
 *
 */
public class BasicCalculator {

	/**
	 * Quando finalizar a implementação dos metodos, execute esse metodo para testar a implementação
	 */
	public static void main(String[] args) {
		//Exibir no console a o menu com as opções de operações
		
		//Utilizar a classe Scanner para ler o que o usuário digitar no console, opção desejada
		
		//Exibir no console a primeira mensagem perguntando ao usuário qual será o primeiro valor da operação
		//Após conseguir ler o primeiro valor, exibir uma outra mensagem pergutando ao usuário qual será o segundo valor da operação
		//OBS: Os valores do primeiro e segundo numero devem ser armazenados em variáveis do tipo int, criadas no metodo main.
		
		//Criar um bloco de condições "switch", pesquisar como é feito condições com "switch" em Java.
		//Esse bloco irá validar a opção selecionada pelo usuário e para cada caso irá chamar um metodo especifico.
		//OBS: Caso não tenha conhecimento sobre metodos em Java, pesquise, porém segue uma breve explicação sobre sua estrutura.
		//--- Metodos pode ter nenhum ou multiplos valores de entradas, sempre exibidos dentro de parenteses.
		//--- Metodos tem um nome, utilizado para invocar/chamar esse metodo, sempre exibidos antes do parenteses.
		//--- Metodos sempre tem um retorno, caso não retorne nenhum valor, irá ter a palavra "void", o valor de retorno vem sempre antes nome do metodo
		//OBS: Para chamar um método, basta utilizar o nome do metodo, seguido por parenteses com os valores de entrada, exemplo "somar(numero1, numero2)"
	}
	
	private static int somar(int numero1, int numero2) {
		return 0; //Alterar aqui, para retornar a soma
	}
	
	private static int subtrair(int numero1, int numero2) {
		return 0; //Alterar aqui, para retornar a subtração
	}
	
	private static int dividir(int numero1, int numero2) {
		return 0; //Alterar aqui, para retornar a divisão
	}
	
	private static int multiplicar(int numero1, int numero2) {
		return 0; //Alterar aqui, para retornar a multiplicação
	}
}
