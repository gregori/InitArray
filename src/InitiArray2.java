
public class InitiArray2 {

	public static void main(String[] args) {
		// declara um array e inicializa seus valores
		int[] vetor = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		
		System.out.printf("%s%8s%n", "Índice", "Valor"); // Títulos das colunas
		
		// mostra a saída de cada elemento do array
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.printf("%5d%8d%n", contador, vetor[contador]);
		}
	}

}
