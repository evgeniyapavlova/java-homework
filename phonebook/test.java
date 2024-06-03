public class test {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        User user1 = new User("John");
        user1.addPhoneNumber("444-5563");
        user1.addPhoneNumber("123-123-123");
        user1.addPhoneNumber("298374-982374");

        User user2 = new User("Jack");

        User user3 = new User("Anna");
        user3.addPhoneNumber("298374-982374");

        pb.addUser(user1);
        pb.addUser(user2);
        pb.addUser(user3);
        pb.printAll();
    }
}
