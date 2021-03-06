import java.util.Scanner;

/**
 * Recebe duas matrizes(A e B) e imprime, quando possível, o produto matricial A x B.
 * 
 * @author Vinicius Barbosa.
 *
 */
public class MultiplicacaoDeMatrizes {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Matriz A = criaMatriz("A");
		Matriz B = criaMatriz("B");
		System.out.println(A.toString());
		System.out.println(B.toString());
		if (A.multiplicaMatriz(B) != null) {
			Matriz AB = (A.multiplicaMatriz(B));
			System.out.println(AB.toString());
		} else {
			System.out.println("A x B não existe, pois o número de colunas de A é diferente do de linhas em B.");
		}
	}

	/**
	 * Método que recebe a quantidade de linhas e colunas da matriz e em seguida a
	 * preenche com dados inseridos pelo usuário.
	 * 
	 * @param nome
	 *            nome da matriz (ex.: A, B ... )
	 * 
	 * @return uma Matriz
	 */
	private static Matriz criaMatriz(String nome) {
		System.out.println("| -- Matriz " + nome + " -- |");
		System.out.print("Insira o número de linhas: ");
		int numeroLinhas = input.nextInt();
		System.out.print("Insira o número de colunas: ");
		int numeroColunas = input.nextInt();
		int[][] mat = new int[numeroLinhas][numeroColunas];
		for (int i = 0; i < numeroLinhas; i++) {
			for (int j = 0; j < numeroColunas; j++) {
				System.out.printf("Insira o elemento da %d° linha e %d° coluna: ", i + 1, j + 1);
				mat[i][j] = input.nextInt();
			}
		}
		Matriz matriz = new Matriz(numeroLinhas, numeroColunas, nome);
		matriz.setMatriz(mat);
		return matriz;
	}

}
