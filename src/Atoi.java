public class Atoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }
    public static int myAtoi(String s) {
        s=s.trim();
        boolean positive = true;
        if (s.charAt(0)=='-'){
            positive=false;
        s=s.substring(1);
        }
        int ans = helper(s,1);
        if (positive)
            return ans;
        else
            return ans*-1;

    }
    public static int helper(String ns,int place){
        if (ns.charAt(ns.length()-1)>'9'||ns.charAt(ns.length()-1)<'0')
            return helper(ns.substring(0, ns.length()-1),place);
        if (ns.length()==1)
            return (ns.charAt(0)-'0')*place;

        int a = helper(ns.substring(0, ns.length()-1),place*10);
                int b = (ns.charAt(ns.length()-1)-30)*place;
        return a+b;
    }
}
