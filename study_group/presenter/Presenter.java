package study_group.presenter;

import study_group.view.View;
import study_group.model.service.Service;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addStudent(String name, int age) {
        service.addStudent(name, age);
        getStudentsInfo();
    }

    public void getStudentsInfo() {
        String answer = service.getStudentsInfo();
        view.printAnswer(answer);
    }

    public void sortByAge() {
        service.sortByAge();
        getStudentsInfo();
    }

    public void sortByName() {
        service.sortByName();
        getStudentsInfo();
    }
}
