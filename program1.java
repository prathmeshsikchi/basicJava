import java.util.ArrayList;

public class program1 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java", "ABC", "Oracle", 20);
        Book b2 = new Book(2, "C++", "DEF", "Oracle", 10);
        Book b3 = new Book(3, "Python", "XYZ", "Pych", 30);

        ArrayList<Book> ar = new ArrayList<Book>();
        ar.add(b1);
        ar.add(b2);
        ar.add(b3);

        for (Book b : ar) {
            b.print();
        }

    }

}

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    void print() {
        System.out.print(id + "\t");
        System.out.print(name + "\t");
        System.out.print(author + "\t");
        System.out.print(publisher + "\t");
        System.out.print(quantity + "\t");
        System.out.println();
        System.out.println();
    }

}