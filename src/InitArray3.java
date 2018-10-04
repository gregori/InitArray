
public class InitArray3 {

	public static void main(String[] args) {
		
		final int TAM_VETOR = 10; // declara constante
		int[] vetor = new int[TAM_VETOR]; // cria o vetor
		
		// calcula o valor de cada elemento do array
		for (int contador = 0; contador < vetor.length; contador++) {
			vetor[contador] = 2 + 2 * contador;
		}
		
		System.out.printf("%s%8s%n", "Índice", "Valor"); // Títulos das colunas
		
		// mostra a saída de cada elemento do array
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.printf("%5d%8d%n", contador, vetor[contador]);
		}
	}

}
