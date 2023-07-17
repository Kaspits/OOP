package study_group.model.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import study_group.model.student.StudentComparatorByAge;
import study_group.model.student.StudentComparatorByName;
import study_group.model.student.StudentIterator;

public class StudyGroup<E extends GroupItem> implements Iterable<E> {
    private List<E> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(E student) {
        studentList.add(student);
    }

    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<>(studentList);
        // return studentList.iterator();
    }

    public void sortByName() {
        studentList.sort(new StudentComparatorByName<>());
    }

    public void sortByAge() {
        studentList.sort(new StudentComparatorByAge<>());
    }
}