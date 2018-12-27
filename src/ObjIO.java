import java.io.*;

public class ObjIO {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File f = new File("data.csv");
        writeToFile(f);
        readFromFile(f);

    }


    private static void readFromFile(File f) throws IOException, ClassNotFoundException, FileNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f)) {
                Person p = (Person) ois.readObject();
//                sout
            };
        } catch (IOException, ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
