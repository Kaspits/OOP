package HW.Tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import HW.Comparators.HumanComparatorByBirthDate;
import HW.Comparators.HumanComparatorByName;
import HW.Persons.Human;
import HW.Service.HumanIterator;

public class FamilyTree implements Serializable, Iterable<Human> {
    private List<Human> humanList;

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public boolean add(Human human) {
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)) {
            humanList.add(human);

            addToParents(human);

            addToChildren(human);

            return true;
        }
        return false;
    }

    private void addToParents(Human human) {
        for (Human parent : human.getParents()) {
            parent.addChild(human);
        }
    }

    private void addToChildren(Human human) {
        for (Human child : human.getChildren()) {
            child.addParent(human);
        }
    }

    public Human getByName(String name) {
        for (Human human : humanList) {
            if (human.getName().equals(name)) {
                return human;
            }
        }
        return null;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("At tree ");
        sb.append(humanList.size());
        sb.append(" persons: \n");
        for (Human human : humanList) {
            sb.append(human.getInfo());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(humanList);
    }

    public void sortByName() {
        humanList.sort(new HumanComparatorByName());
    }

    public void sortByBirthDate() {
        humanList.sort(new HumanComparatorByBirthDate());
    }
}
