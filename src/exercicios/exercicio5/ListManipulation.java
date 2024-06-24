package exercicios.exercicio5;
import java.util.Scanner;
import java.util.ArrayList;
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
		Scanner scanner = new Scanner (System.in);
		
		int op = 0; 
		
		List<Integer> lista = new ArrayList<>();
		
		while (op != 7) {
			op = menu(scanner);
		
			if (op == 7) {
				System.out.println("Obrigado por usar nosso sistema de lista!");
				scanner.close();
				return ;
			}
			switch (op) {
		     case 1:
		    	 System.out.println("Digite o valor a ser inserido na lista");
		    	 adicionarValorNaLista(lista, scanner.nextInt());
		    	 break;
		     case 2:
		    	 calcularMediaValoresNaLista(lista);
		    	 break;
		     case 3:
		    	 encontrarMaiorValorNaLista(lista);
		    	 break;
		     case 4:
		    	 encontrarMenorValorNaLista(lista);
		    	 break;
		     case 5:
		    	 System.out.println("Digite o valor a ser removido da lista.");
		    	 removerValorNaLista(lista, scanner.nextInt());
		    	 break;
		     case 6:
		    	 exibirLista(lista);
		    	 break;
			}
        }
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
	
	private static int menu(Scanner scanner) {
		System.out.println("1. Incluir Novo Valor na Lista");
		System.out.println("2. Calcular Média dos Valores na Lista");
		System.out.println("3. Exibir Maior Valor na Lista");
		System.out.println("4. Exibir Menor Valor na Lista");
		System.out.println("5. Remover Valor na Lista");
		System.out.println("6. Exibir Valores na Lista");
		System.out.println("7. Sair");
		return scanner.nextInt();
	}
	
	private static void adicionarValorNaLista(List<Integer> lista, int valor) {
		//Implementar método para carregar valor dentro da lista, após carregar o valor, exibir mensagem "Valor XX, carregado na lista com sucesso!"
		lista.add(valor);
	}
	
	private static void calcularMediaValoresNaLista(List<Integer> lista) {
		//Implementar método para localizar dentro da lista o menor valor
		//Caso a lista seja vazia, exibir a mensagem "Não foi possível localizar o maior valor da lista, pois a lista está vazia!"
		//Caso consiga calcular a média retorne-a e exiba a mensagem "Média da lista valor XX!"
		
		if (lista.isEmpty()) {
			System.out.println("Lista esta vazia");
        } else {
        	int soma = 0;
    		int media;
        	
        	for(int i = 0; i < lista.size(); i++) {
				soma += lista.get(i); // equivalente a soma = soma + lista.get(i)
			}
			
			media = soma / lista.size();

			System.out.println("Media dos valores na lista = " + media);
        }
	}
	
	private static void encontrarMaiorValorNaLista(List<Integer> lista) {
		//Implementar método para localizar dentro da lista o menor valor
		//Caso a lista seja vazia, exibir a mensagem "Não foi possível localizar o maior valor da lista, pois a lista está vazia!"
		//Caso encontre o maior valor retorne-o e exiba a mensagem "Valor XX, é o maior valor da lista!"
		
		if (lista.isEmpty()) {
			System.out.println("Não foi possível localizar o maior valor da lista, pois a lista está vazia!");
        } else {
        	int maiorvalor = lista.get(0);
    		
    		for(int i = 1; i < lista.size() ; i++) {
    			
    			if (lista.get(i) > maiorvalor) {
    				maiorvalor = lista.get(i);
    			}
    			
    		}

    		System.out.println("Maior Valor Encontrado na Lista = " + maiorvalor);
        }
	}
	
	private static void encontrarMenorValorNaLista(List<Integer> lista) {
		//Implementar método para localizar dentro da lista o menor valor
		//Caso a lista seja vazia, exibir a mensagem "Não foi possível localizar o menor valor da lista, pois a lista está vazia!"
		//Caso encontre o menor valor retorne-o e exiba a mensagem "Valor XX, é o menor valor da lista!"
		
		if (lista.isEmpty()) {
			System.out.println("Não foi possível localizar o menor valor da lista, pois a lista está vazia!");
        } else {
        	Integer menorvalor = lista.get(0);

    		for(int i = 1; i < lista.size() ; i++) {
    			
    			if (lista.get(i) < menorvalor) {
    				menorvalor = lista.get(i);
    			}	
    		}
    		
    		System.out.println("Menor Valor Encontrado na Lista = " + menorvalor);
        }
	}
	
	private static void removerValorNaLista(List<Integer> lista, int valor) {
		//Implementar método para remover um valor especifico dentro da lista
		//Caso a lista seja vazia, exibir a mensagem "Não foi possível remover o valor da lista, pois a lista está vazia!"
		//Caso não encontre o valor a ser removido na lista, exibir a mensagem "Não foi possível remover o valor da lista, pois valor não foi localizado na lista!"
		//Caso encontre o valor e consiga remover da lista, exibir a mensagem "Valor XX, removido da lista com sucesso!"
		
		if (lista.isEmpty()) {
            System.out.println("Não foi possível remover o valor da lista, pois a lista está vazia!");
		} 
		
		int posicao = encontrarPosicaoNaLista(lista, valor);
		
		if (posicao != -1) {
			lista.remove(posicao);
			System.out.println("Valor " + valor + ", removido da lista com sucesso!");
		} else {
			System.out.println("Não foi possível remover o valor da lista, pois valor não foi localizado na lista!");
		}
	}

	private static int encontrarPosicaoNaLista(List<Integer> lista, Integer valor) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == valor) {
				return i;
			}
		}
		
		return -1;
	}
	
	private static void exibirLista(List<Integer> lista) {
		//Implementar método para exibir os valores dentro da lista
		System.out.println(lista);
	}
	
}
