package HW.tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface FamilyTreeItem<T> extends Serializable {
    // void setId(long id); // long getId();

    T getFather();

    T getMother();

    boolean addChild(T human);

    boolean addParent(T human);

    String getName();

    LocalDate getBirthDate();

    LocalDate getDeathDate();

    List<T> getParents();

    List<T> getChildren();
}
