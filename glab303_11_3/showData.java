package glab303_11_3;

import java.util.ArrayList;

public class showData {
    public static void main(String[] args) {
        //instantiation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();

        for(Book showValue :mybooklist){
            System.out.println(showValue.getNumber() + " " + showValue.getName() + " " + showValue.getCategory() +" "+ showValue.getAuthor());
        }

    }
}
