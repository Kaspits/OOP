package HW.service;

import java.util.Iterator;
import java.util.List;

import HW.tree.FamilyTreeItem;

public class HumanIterator<E extends FamilyTreeItem<E>> implements Iterator<E> {
    private int index;
    private List<E> humanList;

    public HumanIterator(List<E> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return index < humanList.size();
    }

    @Override
    public E next() {
        return humanList.get(index++);
    }
}