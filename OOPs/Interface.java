import java.util.*;

public class Interface {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){//public because we have to make it like method of Chessplayer othrwie it will be default
        System.out.println ("up, down, left, right, diagonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){ 
        System.out.println ("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){ 
        System.out.println ("up, down, left, right (by 1 step)");
    }
}

