package udemy.LeetCode;

public class ValidCharacter {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    
    public static boolean isValid(String s) {
        int len = s.length();
        // First we check if number of characters are even
        if(len %2 == 0){
            int i = 0;
            int index = 0;
            while(i<=len/2){
                if(s.substring(index, index+1) != "{}"){
                    return false;
                }
                else if (s.substring(index, index+1) != "()"){
                    return false;
                }
                else if (s.substring(index, index+1) != "[]"){
                    return false;
                }
                i++;
                index=index+2;
            }
            return true;
        }
        return false;
    }

}