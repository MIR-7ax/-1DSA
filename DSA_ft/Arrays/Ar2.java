// import java.util.*;
//Leetcode 268 - Missing number

public class Ar2 {
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        int sum=0, n = nums.length;
        for(int i:nums)
        {
            sum+=i;
        }
        int a = (n*(n+1))/2;
        System.out.print(a-sum);
    }
}
