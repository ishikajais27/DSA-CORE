// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BuySell {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
          int max =0;
        int curr;
        for(int i=0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                 if(prices[i]<prices[j]){
                    curr = prices[j]-prices[i];
                    max = max>curr?max:curr;
                 }
            }
    }
    System.out.println(max);
}
}