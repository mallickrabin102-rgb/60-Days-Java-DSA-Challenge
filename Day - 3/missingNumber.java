
public class missingNumber {
    static int MissingNumber(int arr[]){
        int n = arr.length;
        int sumOfArray = 0; 
        for (int i = 0; i < arr.length; i++) {
            sumOfArray += arr[i];
        }
     n = n*(n+1)/2;
     int missingNumber = n-sumOfArray;
     return missingNumber;
    }
  public static void main(String[] args) {
    int arr[]={3,0,1};
    int result = MissingNumber(arr);
    System.out.println(result);

  }  
}
