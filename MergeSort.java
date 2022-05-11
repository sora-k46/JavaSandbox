public class MergeSort {
  public static void main(String[] args) {
    int size = 50;
    int data[] = new int[size];
    for (int i = 0; i < size; i++) {
      data[i] = (int) (Math.random() * 100 + 1);
    }
    System.out.println("Unsorted:");
    print(data);
    mergeSort(data,0, size - 1);
    if (isSorted(data))
      print(data);
  }

  public static void mergeSort(int arr[], int first, int last) {
    if (first < last) {
      int mid = (first + last) / 2;
      mergeSort(arr ,first, mid);
      mergeSort(arr, mid + 1, last);
      merge(arr, first, last);
    }
  }

  public static void merge(int arr[], int first, int last) { 
    int result[] = new int[last - first + 1];
    int idx = 0;
    int mid = (first + last) / 2;
    int left = first;
    int right = mid + 1;

    while (left <= mid && right <= last) {
      if(arr[left] < arr[right]) {
        result[idx++] = arr[left++];
      } else {
        result[idx++] = arr[right++];
      }
    }

    while (left <= mid) {
      result[idx++] = arr[left++];
    }

    while (right <= last) {
      result[idx++] = arr[right++];
    }

    for (int i = 0; i < result.length; i++) {
      arr[first + i] = result[i];
    }

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