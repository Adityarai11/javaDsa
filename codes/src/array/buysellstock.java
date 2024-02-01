//Buy& selling stock to max profit
public class buysellstock {
    public static int stock(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0;i<price.length;i++){
            if(buyprice<price[i]){//profit find ker ne ke liya
                int profit = price[i]-buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }else{//(buyprice>price[i])
                buyprice = price[i];
            }
        }return maxprofit;
        
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
       System.out.println( stock(price));
    }
    
    
}
