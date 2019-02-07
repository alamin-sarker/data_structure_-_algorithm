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
public class bubble_sort {

    public int[] sort(int Item[], int n) {  //complexity O(n*(n-i-1)). if i=0 then O(n^2-n) & finally O(n^2)

        int i, j, temp, iteration;

        for (i = 0; i < n; i++) {
            iteration = 0;
            for (j = 0; j < n - i - 1; j++) {
                if (Item[j] > Item[j + 1]) {//ascending order, for descending order | Item[j] < Item[j + 1]
                    temp = Item[j];         //switch position
                    Item[j] = Item[j + 1];
                    Item[j + 1] = temp;
                    iteration++;
                }

                System.out.println("outerloop:" + i + " Innerloop:" + j + " Iteration:" + iteration + " Array: " + Arrays.toString(Item));
            }

            if (iteration == 0) { //if aleardy sorted then exit from outerloop
                break;
            }

        }
        return Item;
    }

    public static void main(String[] args) {
        bubble_sort bubble = new bubble_sort();

        int disorder_item[] = {6, 41, 29, 12};
        //int disorder_item[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Disorder array: " + Arrays.toString(disorder_item));

        int sorted_item[] = bubble.sort(disorder_item, disorder_item.length);
        System.out.println("Sorted array  : " + Arrays.toString(sorted_item) + " --Ascending order");
    }
}
