import java.util.Scanner;

public class insertionSort {
	int[] array;
	int size;
	int min;
	int max;
	int swapCount;

	public void buildArray(int size, int min, int max) {
		this.array = new int[size];
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = (int) (Math.random() * (max - min + 1) + min);
		}
	}

	public void printArray() {
		for (int i = 0; i < this.array.length; i++) {
			System.out.print("------");
		}
		System.out.println();
		for (int i = 0; i < this.array.length; i++) {
			System.out.print("| #" + i + " |");
		}
		System.out.println();
		for (int i = 0; i < this.array.length; i++) {
			System.out.print("------");
		}
		System.out.println();
		for (int i = 0; i < this.array.length; i++) {
			System.out.print("| " + this.array[i] + " |");
		}
		System.out.println();
		for (int i = 0; i < this.array.length; i++) {
			System.out.print("------");
		}
		System.out.println();
	}

	public void sort() {
		for (int i = 0; i < this.array.length; i++) {
			int j = i;
			while (j > 0 && this.array[j] < this.array[j - 1]) {
				int temp = this.array[j];
				this.array[j] = this.array[j - 1];
				this.array[j - 1] = temp;
				System.out.println("\nSwapped indices " + j + " and " + (j - 1) + ":");
				printArray();
				this.swapCount++;
				j--;
			}
		}
	}

	public insertionSort() {
		this.swapCount = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		this.size = sc.nextInt();

		System.out.println("Enter min value:");
		this.min = sc.nextInt();

		System.out.println("Enter max value:");
		this.max = sc.nextInt();

		sc.close();

		buildArray(this.size, this.min, this.max);
		System.out.println("\nInitial array:");
		printArray();

		sort();

		System.out.println();
		System.out.println("Final array:");
		printArray();

		System.out.println();
		System.out.println("Total num of swaps: " + this.swapCount);
	}

	public static void main(String[] args) {
		insertionSort insertionSort = new insertionSort();
	}
}

/*

SAMPLE OUTPUT:

Enter array size:
10
Enter min value:
10
Enter max value:
99

Initial array:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 47 || 30 || 66 || 29 || 47 || 45 || 52 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 1 and 0:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 30 || 47 || 66 || 29 || 47 || 45 || 52 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 3 and 2:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 30 || 47 || 29 || 66 || 47 || 45 || 52 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 2 and 1:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 30 || 29 || 47 || 66 || 47 || 45 || 52 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 1 and 0:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 47 || 66 || 47 || 45 || 52 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 4 and 3:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 47 || 47 || 66 || 45 || 52 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 5 and 4:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 47 || 47 || 45 || 66 || 52 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 4 and 3:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 47 || 45 || 47 || 66 || 52 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 3 and 2:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 45 || 47 || 47 || 66 || 52 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 6 and 5:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 45 || 47 || 47 || 52 || 66 || 93 || 94 || 82 |
------------------------------------------------------------

Swapped indices 9 and 8:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 45 || 47 || 47 || 52 || 66 || 93 || 82 || 94 |
------------------------------------------------------------

Swapped indices 8 and 7:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 45 || 47 || 47 || 52 || 66 || 82 || 93 || 94 |
------------------------------------------------------------

Final array:
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 45 || 47 || 47 || 52 || 66 || 82 || 93 || 94 |
------------------------------------------------------------

Total num of swaps: 11

*/