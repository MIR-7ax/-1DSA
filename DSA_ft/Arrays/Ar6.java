public class Ar6 {
    // leetcode 1266
    public static void main(String[] args) {
        int nums[][] =  {{1,1},{3,4},{-1,0}};
        int r = nums.length;
        int cost =0;
        for(int i=0;i<r-1; i++)
        {
            int x0 = nums[i][0];
            int y0 = nums[i][1];
            int x1 = nums[i+1][0];
            int y1 = nums[i+1][1];
            cost+= Math.max(Math.abs(x0-x1), Math.abs(y0-y1));  
        }
        System.out.print(cost);
    }

}
