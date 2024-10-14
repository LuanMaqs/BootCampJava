

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader DBL = new DatabaseLoader();
        FileLoader FL = new FileLoader();

        DBL.load();
        FL.load();
    }
}
