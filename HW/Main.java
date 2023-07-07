package HW;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        tree.add(new Human("Michale", Gender.Male, LocalDate.of(1964, 11, 21)));
        tree.add(new Human("Elena", Gender.Female, LocalDate.of(1968, 8, 21)));
        tree.add(new Human("Maria", Gender.Female, LocalDate.of(1991, 6, 1), tree.getByName("Michale"),
                tree.getByName("Elena")));
        tree.add(new Human("Anastasiia", Gender.Female, LocalDate.of(2003, 3, 25), tree.getByName("Michale"),
                tree.getByName("Elena")));

        System.out.println(tree.getInfo());
    }

}
