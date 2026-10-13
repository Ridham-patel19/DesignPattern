package CreationalPattern.PrototypePattern;


import java.util.ArrayList;
import java.util.List;

interface Prototype<T>{
    T clone();
}

class Piece1 implements Prototype<Piece1>{
    private String color;
    private int position;


    public Piece1(String color, int position) {
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

    @Override
    public Piece1 clone() {
        return new Piece1(this.color , this.position);
    }
}


class Board1 implements Prototype<Board1>{
    List<Piece1> pieces;


    public Board1() {
        this.pieces = new ArrayList<>();
    }

    public void addPiece(Piece1 piece){
        pieces.add(piece);
    }

    public List<Piece1> getPieces() {
        return pieces;
    }

    public void printBoard(){
        for(Piece1 p : pieces){
            //this is sshallow copy cuz we rae giving direct ref
            System.out.println(p);
        }
    }

    @Override
    public Board1 clone() {
        Board1 newBoard = new Board1();
       for(Piece1 p : pieces){

           // here we are using p.clone so we are creating hard copy not just passing ref which
           //shalloww copy
           newBoard.pieces.add(p.clone());
       }

       return newBoard;
    }
}

//all class shpould have porperty to clon and return their xurrent prototype
public class WithPrototypePattern {

    public static void main(String[] args) {
        Board1 board = new Board1();

        board.addPiece(new Piece1("red" , 1));
        board.addPiece(new Piece1("blue" , 2));

        board.printBoard();


        // so now client isnot tighly coupled with Piece
        //so now client doesnot care if board chnage or Piece added it can diectly get a clone for
        //board from its  current obkject
        Board1 newBoard = board.clone();
        System.out.println("Copied board");
        newBoard.printBoard();
    }
}
