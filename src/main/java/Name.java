import java.util.ArrayList;
import java.util.Collections;

public class Name {

    private ArrayList<String> names;

    public Name() {
        this.names = new ArrayList<>();
        names.add("Hugh");
        names.add("Pugh");
        names.add("Barney McGrew");
        names.add("Cuthbert");
        names.add("Dibble");
        names.add("Grub");
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public String find(int index){
        return names.get(index);
    }

    public String randomise(){
        Collections.shuffle(names);
        return names.get(0);
    }
}
