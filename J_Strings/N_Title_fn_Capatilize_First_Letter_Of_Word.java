import java.util.*;
public class N_Title_fn_Capatilize_First_Letter_Of_Word {
    
    public static String Tile_fn (String Str)
    {
         
        StringBuilder Sb = new StringBuilder (" ");

//Special case
        char ch = Character.toUpperCase(Str.charAt(0));
        Sb.append(ch);

        for(int i=1; i<Str.length();  i++)
        {
            if (Str.charAt(i) == ' ' && i<Str.length()-1)
            {
                Sb.append(Str.charAt(i));
                i++;
                Sb.append(Character.toUpperCase(Str.charAt(i)));
            }
            else
            {
                Sb.append(Str.charAt(i));
            }
            System.out.println(Sb);
        }
        System.out.println(Sb.length());

        return Sb.toString();
    }
    

    public static void main (String args[])
    {
        String str ="hi i am cage hydra";

        System.out.println(Tile_fn(str));
    
    }
}
