import java.util.Arrays;

class ArrayOperations {

    int arr[];

    // Constructor
    ArrayOperations(int arr[]) {
        this.arr = arr;
    }

    // Reverse Array
    void reverse() {
        System.out.println("Reversed Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Sort Array
    void sort() {
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Search Element
    void search(int key) {
        boolean found = false;
        for (int i : arr) {
            if (i == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element Found");
        }
        else {
            System.out.println("Element Not Found");
        }
    }

    // Average
    void average() {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;

        System.out.println("Average = " + avg);
    }

    // Maximum
    void maximum() {
        int max = arr[0];

        for (int i : arr) {
            if (i > max)
                max = i;
        }

        System.out.println("Maximum = " + max);
    }
}
public class Program_1
{
    public static void main(String args[]) {

        int arr[] = {5, 2, 9, 1, 6};

        ArrayOperations obj = new ArrayOperations(arr);

        obj.reverse();
        obj.sort();
        obj.search(9);
        obj.average();
        obj.maximum();
    }

}
