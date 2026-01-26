package Array;
// its all about buying in less price and selling in highest
public class buynsell{
    static int stock(int[]stock_prices){
        int max_profit=0;
        int buy=stock_prices[0];
        int profit=0;
                for(int i=1;i<stock_prices.length;i++){
            if(stock_prices[i]<buy){
                buy=stock_prices[i];
            }
            else{
                profit=stock_prices[i]-buy;
            }
            if(profit>max_profit){
                max_profit=profit;
            }

            }
        return max_profit;
    }
    public static void main(String[] args) {
        int[]stock_prices={7,2,3,1,6,3};
        System.out.println(stock(stock_prices));
    }
}

// MORE SIMPLIER CODE

// public class kpop{
//     static int stock(int[] arr) {
//     int buy = arr[0];
//     int max = 0;

//     for(int i = 1; i < arr.length; i++) {
//         buy = Math.min(buy, arr[i]);
//         max = Math.max(max, arr[i] - buy);
//     }
//     return max;
// }

//     public static void main(String[] args) {
//         int[]arr={5,3,1,2,7};
//         System.out.println(stock(arr));
//     }
// }// 
