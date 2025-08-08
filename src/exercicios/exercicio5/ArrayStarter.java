package exercicios.exercicio5;

import java.util.Scanner;

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
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int userChoice = 0;
		int n = sizeArray(leitor);		
		String [] array = new String[n];
		
		while(userChoice != 5) {
			//Exibir menu
			showMenu(n);
			
			//Scanner e input usuário
			System.out.println("\nSelect a option: ");
			userChoice = leitor.nextInt();
			
			//Validação de número válido para menu
			userChoice = optionMenuValidator(leitor,userChoice);
			
			//Caso usuário peça opção 1 ou 2, verifica se está vazio
			if (userChoice < 3 && userChoice > 0) {
				if (array[0] == null) {
					System.out.println("Array is empty.");
					System.out.println("Add a inicial text: ");
					array[0] = leitor.next();
				}
			}
			//Validar Array Vazio
			switch(userChoice) {
				case 1:
					String target;
					System.out.println("Search for: ");
					target = leitor.next();
					
					searchTextOnArray(array, target);
					break;
				case 2:
					System.out.println("Remove: ");
					target = leitor.next();
					removeTextFromArray(array, target);
					break;
				case 3:
					System.out.println("Add: ");
					target = leitor.next();
					addTextToArray(array, target);
					break;
				case 4:
					System.out.println("Array: ");
					printArray(array);
			}
			System.out.println("\n---------------------------\n");
		}
		//Saida do código
		if(userChoice == 5) {
			System.out.println("Bye!!");
			System.exit(0);
		}
	}	
	
	
	//método para procurar Stirng
	private static int searchTextOnArray(String[] array, String target) {
		for(int i = 0; i < array.length; i++) {
			//System.out.println("for funcionando");
			if (array[i] == target) { //array[i].equals(target)
				System.out.println("Target Found.");
				System.out.println("Position: " + (i+1));
				return 0;
			}
		}
		System.out.println("Target not found.");
		return 1; 
	}
	
	//método para remover String
	private static String[] removeTextFromArray(String[] array, String target) {
		for(int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				array[i] = null;
			}
		}
		return null; //Alterar aqui, para remover no vetor de texto recebido (array) o valor de texto recebido (target)
	}
	
	//método para adicionar String
	private static String[] addTextToArray(String[] array, String target) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == null) {
				array[i] = target;
				return null;
			} else{
				System.out.println("No more space.");
				return null;
			}
		}
		
		return null; //Alterar aqui, para adicionar no vetor de texto recebido (array) o valor de texto recebido (target)
	}
	
	//método para mostrar menu
	private static int showMenu(int n) {
		System.out.println("   MENU: Array of size: " + n );
		System.out.println("1. Search a Text in the Array.");
		System.out.println("2. Remove a Text from the Array. ");
		System.out.println("3. Add a Text from the Array. ");
		System.out.println("4. Show Array.");
		System.out.println("5. Exit. ");
		return 0;
	}
	
	//método para validar validar opção
	private static int optionMenuValidator(Scanner leitor, int x) {
		while(x < 1 || x > 5) {
			System.out.println("Invalid Option!");
			System.out.println("Choose a number again: ");
			x = leitor.nextInt();
		}
		return x;
	}
	
	//método para definir tamanho array
	private static int sizeArray(Scanner leitor) {
		System.out.println("Size for the array: ");
		int size = leitor.nextInt();
		return size;
	}
	
	//metodo printar array
	private static int printArray(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return 0;
	}
	
}