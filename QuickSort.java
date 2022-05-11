
public class QuickSort {
  public static void main(String[] args) {
    // int[] data = { 69, 200, 44, 1000, 3, 256, 400, 500, 24, 55, 222, 8, 10, 111, 123, 1, 205 };
    // quickSort(data, 0, data.length - 1);
    // print(data);
    int size = 50;
    for (int i = 0; i < 10; i++) {
      int data[] = new int[size];
      for (int j = 0; j < size; j++) {
        data[j] = (int) (Math.random() * 100 + 1);
      }
      test(data);
    }
  }
  
  public static void test(int[] data) {
    System.out.println("Unsorted:");
    print(data);
    quickSort(data, 0, data.length - 1);
    if (isSorted(data))
      print(data);
    System.out.println();
  }

  public static void quickSort(int[] a, int first, int last) {

    if (first >= last) { // No more recursion (base case)
      return;
    }

    int pivot = first;
    int lower = first + 1;
    int upper = last;
    while (lower <= upper) {
      
      // Search for big number (greater than pivot)
      while (a[lower] < a[pivot] && lower <= last) {
        lower++;
      }

      // Search for small number (less than pivot)
      while (a[upper] >= a[pivot] && upper > first) {
        upper--;
      }

      if (lower < upper) {
        swap(a, lower, upper);
        lower++;
        upper--;
      }
      
    }

    swap(a, pivot, upper);
    quickSort(a, first, upper - 1);
    quickSort(a, upper + 1, last);

  }

  public static void swap(int[] a, int x, int y) {
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
  }

  public static void print(int[] a) {
    for (int i : a) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1])
        return false;
    }
    System.out.println("Sorted:");
    return true;
  }

}