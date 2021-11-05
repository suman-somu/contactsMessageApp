import java.sql.SQLOutput;
import java.util.Scanner;

public class MyApp {
    public static Scanner sc= new Scanner(System.in);


    //shown the name and after greetings ,
    // transfer the control to MainFunction method to continue.
    public static void main(String[] args) {


        System.out.println("enter your name:");
        String name=sc.nextLine();
        System.out.println("hello " + name +"\nwelcome to the app");

        MainFunction();
    }


    public static void MainFunction(){
        System.out.println("options: \n"+
                "\t1 manage contacts \n"+
                "\t2 messages \n"+
                "\t3 quit ");
        int choice =sc.nextInt();
        switch (choice){
            case 1:
                manageContacts();
                break;

            case 2:
                messages();
                break;
            case 3:
                break;
            default:
                System.out.println(" invalid choice \n choose a number from available options");
                MainFunction();
                break;
        }

    }


    private static void messages() {

    }


    private static void manageContacts(){

        System.out.println("choices available: \n"+
                "\t1 show all contacts \n"+
                "\t2 add a new contact \n"+
                "\t3 search a contact \n"+
                "\t4 delete a contact \n"+
                "\t5 go back to previous menu ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                //show all contacts
                Contacts.showAllContacts();
                manageContacts();
                break;
            case 2:
                // add a new contact

                Contacts.addContacts();
                manageContacts();
                break;
            case 3:
                //search contacts
                Contacts.searchContacts();
                manageContacts();
                break;
            case 4:
                //delete a contact
                Contacts.deleteContact();
                manageContacts();
                break;
            case 5:
                //go back to previous menu

                MainFunction();
                break;
            default:
                System.out.println(" invalid choice \n choose a number from available options");
                manageContacts();
                break;



        }
    }
}