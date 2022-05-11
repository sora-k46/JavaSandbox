import java.util.*;

public class RadixSort {
  public static void main(String args[]) {
    int size = 50;
    int data[] = new int[size];
    for (int i = 0; i < size; i++) {
      data[i] = (int) (Math.random() * 100 + 1);
    }
    System.out.println("Unsorted:");
    print(data);
    radixSort(data);
    if (isSorted(data))
      print(data);
  }

  public static void radixSort(int arr[]) {
    int radix = 10;
    int digit = findMaxDigit(arr);
    Queue<Integer> piles[] = new Queue[10];
    for (int i = 0; i < piles.length; i++) {
      piles[i] = new LinkedList<>();
    }
    int factor = 1;
    for (int i = 0; i < digit; i++) {
      for (int j = 0; j <arr.length; j++) {
        int pileNumber = (arr[j] / factor) % 10;
        piles[pileNumber].add(arr[j]);
      }
      for (int k = 0, x = 0; k < 10; k++) {
        while (!piles[k].isEmpty()) {
          arr[x++] = piles[k].remove();
        }
      }
      factor *= 10;
    }
  }

  public static int findMaxDigit(int arr[]) {
    Integer max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max.toString().length();
  }

  public static boolean isSorted(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1])
        return false;
    }
    System.out.println("Sorted:");
    return true;
  }

  public static void print(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}