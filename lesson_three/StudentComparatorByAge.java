package lesson_three;

import java.util.Comparator;

public class StudentComparatorByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
        // return o1.getAge() - o2.getAge(); second option
    }
}