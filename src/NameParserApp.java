//
//Chris Blaylock
//11/24/2020
//
import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        //remove anything unwanted from name
        name = name.trim();
        //set index of spaces
        int index1 = name.indexOf(" ");
        if (index1 == -1) {
            System.out.println("This name is not in the valid format");
        }
        else {
            //set index of space and look for second word
            int index2 = name.indexOf(" ", index1 + 1);
            if (index2 == -1){
                String firstName = name.substring(0, index1);
                String lastName = name.substring(index1 + 1);
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);            
            }
            else {
                //set index of space and look for third word
                int index3 = name.indexOf(" ", index2 + 1);
                if (index3 == -1){
                    String firstName = name.substring(0, index1);
                    String middleName = name.substring(index1 + 1, index2);
                    String lastName = name.substring(index2 + 1);
                    System.out.println("First name: " + firstName);
                    System.out.println("Middle name: " + middleName);
                    System.out.println("Last name: " + lastName);
                } else {
                    System.out.println("This name is not in the correct format.");
                
                }
            }
        }
        
        
        
    }
}
