package exercicios.exercicio4;

import java.util.Scanner;

/**
 * 
 * Implementar os metodos abaixo como orientado de forma a completar o objetivo dessa tarefa.
 * 
 * Ao executar o metodo main dessa classe, deverá ser exibido o seguinte menu de operações.
 * 1. Celsius para Kelvin
 * 2. Celsius para Fahrenheit
 * 3. Kelvin para Celsius
 * 4. Kelvin para Fahrenheit
 * 5. Fahrenheit para Celsius4
 * 6. Fahrenheit para Kelvin
 * 
 * Após exibir o menu o usuário irá inserir no console a operação desejada e assim o sistema deverá calcular.
 * 
 * @author vitor
 *
 */
public class TemperatureCalculator {
	/**
	 * Quando finalizar a implementação dos metodos, execute esse metodo para testar a implementação
	 */
	public static void main(String[] args) {
		//Utilizar a classe Scanner para ler o que o usuário digitar no console, opção desejada
		Scanner leitor = new Scanner(System.in);
		int choice = 0;
		
		while(true) {
			showMenu();
			
			System.out.println("Qual o número da opção desejada: ");
			choice = leitor.nextInt();
							
			while(choice < 0 || choice > 7){
				System.out.println("Opção inválida. Digite um número válido: ");
				choice = leitor.nextInt();
			}
			
			double var1;
			
			if(choice < 6 && choice > 0) {
				System.out.println("Temperatura a ser convertida: ");
				var1 = leitor.nextInt();
				
				switch (choice) {
				case 1:
					celsiusParaKelvin(var1);
					break;
				case 2:
					celsiusParaFahrenheit(var1);
					break;
				case 3:
					kelvinParaCelsius(var1);
					break;
				case 4:
					kelvinParaFahrenheit(var1);
					break;
				case 5:
					fahrenheitParaCelsius(var1);
					break;
				case 6:
					fahrenheitParaKelvin(var1);
					break;
				}
			}
			else {
				System.out.println("Tchau!!");
				System.exit(0);
			}
		}
	}
		//Exibir no console a o menu com as opções de operações
		//Exibir no console a primeira mensagem perguntando ao usuário qual será o primeiro valor da operação
		//Após conseguir ler o primeiro valor
		//OBS: O primeiro numero deve ser armazenado em variável do tipo int, criadas no metodo main. -como assim? 		
		//Criar um bloco de condições "switch", pesquisar como é feito condições com "switch" em Java.				
		//Esse bloco irá validar a opção selecionada pelo usuário e para cada caso irá chamar um metodo especifico.
		//OBS: Caso não tenha conhecimento sobre metodos em Java, pesquise, porém segue uma breve explicação sobre sua estrutura.
		//--- Metodos pode ter nenhum ou multiplos valores de entradas, sempre exibidos dentro de parenteses.
		//--- Metodos tem um nome, utilizado para invocar/chamar esse metodo, sempre exibidos antes do parenteses.
		//--- Metodos sempre tem um retorno, caso não retorne nenhum valor, irá ter a palavra "void", o valor de retorno vem sempre antes nome do metodo
		//OBS: Para chamar um método, basta utilizar o nome do metodo, seguido por parenteses com os valores de entrada, exemplo "celsiusParaKelvin(temperatura)"

	private static void showMenu() {
		System.out.println("1. Celsius para Kelvin.");
		System.out.println("2. Celsius para Fahrenheit.");
		System.out.println("3. Kelvin para Celsius.");
		System.out.println("4. Kelvin para Fahrenheit.");
		System.out.println("5. Fahrenheit para Celsius.");
		System.out.println("6. Fahrenheit para Kelvin.");
		System.out.println("7. Sair.");
	}
	
	private static int celsiusParaKelvin(double temperatura) {
		double result = 0;
		result = temperatura + 273.15;
		System.out.println(result);
		return 0; //Alterar aqui, para retornar a conversão de Celsius para Kelvin
	}
	private static int celsiusParaFahrenheit(double temperatura) {
		double result = 0;
		result = (temperatura * 9/5) + 32;
		System.out.println(result);
		return 0; //Alterar aqui, para retornar a conversão de Celsius para Fahrenheit
	}
	
	private static int kelvinParaCelsius(double temperatura) {
		double result = 0;
		result = temperatura - 273.15;
		System.out.println(result);
		return 0; //Alterar aqui, para retornar a conversão de Kelvin para Celsius
	}
	
	private static int kelvinParaFahrenheit(double temperatura) {
		double result = 0;
		result = temperatura * 1.8 - 459.67;
		System.out.println(result);
		return 0; //Alterar aqui, para retornar a conversão de Kelvin para Fahrenheit
	}
	
	private static int fahrenheitParaCelsius(double temperatura) {
		double result = 0;
		result = (temperatura - 32) * (5 / 9);
		System.out.println(result);
		return 0; //Alterar aqui, para retornar a conversão de Fahrenheit para Celsius
	}
	
	private static int fahrenheitParaKelvin(double temperatura) {
		double result = 0;
		result = (temperatura - 32) * 5F/9 + 273.15;
		System.out.println(result);
		return 0; //Alterar aqui, para retornar a conversão de Fahrenheit para Kelvin
	}
}
