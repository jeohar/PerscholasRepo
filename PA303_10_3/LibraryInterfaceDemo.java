package PA303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kidUser = new KidUser();
        KidUser kidUser2 = new KidUser();

        kidUser.age =10;
        kidUser.age = 18;
        kidUser.registerAccount();
        kidUser.bookType = "Kids";
        kidUser.bookType = "Fiction";
        kidUser.requestBook();


        System.out.println("--------------------------------------------------");


        AdultUser adultUser = new AdultUser();

        adultUser.age = 5;
        adultUser.registerAccount();
        adultUser.bookType = "Kids";
        adultUser.requestBook();


        //System.out.println("When the age is Over 11 and Booktype is Fiction");
        adultUser.age = 23;
        adultUser.registerAccount();;
        adultUser.bookType = "Fiction";
        adultUser.requestBook();




    }


}
