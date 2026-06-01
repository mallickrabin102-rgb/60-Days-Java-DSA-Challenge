public class moveZeroes {
    static void MoveZeroes(int arr[]){
        int move =0;
    for (int right = 0; right < arr.length; right++) {
        if (arr[right]!=0) {
            int temp = arr[move];
            arr[move]=arr[right];
            arr[right]=temp;

            move++;
        }
    }
     
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        MoveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
