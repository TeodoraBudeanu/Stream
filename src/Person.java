import java.io.Serializable;

public class Person implements Serializable {

    public static final long serialVersionUID = 1;

    private String id;
    private String nume;
    private String prenume;

    public Person(String id, String nume, String prenume) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id +  " " + nume + " " + prenume;
    }
}
