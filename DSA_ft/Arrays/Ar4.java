import java.util.HashMap;

public class Ar4 {
    //Leetcode 1 - Two sum
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
            }
            else{
                map.put(nums[i], i);
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
