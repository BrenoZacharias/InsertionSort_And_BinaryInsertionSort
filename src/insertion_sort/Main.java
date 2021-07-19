package insertion_sort;

public class Main {
	
	public static void insertionSort(int v[]) {
		int i, j, key;
		for (i = 1; i < v.length; i++) {
			j = i;
			while (j > 0 && v[j - 1] > v[j]) {
				key = v[j];
				v[j] = v[j - 1];
				v[j - 1] = key;
				j--;
			}
		}
		System.out.println("vetor ordenado ");
		printArray(v);
	}

	// função para escrever o vetor
	public static void printArray(int array[]) {
		int j;
		for (j = 0; j < array.length; j++) {
			System.out.print(" " + array[j]);
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		int array[] = { 5, 1, 6, 2, 4, 3 };
		insertionSort(array);
	}
}
