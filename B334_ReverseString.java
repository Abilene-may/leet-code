public class B334_ReverseString{
    public static void reverseString(char[] s) {
        for(int i=0; i<s.length ; i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length - 1-i] = temp;
        }
    }
    
    public static void main(String[] args) {
        String s = "hello";
        reverseString(s.toCharArray());
        System.out.println(s);
    }



}