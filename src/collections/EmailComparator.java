package collections;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer first, Customer second) {
        return first.getEmail().compareTo(second.getEmail());
    }
}
