package Strings;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            sb.append(ch);
            count++;
        }
        System.out.println(sb);
        System.out.println(count);
    }
    
}
