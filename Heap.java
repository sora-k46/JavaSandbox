public class Heap {
  public static void main(String[] args) {
    int[] data = {44, 55, 2, 77, 29, 23, 300, 52, 76, 22, 19, 3, 100};
  }

  public static void heapSort(int[] arr) {
    for (int i = arr.length - 1; i > 0; i--) {
      swap(arr, i, 0);
      moveDown(arr, 0, i);
    }
  }

  public static void heapify(int[] arr) {
    for (int i = (arr.length/2) - 1; i >= 0; i--) {
      moveDown(arr, i, arr.length);
    }
  }

  public static void moveDown(int[] arr, int idx, int size) {
    int left = 2 * idx + 1;
    int right = 2 * idx + 2;
    if (right >= size) {
      right = -1;
    }
    while (arr[idx] < arr[left] || right > 0 && arr[idx] < arr[right]) {
    }
  }

  public static void swap(int[] arr, int idx1, int idx2) {
    int temp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
