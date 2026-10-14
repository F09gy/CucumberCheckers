import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.stream.Stream;

class FractalCucumber{


}

class PositionOnChessBoard() {

}



class Cheker {
    private ChessBoard.PlayerColor _playerOwner;
    private ChessBoard _owner;
    private PositionOnChessBoard _pos;
    private AbstractCollection<FractalCucumber> _harvest = new HashSet<>();

    public boolean ...Cucumber() { // посадить типо

    }

    public Cheker(ChessBoard owner, PositionOnChessBoard _pos, ChessBoard.PlayerColor playerOwner) {
        _playerOwner = playerOwner;
        _owner = owner;
        boolean ok = ......
        if(ok) {
            _pos = pos;
        }
    }

    public Optional<PositionOnChessBoard> getPosition() {
        return _pos;
    }

    public ChessBoard.PlayerColor getPlayer() {
        return _playerOwner;
    }

    public boolean isOnBoard() {
        return _owner != null;
    }

}


class ChessBoard {
    public enum PlayerColor {
        BLACK,
        WHITE
    }

    private AbstractCollection<Cheker> _chekers = new HashSet<>();

    public ChessBoard() {
        var newCheker = new Cheker(this,WHITE);
        _chekers.add( newCheker );
        assert(_chekers.contains(newCheker) && newChecker.isOnBoard());
    }

    public int getChekerCount ( PlayerColor p ) {
        Stream.of(_chekers).filter(c -> c.getPlayer() == p).count();
    }
}



public static void main(String args[]) {
    new ChessBoard();
}