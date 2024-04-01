package glab303_11_3;
import java.util.ArrayList;

public class AddDataToArrayList {

    public ArrayList<Book> bookdetails() {


        ArrayList<Book> list = new ArrayList<Book>();
        //passing dta using constructors
        Book b1 = new Book(1, "Death note", "Arsalan", "cartoon");
        Book b2 = new Book(2, "Stranger Things", "Johar", "kids");
        Book b3 = new Book(3, "Spider man", "Hasib", "Action");
        Book b4 = new Book(4, "GentleMen", "Adieb", "suspense");


        //passing data using setter

        Book b5 = new Book();
        b5.setNumber(5);
        b5.setName("Java FullStack");
        b5.setAuthor("Flex");
        b5.setCategory("Programming");
        //adding books objects to ArrayList

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        return list;
    }

}
