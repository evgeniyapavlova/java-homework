import java.util.ArrayList;
import java.util.List;

public class User {
    private List<String> phones = new ArrayList<>();

    public String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhoneNumber(String number) {
        this.phones.add(number);
    }

    // todo
    @Override
    public String toString() {
        if (this.phones.size() == 0) {
            return String.format("%s: no phone numbers", name);
        }

        return String.format("%s: ", name) + this.phones;
    }

}
