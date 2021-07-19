package binary_insertion_sort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		final int[] input = { 4, 10, 3, 1, 9, 15 };
		System.out.println("Antes de Ordenação - " + Arrays.toString(input));
		new Main().sort(input);
		System.out.println("Após a Ord- " + Arrays.toString(input));
	}

	public void sort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int x = array[i];

			// Busca localização para inserir usando a busca binaria
			int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);

			System.arraycopy(array, j, array, j + 1, i - j);

			// Posiciona o elemento em sua posição correta
			array[j] = x;
		}
	}
}
