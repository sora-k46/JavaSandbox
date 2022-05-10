
public class Sorting {
  public static void main(String[] args) {
    int size = 50;
    int[] data = new int[size];
    for (int i = 0; i < size; i++) {
      data[i] = (int) (Math.random() * 1000 + 1);
    }
    System.out.println("Not sorted: ");
    print(data);
    insertionSort(data);
    if (isSorted(data))
      print(data);
  }
  
  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i; 
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j]) {
          min = j;
        }
      }
      swap(arr, i, min);
    }
  }

  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int idx = i;
      for (int j = i - 1; j >= 0; j--) {
        if (arr[idx] < arr[j]) {
          swap(arr, idx, j);
          int temp = idx;
          idx = j;
          j = temp;
        }
      }
    }
  }

  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
  }

  public static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public static boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    System.out.println("Sorted: ");
    return true;
  }

  public static void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}