package HW.model.tree;

import java.util.Comparator;

public class FamilyTreeComparatorByDeathDate<T extends TreeNode<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getDeathDate().compareTo(o2.getDeathDate());
    }

}