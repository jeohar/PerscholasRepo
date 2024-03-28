package PA303_10_3;

public class KidUser implements LibraryUser
{

    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if(age<=11){
            System.out.println("You have successfully registered as a kid");
        }else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }

    }

    @Override
    public void requestBook() {
        if(bookType.equals("Kids") ){
            System.out.println("Book issued successfully, please return the book within 10 days");
        }else{
            System.out.println("Oops, you are allowed to take only kids books.");

        }

    }
}

