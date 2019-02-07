/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure_algorithm;

import java.util.Arrays;

/**
 *
 * @author Alamin
 */
public class insertion_sort {

	public int[] sort(int A[], int n) {

		int i, j, item, iteration = 0;

		for (i = 1; i < n; i++) {
			int in_loop = 1;
			item = A[i];
			j = i - 1;
			System.out.println("Iteration:" + iteration + " | Array Item:" + A[i]);
			while (j >= 0 && item < A[j]) {
				A[j + 1] = A[j];
				j = j - 1;
				System.out.println("Step:" + in_loop + "  " + Arrays.toString(A));
				in_loop++;
			}
			A[j + 1] = item;

			System.out.println("Final:  " + Arrays.toString(A) + "\n");
			iteration++;
		}
		return A;
	}

	public static void main(String[] args) {
		insertion_sort insertion = new insertion_sort();

		int disorder_item[] = { 23, 2, 6, 41, 29, 12, 9, 3, 5, 16, 4, 6, 7, 9 };
		//int disorder_item[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 23, 45, 67, 89};
		
		System.out.println("Disorder array: " + Arrays.toString(disorder_item) + "\n");

		int sorted_item[] = insertion.sort(disorder_item, disorder_item.length);
		System.out.println("Sorted array  : " + Arrays.toString(sorted_item) + " --Ascending order");
	}
}
