import java.util.ArrayList;
import java.util.List;

public class ListaPersoane {

    public List<Person> lista = new ArrayList<>();

    public  void add(Person p) {
        lista.add(p);
    }

    public  void remove(int id) {
        for (Person p : lista) {
            if (p.getId().equals(id)) {
                lista.remove(p);
            }
        }
    }

    public  void printAll(){
        for(Person p: lista){
            System.out.println(p.toString());
        }
    }
}
