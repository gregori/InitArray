
public class InitArray {

	public static void main(String[] args) {
		// declara um array e o inicializa com um objeto
		int[] vetor = new int[10];
		
		System.out.printf("%s%8s%n", "Índice", "Valor"); // Títulos das colunas
		
		// mostra a saída de cada elemento do array
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.printf("%5d%8d%n", contador, vetor[contador]);
		}

	}

}
