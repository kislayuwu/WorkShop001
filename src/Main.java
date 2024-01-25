import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");

        //Array to create multiple Address BOOKS
        AddressBook[] addressBookArr=new AddressBook[3];
        for(int j=0;j< addressBookArr.length;j++) {
            addressBookArr[j] = new AddressBook();
            Service s1 = new Service();
            Person p1 = new Person();

            for (int i = 0; i < 2; i++) {
                s1.setValues(p1);
                System.out.println(s1.display(p1));
                addressBookArr[j].contactList.put(p1.getFirstName(), p1);
            }
            for (Map.Entry<String, Person> entry : addressBookArr[j].contactList.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            Scanner sc = new Scanner(System.in);

            //edit using person's name
    /*  System.out.println("Enter the first name of contact to edit contact");
        String edit=sc.next();
        s1.setValues(p1);
        a1.contactList.put(edit,p1);
        for (Map.Entry<String, Person> entry : a1.contactList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/

            //Edit using first name
            System.out.println("Enter the first name of contact to edit contact");
            String edit = sc.next();
            s1.edit(edit, addressBookArr[j], p1);


            //delete using first name
            System.out.println("Enter the first name of contact to delete contact");
            String delete = sc.next();
            s1.delete(delete, addressBookArr[j]);

            for (Map.Entry<String, Person> entry : addressBookArr[j].contactList.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }
}