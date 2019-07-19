package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements AbstractFile {
    private String name;

    private List<AbstractFile> list = new ArrayList<>();    //子文件（夹）

    public void add(AbstractFile file){
        list.add(file);
    }

    public void remove(AbstractFile file){
        list.remove(file);
    }

    public AbstractFile get(int index){
        return list.get(index);
    }


    @Override
    public void killVirus() {
        System.out.println("---文件夹" + name + "正在查杀---");
        for (AbstractFile f : list) {
            f.killVirus();
        }
    }
}
