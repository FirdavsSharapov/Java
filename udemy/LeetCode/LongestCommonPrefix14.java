package udemy.LeetCode;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String strs [] = {"flower","flow","flight"};
        longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i].indexOf(prefix));
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
