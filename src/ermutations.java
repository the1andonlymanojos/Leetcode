import java.util.ArrayList;
import java.util.List;

public class ermutations {

    public static void main(String[] args) {
        int[] idk = {1,2,3};
        System.out.println(subsets(idk));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
       helper(0,nums,new ArrayList<>(),subsets);
       return subsets;
    }
    public static void helper(int index, int[] nums, List<Integer> ans,List< List<Integer>> ansss){
        if (index==nums.length) {
            ansss.add(new ArrayList<>(ans));
            return;
        }
        //take
        helper(index+1,nums,ans,ansss);
        ans.add(nums[index]);
        helper(index+1,nums,ans,ansss);

    }

}
