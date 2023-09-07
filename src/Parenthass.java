import java.util.ArrayList;
import java.util.List;

public class Parenthass {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3).size());
    }
    public static List<String> generateParenthesis(int n) {
        List<String> meh = new ArrayList<>();
        helper(0,0,meh,n,"");

//        for (String idk :
//                meh) {
//            System.out.println(idk);
//        }

        return meh;
    }

    public static void helper(int open, int close, List<String> ans, int target, String idk){
        if ( open==target&&close == target){
            ans.add(idk);
            return;
        }
        if (open<target){
            helper(open+1,close,ans,target,idk+"(");
        }
        if (close<open)
            helper(open,close+1,ans,target,idk+")");

    }
}
