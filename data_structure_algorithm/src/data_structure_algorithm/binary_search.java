/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure_algorithm;

/**
 *
 * @author Alamin
 */
public class binary_search {

    public int search(int Item[], int n, int x) { 
        //complexity O(log n), if we have 16 integer we can divide it by 2, four times
        int left, right, mid;
        left = 0; //lower index
        right = n - 1;  //upper index

        while (right >= left) {
            mid = (left + right) / 2;  //if sum is greter than 2^31-1 then it may cause integer overflow
            if (Item[mid] == x) {      //to avoid integer overflow use mid = left+(right-left)/2
                return mid;
            }

            if (Item[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        binary_search binary = new binary_search();
        int i;
        int item[] = new int[100];

        for (i = 0; i < item.length; i++) {
            item[i] = i;
        }

        int index = binary.search(item, item.length, 45);

        if (index == -1) {
            System.out.println("Item not found in Array");
        } else {
            System.out.println("Item found in index " + index);
        }
    }
}
