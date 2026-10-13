package CreationalPattern.PrototypePattern;


import java.util.ArrayList;
import java.util.List;

class Piece{
    private String color;
    private int position;


    public Piece(String color, int position) {
        this.color = color;
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }
}


class Board{
    List<Piece> pieces;


    public Board() {
        this.pieces = new ArrayList<>();
    }

    public void addPiece(Piece piece){
        pieces.add(piece);
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void printBoard(){
        for(Piece p : pieces){
            System.out.println(p);
        }
    }
}
public class WithoutPrototype {

    public static void main(String[] args) {
         Board board = new Board();

         board.addPiece(new Piece("red" , 1));
         board.addPiece(new Piece("blue" , 2));

         board.printBoard();

         //now lets say we have to copy the current board now we have to do that in this
        //client code
        Board newBoard = new Board();
        for(Piece piece : board.getPieces()){

            newBoard.addPiece(piece);
        }

        System.out.println("copied Board");
//        newBoard.addPiece(new Piece("blue" , 3));
        newBoard.printBoard();

        //now you can see that we have copied the board but all this code we have to do in client
        // and also client knows or tightly coupled with Piece and Board which is wrong
        //if something goes wrong than we have to chnage in client too


    }
}
