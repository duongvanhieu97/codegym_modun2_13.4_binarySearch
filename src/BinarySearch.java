public class BinarySearch {
    public static void main(String[] args) {
//        BinarySearch binarySearch = new BinarySearch();
        int[] array = new int[]{2, 3, 5, 6, 7, 8, 11, 12, 15, 16, 19, 22};
        int value = 2;
        int n = array.length;
        int result = binarySearch(array, 0, n-1, value);
        if (result == -1) {
            System.out.println("Không tìm thấy phần tử " + value);
        } else {
            System.out.println("Phần tử " + value + " dược tìm thấy tại chỉ số " + result);
        }
    }
    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (right +left)/2;
        if (value == array[middle]) {
            return middle;
        } else if (array[middle] < value) {
            return binarySearch(array, middle + 1, right, value);
        } else if (array[middle] > value) {
            return binarySearch(array, left, middle - 1, value);
        }
        return -1;
    }
}
