import java.util.Arrays;
import java.util.HashMap;

public class Ar5 {
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int n = nums.length;
        int ans[] = new int[n];
        int temp[] = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(temp[i]))
            {
                map.put(temp[i],i);
            }
        }
        for(int i=0;i<n;i++)
        {
            ans[i] = map.get(temp[i]);
        }
        for(int j:ans)
        {
            System.out.print(j+" ");
        }
    }
}
