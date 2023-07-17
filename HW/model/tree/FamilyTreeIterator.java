package HW.model.tree;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator<T extends TreeNode<T>> implements Iterator<T> {
    private int index;
    private List<T> list;

    public FamilyTreeIterator(List<T> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}