//Leetcode 448 - Find All Numbers Disappeared in an Array

import java.util.HashSet;
import java.util.LinkedList;

public class Ar3{
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums)
        {
            h.add(i);
        }
        LinkedList<Integer> ans = new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!h.contains(i+1))
            {
                ans.add(i+1);
            }
        }
        for(int i:ans){
            System.out.println(i);
        }
    }
}