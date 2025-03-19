package exercicios.exercicio2;
import java.util.Scanner;

/**
 * 
 * Implementar os metodos abaixo como orientado de forma a completar o objetivo dessa tarefa.
 * 
 * Ao executar o metodo main dessa classe, deverá ser perguntado ao usuário o nome dele via console.
 * Após ler o nome que o usuário digitou , o sistema deverá exibir no console o seguinte texto "Olá XX, sejá bem vindo ao nosso sistema"
 * 
 * @author vitor
 *
 */
public class InputAndOutput {

	/**
	 * Quando finalizar a implementação dos metodos, execute esse metodo para testar a implementação
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = leitor.nextLine();
		System.out.print("Hello " +nome);
		System.out.print("!");
		leitor.close();
		
		//Exibir no console a seguinte mensagem "Informe seu nome"
		//Utilizar a classe Scanner para ler o que o usuário digitar no console
		//Exibir no console a seguinte mensagem "Olá XX, sejá bem vindo ao nosso sistema"
		//OBS: considerar que XX será o nome recebido
	}
	
}
