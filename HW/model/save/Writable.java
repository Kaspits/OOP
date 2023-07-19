package HW.model.save;

import HW.model.tree.FamilyTree;
import HW.model.human.Human;

public interface Writable {
    boolean save(FamilyTree<Human> tree);

    FamilyTree<Human> read();

    void setFilePath(String filePath);
}