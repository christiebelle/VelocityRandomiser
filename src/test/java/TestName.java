import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestName {

    private ArrayList<Name> names;

        @Before
        public void before() {
            ArrayList<Name> names = new ArrayList<Name>();
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
            names.get(1);
            assertEquals("Jason", names.findByIndex());
        }





    }
}
