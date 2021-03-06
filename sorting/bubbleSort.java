import java.util.Scanner;

public class bubbleSort {

	private int[] array;
	private int size;
	private int min;
	private int max;
	private int swapCount;

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
		for (int i = this.array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (this.array[j] < this.array[j + 1]) {
					swapValues(j, j + 1);
					this.swapCount++;
					System.out.println();
					System.out.println("Swapped values at indices: " + j + " and " + (j + 1));
					System.out.println();
					printArray();
				}
			}
		}
	}

	public bubbleSort() {
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
		bubbleSort bubbleSort = new bubbleSort();
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
| 24 || 73 || 68 || 84 || 70 || 39 || 29 || 80 || 19 || 73 |
------------------------------------------------------------

Swapped values at indices: 0 and 1

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 24 || 68 || 84 || 70 || 39 || 29 || 80 || 19 || 73 |
------------------------------------------------------------

Swapped values at indices: 1 and 2

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 68 || 24 || 84 || 70 || 39 || 29 || 80 || 19 || 73 |
------------------------------------------------------------

Swapped values at indices: 2 and 3

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 68 || 84 || 24 || 70 || 39 || 29 || 80 || 19 || 73 |
------------------------------------------------------------

Swapped values at indices: 3 and 4

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 68 || 84 || 70 || 24 || 39 || 29 || 80 || 19 || 73 |
------------------------------------------------------------

Swapped values at indices: 4 and 5

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 68 || 84 || 70 || 39 || 24 || 29 || 80 || 19 || 73 |
------------------------------------------------------------

Swapped values at indices: 5 and 6

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 68 || 84 || 70 || 39 || 29 || 24 || 80 || 19 || 73 |
------------------------------------------------------------

Swapped values at indices: 6 and 7

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 68 || 84 || 70 || 39 || 29 || 80 || 24 || 19 || 73 |
------------------------------------------------------------

Swapped values at indices: 8 and 9

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 68 || 84 || 70 || 39 || 29 || 80 || 24 || 73 || 19 |
------------------------------------------------------------

Swapped values at indices: 1 and 2

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 84 || 68 || 70 || 39 || 29 || 80 || 24 || 73 || 19 |
------------------------------------------------------------

Swapped values at indices: 2 and 3

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 84 || 70 || 68 || 39 || 29 || 80 || 24 || 73 || 19 |
------------------------------------------------------------

Swapped values at indices: 5 and 6

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 84 || 70 || 68 || 39 || 80 || 29 || 24 || 73 || 19 |
------------------------------------------------------------

Swapped values at indices: 7 and 8

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 73 || 84 || 70 || 68 || 39 || 80 || 29 || 73 || 24 || 19 |
------------------------------------------------------------

Swapped values at indices: 0 and 1

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 73 || 70 || 68 || 39 || 80 || 29 || 73 || 24 || 19 |
------------------------------------------------------------

Swapped values at indices: 4 and 5

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 73 || 70 || 68 || 80 || 39 || 29 || 73 || 24 || 19 |
------------------------------------------------------------

Swapped values at indices: 6 and 7

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 73 || 70 || 68 || 80 || 39 || 73 || 29 || 24 || 19 |
------------------------------------------------------------

Swapped values at indices: 3 and 4

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 73 || 70 || 80 || 68 || 39 || 73 || 29 || 24 || 19 |
------------------------------------------------------------

Swapped values at indices: 5 and 6

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 73 || 70 || 80 || 68 || 73 || 39 || 29 || 24 || 19 |
------------------------------------------------------------

Swapped values at indices: 2 and 3

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 73 || 80 || 70 || 68 || 73 || 39 || 29 || 24 || 19 |
------------------------------------------------------------

Swapped values at indices: 4 and 5

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 73 || 80 || 70 || 73 || 68 || 39 || 29 || 24 || 19 |
------------------------------------------------------------

Swapped values at indices: 1 and 2

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 80 || 73 || 70 || 73 || 68 || 39 || 29 || 24 || 19 |
------------------------------------------------------------

Swapped values at indices: 3 and 4

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 80 || 73 || 73 || 70 || 68 || 39 || 29 || 24 || 19 |
------------------------------------------------------------

Final array:

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 84 || 80 || 73 || 73 || 70 || 68 || 39 || 29 || 24 || 19 |
------------------------------------------------------------

Total num of swaps: 21

*/
