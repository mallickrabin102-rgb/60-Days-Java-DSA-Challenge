public class mergeSortedArrays {

    static void mergeSortedArrays(int arr1[], int arr2[]) {

        int left = 0;
        int right = 0;
        int k = 0;

        int newArr[] = new int[arr1.length + arr2.length];

        while (left < arr1.length && right < arr2.length) {

            if (arr1[left] < arr2[right]) {
                newArr[k] = arr1[left];
                left++;
            } else {
                newArr[k] = arr2[right];
                right++;
            }

            k++;
        }

        while (left < arr1.length) {
            newArr[k] = arr1[left];
            left++;
            k++;
        }

        while (right < arr2.length) {
            newArr[k] = arr2[right];
            right++;
            k++;
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5};
        int arr2[] = {2, 4, 6};

        mergeSortedArrays(arr1, arr2);
    }
}