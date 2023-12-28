/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubbleshort;

import java.util.*;

/**
 *
 * @author suraj
 */
public class BubbleShort {

    public static int[] bubbleShort(int arr[], int sz) {

        for (int i = 0; i < sz; i++) {
            for (int j = i + 1; j < sz; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[j] + arr[i];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }

            }
            for (int k = 0; k < sz; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static int[] selectionShort(int arr[], int sz) {
        int j;
        for (int i = 0; i < sz; i++) {
            int index = i;
            for (j = i + 1; j < sz; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }

            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            for (int k = 0; k < sz; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();

        }
        return arr;
    }

    public static int[] insertionSort(int arr[], int sz) {
        for (int i = 1; i < sz; i++) {
            int ind = arr[i];
            int j = i - 1;
            while (j >= 0 && ind < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = ind;

            for (int k = 0; k < sz; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();

        }
        return arr;
    }

    private static void conquer(int[] arr, int srt, int mid, int end) {
        int merge[] = new int[end - srt + 1];
        int id1 = srt;
        int id2 = mid + 1;
        int x = 0;
        while (id1 <= mid && id2 <= end) {
            if (arr[id1] <= arr[id2]) {
                merge[x++] = arr[id1++];
            } else {
                merge[x++] = arr[id2++];
            }
        }
        while (id1 <= mid) {
            merge[x++] = arr[id1++];
        }
        while (id2 <= end) {
            merge[x++] = arr[id2++];
        }
        for (int i = 0, j = srt; j < merge.length; j++, i++) {
            arr[j] = merge[i];
        }

    }

    public static void MergeSortDivide(int arr[], int srt, int end) {
        if (srt >= end) {
            return;
        }
        int mid = srt + (end - srt) / 2;
        MergeSortDivide(arr, srt, mid);
        MergeSortDivide(arr, mid + 1, end);
        conquer(arr, srt, mid, end);
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {

            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[] = new int[10];
        var op = System.out;
        op.println("Enter Array element");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

//        sr = bubbleShort(a, 10);
//        int[] sr = selectionShort(a, 10);
//        MergeSortDivide(a,0,a.length-1);
        int low=0,high=a.length;
        
        quickSort(a,low, high - 1);

        op.print("\nshorted array is:");
        for (int i = 0; i < 10; i++) {
            op.print(a[i] + " ");
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = 0; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        i++;
        int t = arr[i];
        arr[i] = arr[high];
        arr[high] = t;

        return i;
    }

}
