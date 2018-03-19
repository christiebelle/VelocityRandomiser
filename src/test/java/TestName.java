import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestName {

    private ArrayList<String> testnames;

        @Before
        public void before() {
            testnames = new ArrayList<>();
            testnames.add("Mark");
            testnames.add("Gary");
            testnames.add("Jason");
            testnames.add("Howard");
            testnames.add("Robbie");
        }

        @Test
        public void hasNames() {
            assertEquals(5, testnames.size());
        }

        @Test
        public void canAddMoreNames() {
            testnames.add("Take That");
            assertEquals(6, testnames.size());
        }

        @Test
        public void canDeleteNames() {
            testnames.remove(0);
            assertEquals(4, testnames.size());
        }

        @Test
        public void canFindByIndex() {
            assertEquals("Jason", testnames.get(2));
        }

        @Test
        public void testRandomise() {


            assertEquals(true, acceptedvalues.contains(result));
        }
}
