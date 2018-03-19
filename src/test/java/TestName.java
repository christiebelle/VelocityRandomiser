import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestName {

    private ArrayList<String> names;

        @Before
        public void before() {
            ArrayList<String> names = new ArrayList<>();
            names.add("Mark");
            names.add("Gary");
            names.add("Jason");
            names.add("Howard");
            names.add("Robbie");
        }

        @Test
        public void hasNames() {
            assertEquals(5,names.size());
        }

        @Test
        public void canAddMoreNames() {
            names.add("Take That");
            assertEquals(6, names.size());
        }

        @Test
        public void canDeleteNames() {
            names.remove(0);
            assertEquals(5, names.size());
        }

        @Test
        public void canFindNameByIndex() {
            assertEquals("Jason", names.get(1));
        }
}
