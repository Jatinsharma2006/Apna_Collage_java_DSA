import java.util.*;
public class O_String_Compression {
    
    public static String String_Compress_fn (String Str)
    {
         
        StringBuilder Sb = new StringBuilder ();

        for(int i=0; i<Str.length();  i++)
        {
            Integer Count = 1;
            

            while( i < Str.length()-1 && Str.charAt(i) == Str.charAt(i+1) )
            {
                Count++;
                i++;
            }
            Sb.append(Str.charAt(i));

            if (Count > 1) {
                Sb.append(Count);
            }

            System.out.println(Sb);
        }
        return Sb.toString();
    }
    

    public static void main (String args[])
    {
        String str ="aaabbababaaaaaccccccb";

        System.out.println(String_Compress_fn(str));
    
    }
}
