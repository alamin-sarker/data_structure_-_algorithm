/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure_algorithm;

/**
 *
 * @author Alamin
 */
public class linear_search {

    public int search(int Item[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) { //complexity O(n), Space complexity O(1)
            if (Item[i] == x) {  //check from left to right
                return i;
            }
        }
        i = -1;
        return i;
    }

    public static void main(String[] args) {

        linear_search linear = new linear_search();
        int item[] = {1, 34, 6, 78, 23, 98, 61, 30, 6, 17};
        int index = linear.search(item, item.length, 30);

        if (index == -1) {
            System.out.println("Item not found in Array");
        } else {
            System.out.println("Item found in " + index + " index.");
        }
    }
}
