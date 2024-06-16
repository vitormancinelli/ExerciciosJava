package exercicios.exercicio4;

/**
 * 
 * Implementar os metodos abaixo como orientado de forma a completar o objetivo dessa tarefa.
 * 
 * Ao executar o metodo main dessa classe, deverá ser exibido o seguinte menu de operações.
 * 1. Celsius para Kelvin
 * 0 °C + 273,15 = 273,15 K
 * 2. Celsius para Fahrenheit
 * 0 °C × 9/5) + 32 = 32 °F
 * 3. Kelvin para Celsius
 * 0 K − 273,15 = -273,1 °C
 * 4. Kelvin para Fahrenheit
 * (0 K − 273,15) × 9/5 + 32 = -459,7 °F
 * 5. Fahrenheit para Celsius
 * 32 °F − 32) × 5/9 = 0 °C
 * 6. Fahrenheit para Kelvin
 * (32 °F − 32) × 5/9 + 273,15 = 273,15 K
 * 
 * Após exibir o menu o usuário irá inserir no console a operação desejada e assim o sistema deverá calcular.
 * 
 * @author vitor
 *
 */
import java.util.Scanner;
public class TemperatureCalculator {
	
	/**
	 * Quando finalizar a implementação dos metodos, execute esse metodo para testar a implementação
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int op = 0;
		double temperatura = 0;
				
		while (op != 7) {
			op = exibirMenu(scanner);
		
			if (op == 7) {
				System.out.println("Obrigado por utilizar nossa calculadora!");
				scanner.close();
				return ;
			}
			
			System.out.println("Digite a Temperatura a ser convertida");
			temperatura = scanner.nextInt();
		 
			if (op == 1) {
				System.out.println("O Valor é de: " + celsiusParaKelvin(temperatura));
	        } else if(op == 2) {
	        	System.out.println("O Valor é de: " + celsiusParaFahrenheit(temperatura));
	        } else if(op == 3) {
	        	System.out.println("O Valor é de: " + kelvinParaCelsius(temperatura));
	        } else if (op ==4) {
	    		System.out.println("O Valor é de: " + kelvinParaFahrenheit(temperatura));
	        } else if(op == 5) {
	        	System.out.println("O Valor é de: " + fahrenheitParaCelsius(temperatura));
	        } else if(op == 6) {
	        	System.out.println("O Valor é de: " + fahrenheitParaKelvin(temperatura));
	        }
		}
		
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
		//OBS: Para chamar um método, basta utilizar o nome do metodo, seguido por parenteses com os valores de entrada, exemplo "celsiusParaKelvin(temperatura)"
	
	scanner.close();
	
	}
	
	private static int exibirMenu(Scanner scanner) {
		System.out.println("1. Converter Celsius para Kelvin");
		System.out.println("2. Converter Celsius para Fahrenheit");
		System.out.println("3. Converter Kelvin para Celsius");
		System.out.println("4. Converter Kelvin para Fahrenheit");
		System.out.println("5. Converter Fahrenheit para Celsius");
		System.out.println("6. Converter Fahrenheit para Kelvin");
		System.out.println("7. Sair");
		return scanner.nextInt();
	}

	private static double celsiusParaKelvin(double temperatura) {
		//Formula para calcular Kelvin a partir de Celsius
		//0 °C + 273,15 = 273,15 K
		return (temperatura + 273.15) ; //Alterar aqui, para retornar a conversão de Celsius para Kelvin
	}
	
	private static double celsiusParaFahrenheit(double temperatura) {
		//Formula para calcular Kelvin a partir de Celsius
		//(0 °C × 9/5) + 32 = 32 °F
		return (temperatura * 9/5 + 32); //Alterar aqui, para retornar a conversão de Celsius para Fahrenheit
	}
	
	private static double kelvinParaCelsius(double temperatura) {
		//Formula para calcular Kelvin a partir de Celsius
		//0 K − 273,15 = -273,1 °C
		return (temperatura - 273.15); //Alterar aqui, para retornar a conversão de Kelvin para Celsius
	}
	
	private static double kelvinParaFahrenheit(double temperatura) {
		//Formula para calcular Kelvin a partir de Celsius
		//(0 K − 273,15) × 9/5 + 32 = -459,7 °F
		return (temperatura - 273.15) * 9/5 + 32; //Alterar aqui, para retornar a conversão de Kelvin para Fahrenheit
	}
	
	private static double fahrenheitParaCelsius(double temperatura) {
		//Formula para calcular Kelvin a partir de Celsius
		//32 °F − 32) × 5/9 = 0 °C
		return ((temperatura - 32) * 5/9); //Alterar aqui, para retornar a conversão de Fahrenheit para Celsius
	}
	
	private static double fahrenheitParaKelvin(double temperatura) {
		//Formula para calcular Kelvin a partir de Celsius
		//(32 °F − 32) × 5/9 + 273,15 = 273,15 K
		return (temperatura - 32) * 5/9 + 273.15; //Alterar aqui, para retornar a conversão de Fahrenheit para Kelvin
	}
}
