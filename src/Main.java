public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        Person p1 = new Person();
        Service s1 = new Service();
        s1.setValues(p1);
        System.out.println(s1.display(p1));
        AddressBook a1 = new AddressBook();
        a1.contactList.put(1,p1);
        System.out.println(a1.contactList);

    }
}