public class QuickSort {
  public static void main(String[] args) {
    int[] data = { 69, 200, 44, 1000, 3, 256, 400, 500, 24, 55, 222, 8, 10, 111, 123, 1, 205 };
    quickSort(data, 0, data.length - 1);
    print(data);
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
      while (a[lower] < a[pivot] && lower < a.length) {
        lower++;
      }

      // Search for small number (less than pivot)
      while (a[upper] > a[pivot] && upper >= 0) {
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

}