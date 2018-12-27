import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class File1 {
    public static void main(String[] args) {

        File f = new File("./resources/data.csv");
        System.out.println("Csv exists: " + f.exists());

        ListaPersoane listaPersoane = new ListaPersoane();

        try {
            Reader reader = new FileReader(f.getAbsolutePath());

            char[] buffer = new char[8];
            int read = reader.read(buffer);

            StringBuilder text = new StringBuilder();
            while (read != -1) {
                text.append(String.copyValueOf(buffer));
                read = reader.read(buffer);
            }


            String fullText = text.toString();
            String[] lines = fullText.split("\n");

            for (String line: lines) {
                String[] tokens = line.split(",");

                Person p = new Person(tokens[0], tokens[1], tokens[2]);
                listaPersoane.add(p);
            }

            System.out.println(text.toString());
            System.out.println("----------------------");
            listaPersoane.printAll();
            } catch(IOException e){
                System.err.println(e.getMessage());
                e.printStackTrace(System.err);
            }
        }
    }
