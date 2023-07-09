package study_group;

import java.util.Comparator;

public class StudentComparatorByAge<E> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
        // return o1.getAge() - o2.getAge(); second option
    }
}
