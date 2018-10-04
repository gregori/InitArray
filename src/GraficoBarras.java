
public class GraficoBarras {

	public static void main(String[] args) {
		int[] vetor = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		
		System.out.println("Distribuição de notas:");
		
		for (int contador = 0; contador < vetor.length; contador++) {
			// gera saída do código de barras ( "00-09: ", ...., "90-99: ", "100: ")
			if (contador == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ",
						contador * 10, contador * 10 + 9);
			
			// imprime a barra de asteriscos
			for (int estrelas = 0; estrelas < vetor[contador]; estrelas++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
