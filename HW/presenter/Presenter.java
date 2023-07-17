package HW.presenter;

import HW.model.FamilyTreeService;
import HW.view.View;

public class Presenter {
    private View view;
    private FamilyTreeService service;

    public Presenter(View view) {
        service = new FamilyTreeService();
        this.view = view;
    }

    public void getHumanList() {
        String answer = service.getHumanList();
        view.print(answer);
    }
}