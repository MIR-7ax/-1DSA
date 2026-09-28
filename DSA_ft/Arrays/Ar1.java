import java.util.*;
// leetcode 217: Contains Duplicate 
public class Ar1{
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int l = nums.length;
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums)
        {
            h.add(i);
        }
        if(h.size()!=l)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}