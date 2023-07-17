package HW;

import java.time.LocalDate;

import HW.model.FamilyTreeService;
import HW.model.human.Gender;
import HW.model.human.Human;
import HW.model.save.FileHandlerForFamilyTree;
import HW.model.tree.FamilyTree;
import HW.view.Console;
import HW.view.View;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Human> tree = new FamilyTree<>();

        Human michael = (new Human("Michael", Gender.Male, LocalDate.of(1964, 11, 21)));
        Human elena = (new Human("Elena", Gender.Female, LocalDate.of(1968, 8, 21)));
        Human maria = (new Human("Maria", Gender.Female, LocalDate.of(1991, 6, 1), michael, elena));
        Human anastasiia = (new Human("Anastasiia", Gender.Female, LocalDate.of(2003, 3, 25), michael, elena));

        tree.add(michael);
        tree.add(elena);
        tree.add(maria);
        tree.add(anastasiia);

        Human grandMother = new Human("Tatyana", Gender.Female, LocalDate.of(1948, 12, 7));
        grandMother.addChild(michael);

        tree.add(grandMother);

        System.out.println(tree);

        FamilyTreeService service = new FamilyTreeService(tree);
        service.setWritable(new FileHandlerForFamilyTree());
        service.save();

        View view = new Console();
        view.start();
    }

}
