import java.util.Arrays;

public class StringUtil {

    public String reverse(String s){
        

        int len = s.length();
        StringBuilder new_s = new StringBuilder();
        for(int i=len-1;i>=0;i--){
            new_s.append(s.charAt(i));
        }
        
        return new_s.toString();
    }

    public static String explode(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=s.length();i++){
            sb.append(s.substring(0, i));
        }
        return sb.toString();
    }

    public static String sort(String s){
        char[] l = s.toCharArray();
        Arrays.sort(l);
        return l.toString();
        
    }

    public static boolean areAnagrams(String s1, String s2){
        char[] l1 = s1.toCharArray();
        char[] l2 = s2.toCharArray();
        Arrays.sort(l1);
        Arrays.sort(l2);
        return (l1==l2);
    }

    public static String mixedStrings(String s){
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            char[] j = words[i].toCharArray();
            char begin = j[0];
            char end = j[j.length-1];
            char temp = begin;
            j[0] = end;
            j[j.length-1] = temp;
            String a = new String(j);
            sb.append(a);
            if(i != words.length-1){
                sb.append(" ");
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "wassup aaay heeyoo 2020";
        System.out.println(mixedStrings(s));
    }

    
}
