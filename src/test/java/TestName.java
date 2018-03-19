import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestName {

    private ArrayList<String> namelist;

        @Before
        public void before() {
            namelist = new ArrayList<>();
            namelist.add("Mark");
            namelist.add("Gary");
            namelist.add("Jason");
            namelist.add("Howard");
            namelist.add("Robbie");
        }

        @Test
        public void hasNames() {
            assertEquals(5, namelist.size());
        }

        @Test
        public void canAddMoreNames() {
            namelist.add("Take That");
            assertEquals(6, namelist.size());
        }

        @Test
        public void canDeleteNames() {
            namelist.remove(0);
            assertEquals(4, namelist.size());
        }

        @Test
        public void canFindByIndex() {
            assertEquals("Jason", namelist.get(2));
        }

        @Test
        public void testRandomise() {
            String result = null;
            ArrayList<String> acceptedvalues = new ArrayList<>();

               acceptedvalues.add("Mark");
               acceptedvalues.add("Gary");
               acceptedvalues.add("Jason");
               acceptedvalues.add("Howard");
               acceptedvalues.add("Robbie");

            result = namelist.randomise();
            assertEquals(true, acceptedvalues.contains(result));
        }



    }
}
