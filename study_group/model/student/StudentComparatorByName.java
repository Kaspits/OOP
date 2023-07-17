package study_group.model.student;

import java.util.Comparator;

import study_group.model.group.GroupItem;

public class StudentComparatorByName<E extends GroupItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
