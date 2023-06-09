package Rec;

public class RemoveDuplicate {

    public static void removeDuplicate(String str , int indx , StringBuilder newstr , boolean map[]){
 
        // Base Case 
        if(indx == str.length()){
            System.out.println(newstr);
            return ;
        }

        //kaam
        char currChar = str.charAt(indx);
        if(map[currChar - 'a']==true){
            removeDuplicate(str, indx+1, newstr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, indx+1, newstr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String  str = "appnnacollege";
        removeDuplicate(str, 0 , new StringBuilder("") , new boolean[26]  );

    }
}
