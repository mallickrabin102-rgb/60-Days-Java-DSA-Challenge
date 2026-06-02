public class twoSum {
    static void TwoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    return;
                }

            }
        }
            System.out.println("not found!");


    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        TwoSum(arr, target);
    }
}
