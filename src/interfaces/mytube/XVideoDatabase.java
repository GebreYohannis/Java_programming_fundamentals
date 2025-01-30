package interfaces.mytube;

public class XVideoDatabase implements VideoDatabase {
    @Override
    public void store(Video video) {
        System.out.println("Storing video....");
        System.out.println("Done!\n");
    }
}
