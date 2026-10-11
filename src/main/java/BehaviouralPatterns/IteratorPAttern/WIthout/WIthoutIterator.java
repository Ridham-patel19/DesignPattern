package BehaviouralPatterns.IteratorPAttern.WIthout;

public class WIthoutIterator {

    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        collection.addBook(new Book("C++"));
        collection.addBook(new Book("JAVA"));




// now here we have boook collection now we can get that but see to itrate we
//        are using for loop but in future we can have another data structure here may be
//                tree then we have to chnage this client code too
         for(Book book : collection.getBooks() ){
             System.out.println(book);
         }
    }
}
