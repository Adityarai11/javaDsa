public class trappingrainwater {
    public static int rainwater(int hight[]) {
        int n = hight.length;
        //left max boundary in array
        int leftmax[] = new int [hight.length];
        leftmax[0] = hight[0];
        for(int i =1;i<hight.length;i++){
            leftmax[i] = Math.max(hight[i],leftmax[i-1]); 
        } //Right max boundary in array
        int rightmax [] = new int [hight.length];
        rightmax[n-1] = hight[n-1];
        for (int i = n-2 ; i>=0;i--){
            rightmax[i]=Math.max(hight[i],rightmax[i+1]);
        } 
        int tappwater = 0;
        // loop
        for(int i=0;i<n;i++){
            
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            tappwater = tappwater + (waterlevel - hight[i]);
        }return tappwater;
    }
    public static void main(String[] args) {
        int hight[]={4,2,0,6,3,2,5};
        System.out.println(rainwater(hight));

        
    }
    
}
