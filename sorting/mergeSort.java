import java.util.Scanner;

public class mergeSort {

	private int[] array;
	private int size;
	private int min;
	private int max;

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

	public void sort(int start, int end) {
		
		int mid = (start + end) / 2;

		if (start < end) {
			// Sort left partial
			sort(start, mid);
			// Sort right partial
			sort(mid + 1, end);
			// Merge
			System.out.println();
			System.out.printf("Merge Sorting Partial Arrays: [%s, %s] and [%s, %s]\n", start, mid, (mid+1), end);
			
			merge(start, mid, end);
		}
	}
	
	public void merge(int start, int mid, int end) {
		
		int[] tempArray = new int[this.array.length];
		int tempArrayIndex = start;
		int startIndex = start;
		int midIndex = mid + 1;
		
		// Iterate until smaller list reaches end
		while (startIndex <= mid && midIndex <= end) {
			if (this.array[startIndex] < this.array[midIndex]) {
				tempArray[tempArrayIndex++] = this.array[startIndex++];
			} else {
				tempArray[tempArrayIndex++] = this.array[midIndex++];
			}
		}
		
		// Copy remaining elements
		while (startIndex <= mid) {
			tempArray[tempArrayIndex++] = this.array[startIndex++];
		}
		while (midIndex <= end) {
			tempArray[tempArrayIndex++] = this.array[midIndex++];
		}
		
		// Copy tempArray to actual array after sorting
		for (int i = start; i <= end; i++) {
			this.array[i] = tempArray[i];
		}
		
		printArray();
	}


	public mergeSort() {
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

		sort(0, this.array.length - 1);

		System.out.println();
		System.out.println("Final array:");
		System.out.println();
		printArray();
	}

	public static void main(String[] args) {
		mergeSort mergeSort = new mergeSort();
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
| 57 || 80 || 29 || 80 || 43 || 38 || 97 || 47 || 83 || 30 |
------------------------------------------------------------

Merge Sorting Partial Arrays: [0, 0] and [1, 1]
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 57 || 80 || 29 || 80 || 43 || 38 || 97 || 47 || 83 || 30 |
------------------------------------------------------------

Merge Sorting Partial Arrays: [0, 1] and [2, 2]
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 57 || 80 || 80 || 43 || 38 || 97 || 47 || 83 || 30 |
------------------------------------------------------------

Merge Sorting Partial Arrays: [3, 3] and [4, 4]
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 57 || 80 || 43 || 80 || 38 || 97 || 47 || 83 || 30 |
------------------------------------------------------------

Merge Sorting Partial Arrays: [0, 2] and [3, 4]
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 43 || 57 || 80 || 80 || 38 || 97 || 47 || 83 || 30 |
------------------------------------------------------------

Merge Sorting Partial Arrays: [5, 5] and [6, 6]
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 43 || 57 || 80 || 80 || 38 || 97 || 47 || 83 || 30 |
------------------------------------------------------------

Merge Sorting Partial Arrays: [5, 6] and [7, 7]
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 43 || 57 || 80 || 80 || 38 || 47 || 97 || 83 || 30 |
------------------------------------------------------------

Merge Sorting Partial Arrays: [8, 8] and [9, 9]
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 43 || 57 || 80 || 80 || 38 || 47 || 97 || 30 || 83 |
------------------------------------------------------------

Merge Sorting Partial Arrays: [5, 7] and [8, 9]
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 43 || 57 || 80 || 80 || 30 || 38 || 47 || 83 || 97 |
------------------------------------------------------------

Merge Sorting Partial Arrays: [0, 4] and [5, 9]
------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 38 || 43 || 47 || 57 || 80 || 80 || 83 || 97 |
------------------------------------------------------------

Final array:

------------------------------------------------------------
| #0 || #1 || #2 || #3 || #4 || #5 || #6 || #7 || #8 || #9 |
------------------------------------------------------------
| 29 || 30 || 38 || 43 || 47 || 57 || 80 || 80 || 83 || 97 |
------------------------------------------------------------

*/
