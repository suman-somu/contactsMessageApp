import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
    static Scanner sc=new Scanner(System.in);


    private static ArrayList<String> PhoneNumbers;

    public static ArrayList<String> getNames() {
        return Names;
    }

    private static ArrayList<String> Names;


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
        String number= sc.nextLine();


        if(!name.isBlank() ){
            if(!number.isBlank()){
                {

                    //check if the arraylists are null then create instance of them (perhaps that's what it's called) and then add elements

                    if(Names ==null && PhoneNumbers ==null){
                        Names = new ArrayList<String>();
                        PhoneNumbers= new ArrayList<String>();
                    }


                    Names.add(name);
                    PhoneNumbers.add(number);
                    System.out.println("contact added successfully");
                }
            }
            else{
                System.out.println("enter a valid phone number");
            }
        }
        else{
            System.out.println("enter a valid name.");
        }
    }

    public static void searchContacts(){

        //if there are atleast a contact saved then the searching process will begin
        if(Names!= null && PhoneNumbers != null) {
            System.out.println("enter the contact you want to search -");

            //takes input from user and checking started
            String name = sc.nextLine();
            if(!name.isBlank()){

                for(String s: Names) {
                    if (s == name) {
                        System.out.println("Contact found");
                        System.out.println("Name-" + name + " " + "phone number-" + PhoneNumbers.get(Names.indexOf(s)));

                    }
                    else{
                        System.out.println("there is no contact in this name");
                    }
                }
            }
            else {
                System.out.println("please enter a valid name ");
            }
        }
        //there are no contacts saved
        else {
            System.out.println("there are no contacts. \n Please try after adding some.");
        }
    }

    public static void deleteContact() {

        //if the contact list has atleast one contact then the delete process will begin
        if(Names!=null && PhoneNumbers!= null){
            System.out.println("please enter a contact to delete-");
            String name= sc.nextLine();

            //if the entered name is not blank then the searching will start
            if(!name.isBlank()){
                for(String s:Names){
                    if(s.equals(name)){
                        PhoneNumbers.remove(Names.indexOf(s));
                        Names.remove(s);
                    }
                    else{
                        System.out.println("there is no contact like this in your contact list");
                    }
                }

            }
            else{
                System.out.println("please enter a valid name next time to try again");
            }

        }
        else {
            System.out.println("there is no contact to be deleted");
        }

    }
}
