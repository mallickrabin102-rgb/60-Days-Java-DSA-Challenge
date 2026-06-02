public class secondMax {
    static int SecondLargest(int arr[]){
int max = Integer.MIN_VALUE;
int secMax = Integer.MIN_VALUE;
for(int i = 0;i<arr.length;i++){
if (max<arr[i]) {
    secMax = max;
    max = arr[i];
}
else if (arr[i]>secMax && arr[i]!=max) {
    secMax = arr[i];
}
}

return secMax;
    }
    public static void main(String[] args) {
        int arr[]={5,5,5,5,5,5};
        int secMax = SecondLargest(arr);
        System.out.println(secMax);
        if(secMax == Integer.MIN_VALUE){
    System.out.println("Second largest does not exist");
}
    
    }
}
