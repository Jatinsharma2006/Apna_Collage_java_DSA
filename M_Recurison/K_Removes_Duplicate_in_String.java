public class K_Removes_Duplicate_in_String{

public static void Removes_Duplicate_fn( String Str,int idx, StringBuilder newStr, boolean map[] ){

    if (idx == Str.length())
    {
        System.out.println(newStr);
        return;
    }

    char currChar = Str.charAt(idx);

    if(map[currChar - 'a'] == true)
    {
        //Duplicate
        Removes_Duplicate_fn( Str, idx+1, newStr, map);
    }
    
    else
    {
        map[currChar - 'a'] = true;  
        Removes_Duplicate_fn( Str, idx+1, newStr.append(currChar), map);
    }
}

public static void main(String[] args){

    String Str = "aappannaacollege";

    Removes_Duplicate_fn(Str, 0, new StringBuilder(""), new boolean [26]);

}


}

