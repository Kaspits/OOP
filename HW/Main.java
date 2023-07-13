package HW;

import java.time.LocalDate;

import HW.persons.Gender;
import HW.persons.Human;
// import HW.service.FileHandler;
import HW.tree.FamilyTree;

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

        System.out.println(tree);

        // FileHandler fileHandler = new FileHandler();
        // fileHandler.save(tree, "HW/tree.out");

        // FamilyTree tree = (FamilyTree) fileHandler.read("HW/tree.out");
        // System.out.println(tree);

    }

}
