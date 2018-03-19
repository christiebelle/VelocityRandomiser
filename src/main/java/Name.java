import java.lang.reflect.Array;
import java.util.ArrayList;

public class Name {

    private ArrayList<Name> names;

    public Name() {
        ArrayList<Name> names = new ArrayList<>();
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public Name findByIndex(int index){
        return names.get(index);
    }
}
