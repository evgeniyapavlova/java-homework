import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> usersWithPhones = new HashMap<>();

    public void addUser(User user) {
        this.usersWithPhones.put(user.getName(), user.getPhones());
    }

    public void printAll() {
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(this.usersWithPhones.entrySet());

        sortedEntries.sort(new Comparator<Map.Entry<String, List<String>>>() {
            @Override
            public int compare(Map.Entry<String, List<String>> e1, Map.Entry<String, List<String>> e2) {
                return Integer.compare(e2.getValue().size(), e1.getValue().size());
            }
        });
        System.out.println(sortedEntries);
    }
}
