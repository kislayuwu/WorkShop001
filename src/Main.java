import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        AddressBook a1 = new AddressBook();
        Person p1 = new Person();
        Service s1 = new Service();
        for(int i=0;i<2;i++) {
            s1.setValues(p1);
            System.out.println(s1.display(p1));
            a1.contactList.put(p1.getFirstName(), p1);
        }
        for (Map.Entry<String, Person> entry : a1.contactList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //edit using person's name
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name of contact to edit contact");
        String edit=sc.next();
        s1.setValues(p1);
        a1.contactList.put(edit,p1);
        for (Map.Entry<String, Person> entry : a1.contactList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}