import java.util.ArrayList;

public class Name {

    private ArrayList<String> names;

    public Name() {
        this.names = new ArrayList<>();
        names.add("Hugh");
        names.add("Pew");
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
}
