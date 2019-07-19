package structural.composite;

/**
 * 相当于组合模式中的leaf
 */
public class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---图像文件" + name + "进行查杀---");
    }
}
