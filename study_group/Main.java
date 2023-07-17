package study_group;

import study_group.model.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Alex", 18);
        service.addStudent("Pablo", 19);
        service.addStudent("Elena", 17);
        service.addStudent("Slava", 20);

        System.out.println(service.getStudentsInfo());
        service.sortByName();
        System.out.println(service.getStudentsInfo());
        service.sortByAge();
        System.out.println(service.getStudentsInfo());
    }
}
