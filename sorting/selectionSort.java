import java.util.Scanner;

public class selectionSort {

	int[] array;
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

	public void swapValues(int small, int big) {
		int temp = this.array[small];
		this.array[small] = this.array[big];
		this.array[big] = temp;
	}

	public void sort() {
		for (int i = 0; i < this.array.length; i++) {
			int biggest = i;
			for (int j = i; j < this.array.length; j++) {
				if (this.array[j] > this.array[biggest]) {
					biggest = j;
				}
			}
			swapValues(i, biggest);
			this.swapCount++;
			System.out.println();
			System.out.println("Swapped values at indices: " + i + " and " + biggest);
			System.out.println();
			printArray();
		}
	}

	public selectionSort() {
		this.swapCount = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = sc.nextInt();

		System.out.println("Enter min value:");
		int min = sc.nextInt();

		System.out.println("Enter max value:");
		int max = sc.nextInt();

		sc.close();

		buildArray(size, min, max);
		System.out.println("Initial array:");
		System.out.println();
		printArray();

		sort();

		System.out.println();
		System.out.println("Final array:");
		System.out.println();
		printArray();

		System.out.println();
		System.out.println("Total num of swaps: " + this.swapCount);
	}

	public static void main(String[] args) {
		selectionSort selectionSort = new selectionSort();
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
| 56 || 50 || 23 || 54 || 17 || 98 || 84 || 82 || 97 || 62 |
------------------------------------------------------------

Swapped values at indices: 0 and 5

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 50 || 23 || 54 || 17 || 56 || 84 || 82 || 97 || 62 |
------------------------------------------------------------

Swapped values at indices: 1 and 8

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 23 || 54 || 17 || 56 || 84 || 82 || 50 || 62 |
------------------------------------------------------------

Swapped values at indices: 2 and 6

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 84 || 54 || 17 || 56 || 23 || 82 || 50 || 62 |
------------------------------------------------------------

Swapped values at indices: 3 and 7

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 84 || 82 || 17 || 56 || 23 || 54 || 50 || 62 |
------------------------------------------------------------

Swapped values at indices: 4 and 9

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 84 || 82 || 62 || 56 || 23 || 54 || 50 || 17 |
------------------------------------------------------------

Swapped values at indices: 5 and 5

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 84 || 82 || 62 || 56 || 23 || 54 || 50 || 17 |
------------------------------------------------------------

Swapped values at indices: 6 and 7

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 84 || 82 || 62 || 56 || 54 || 23 || 50 || 17 |
------------------------------------------------------------

Swapped values at indices: 7 and 8

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 84 || 82 || 62 || 56 || 54 || 50 || 23 || 17 |
------------------------------------------------------------

Swapped values at indices: 8 and 8

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 84 || 82 || 62 || 56 || 54 || 50 || 23 || 17 |
------------------------------------------------------------

Swapped values at indices: 9 and 9

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 84 || 82 || 62 || 56 || 54 || 50 || 23 || 17 |
------------------------------------------------------------

Final array:

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 98 || 97 || 84 || 82 || 62 || 56 || 54 || 50 || 23 || 17 |
------------------------------------------------------------

Total num of swaps: 10

