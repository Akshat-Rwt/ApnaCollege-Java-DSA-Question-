package Strings;

public class Convert_Letters_To_UpperCase {

    public static String toupperCase(String str){
        StringBuilder sb =new StringBuilder();
        Character ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for(int i = 1 ; i <str.length() ; i++){
            if (str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String str ="i am a boy";
        System.out.println(toupperCase(str));
    }
    
}
