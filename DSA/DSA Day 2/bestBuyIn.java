public class bestBuyIn {
    static int Sell(int arr[]) {
        int minPrice = arr[0];
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            int price = arr[i];
            if (price<minPrice) {
                minPrice = price;
            }else{
                maxProfit = Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int best = Sell(arr);
        System.out.println(best);
    }
}
