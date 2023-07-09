package lesson_three;

public class Service {
    private int idStudent;
    private StudyGroup group;

    public Service() {
        group = new StudyGroup();
    }

    public void addStudent(String name, int age) {
        Student student = new Student(idStudent++, name, age);
        group.addStudent(student);
    }

    public String getStudentsInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of students:\n");
        // Iterator<Student> iterator = group.iterator();
        // while(iterator.hasNext()){
        // Student student = iterator.next();
        // sb.append(student);
        // sb.append("\n");
        // }
        for (Student student : group) {
            sb.append(student);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByName() {
        group.sortByName();
    }

    public void sortByAge() {
        group.sortByAge();
    }
}
