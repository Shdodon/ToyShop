package ToysComparator;

import Toy.Toys;

import java.util.Comparator;

public class ToyComparator <T extends Toys> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if (o1.getToyId() < o2.getToyId()){
            return 1;
        }
        else return -1;
    }
}
