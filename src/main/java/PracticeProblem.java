public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void insertionSort(char[] characters) {
		for (int i = 1; i < characters.length; i++) {
			char key = characters[i];
			int index = 1;
			while (i - index >= 0 && characters[i - index] > key) {
				characters[i - index + 1] = characters[i - index];
				index++;
			}
			characters[i - index + 1] = key;
		}
	}
}
