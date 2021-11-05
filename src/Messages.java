import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Messages {

    static Scanner sc= new Scanner(System.in);

    private static ArrayList<String> messages;

    public static void showAllMessages() {

        if(messages != null){
            System.out.println("your all messages= \n");
            for(String m: messages) {
                String name= Contacts.getNames().get(messages.indexOf(m));
                System.out.println("name="+ name + "  " + "message=" + m + "\n");
            }
        }
        else{
            System.out.println("there are no messages");
        }
    }

    public static void sendNewMessage() {
        System.out.println("enter the recipient's name \n");
        String name=sc.nextLine();
        System.out.println("enter the message \n");
        String message= sc.nextLine();

        if(!name.isBlank() ){
            if(!message.isBlank()){

                if(messages== null){
                    messages= new ArrayList<String>();
                }


                if(Contacts.getNames().contains(name)){
                    //return true if the Names arraylist in the contact class has the "name" contact .

                    messages.add(Contacts.getNames().indexOf(name), message);

                }
                else {
                    System.out.println("there is no such contact in the list. \n please try after adding the contact.");;
                }
            }
            else{
                System.out.println("enter some message to send");
            }
        }else{
            System.out.println("enter a valid name");
        }
    }
}
