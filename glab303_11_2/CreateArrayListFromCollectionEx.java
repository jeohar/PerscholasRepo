package glab303_11_2;
import java.util.List;
import java.util.ArrayList;

public class CreateArrayListFromCollectionEx {
    public static void main(String[] args) {


        List<String> topCompanies = new ArrayList<>();

        //Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        //find the size of an arraylist

        System.out.println("Here are the top " + topCompanies.size() + " companies in teh world");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastBestCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company:v" + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Best Company: " + lastBestCompany);

        //Modify the element at a given index
        topCompanies.set(4,"Walmart");
        System.out.println("Modified top companies list: " + topCompanies);

    }
}