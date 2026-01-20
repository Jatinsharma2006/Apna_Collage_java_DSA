interface ChessPlayer
{
    void moves();
}
//ChessPlayer interface defines every chess piece class must have a fn with name moves() 
//It does not care how the piece moves 


class Queen implements ChessPlayer{
    public void moves(){
            System.out.println("up, down , left , right , diagonal (in all 8 dir's )");
    }
}


class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down , left , right(in all 4 dir's )");
    }
}

class King implements ChessPlayer{
   public void moves(){
        System.out.println("up, down ,left, right ,digonal (by 1 step)");
    }
}

/*
Different classes implement the same behavior differently
            class Queen implements ChessPlayer { ... }
            class Rook implements ChessPlayer { ... }
            class King implements ChessPlayer { ... }
Same method name: moves()
You can add new pieces (Bishop, Knight) without changing the interface
*/




public class T_Interfaces_Chess_game {
    public static void main(String args[]){

        Queen q = new Queen ();
        q.moves ();


        //Use interface reference (important concept)
        ChessPlayer p = new Queen();
        p.moves();
        //Add more objects to show power of interface
        ChessPlayer p1 = new Queen();
        ChessPlayer p2 = new Rook();
        ChessPlayer p3 = new King();
        p1.moves();
        p2.moves();
        p3.moves();
    }
}

/*
Golden rule (very important)

Reference type decides which methods you can call
Object type decides which method runs */



