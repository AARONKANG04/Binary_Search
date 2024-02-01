public class Binary_Search {
    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 18, 18, 18, 19, 19, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 25, 25, 25, 25, 26, 26, 26, 26, 27, 27, 27, 27, 28, 28, 29, 29, 30, 30, 30};
        int target = 21;

        int result = BinarySearch(arr, target);

        if (result == -1) {
            System.out.println("Could not find the element");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }

    public static int BinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            if (arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1; //not found
    }
}

