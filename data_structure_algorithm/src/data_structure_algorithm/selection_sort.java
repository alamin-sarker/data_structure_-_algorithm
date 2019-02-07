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
public class selection_sort {

    public int[] sort(int Item[], int n) {  //complexity O(n^2)

        int i, j, index_min, temp;

        for (i = 0; i < n - 1; i++) {
            index_min = i;

            for (j = i + 1; j < n; j++) {  //to find the smallest value
                if (Item[j] < Item[index_min]) { //ascending order, for descending order | Item[j] > Item[index_min]
                    index_min = j;
                }
            }
            if (index_min != i) { //switch position
                temp = Item[i];
                Item[i] = Item[index_min];
                Item[index_min] = temp;
            }
        }
        return Item;
    }

    public static void main(String[] args) {
        selection_sort select = new selection_sort();
        
        int disorder_item[] = {23, 2, 6, 41, 29, 12, 9, 3, 5, 16, 4, 6, 7, 9};
        System.out.println("Disorder array: " + Arrays.toString(disorder_item));

        int sorted_item[] = select.sort(disorder_item, disorder_item.length);
        System.out.println("Sorted array  : " + Arrays.toString(sorted_item) + " --Ascending order");

    }
}
