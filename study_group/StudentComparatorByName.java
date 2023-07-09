package study_group;

import java.util.Comparator;

public class StudentComparatorByName<E> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }

}