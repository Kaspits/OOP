package study_group.model.student;

import java.util.Comparator;

import study_group.model.group.GroupItem;

public class StudentComparatorByAge<E extends GroupItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
        // return o1.getAge() - o2.getAge(); second option
    }
}
