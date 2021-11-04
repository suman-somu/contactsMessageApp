import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
    static Scanner sc=new Scanner(System.in);


    public static ArrayList<String> PhoneNumbers;
    public static ArrayList<String> Names;


    public static void showAllContacts(){
        if(PhoneNumbers != null && Names != null ) {
            System.out.println("available contacts:\n");
            for (int i=0;i< Names.size();i++)
                System.out.println(Names.get(i) +" " + PhoneNumbers.get(i));
            System.out.println("\n end of the list");
        }
        else System.out.println("there is no contact. \nPlease add some and then try again.");
    }

    public static void addContacts(){
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter number");
        String number= sc.next();


        if(name !=null && number!=null) {

            //check if the arraylists are null then create instance of them (perhaps that's what it's called) and then add elements

            if(Names ==null && PhoneNumbers ==null){
                Names = new ArrayList<String>();
                PhoneNumbers= new ArrayList<String>();
            }


            Names.add(name);
            PhoneNumbers.add(number);
            System.out.println("contact added successfully");
        }
        else System.out.println("enter a valid name and number.");
    }

    public static void searchContacts(){

        if(Names!= null && PhoneNumbers != null) {
            System.out.println("enter the contact you want to search -");
            String name = sc.next();
                     
        }
        else {
            System.out.println("there are no contacts. \n Please try after adding some.");
        }
    }


}
