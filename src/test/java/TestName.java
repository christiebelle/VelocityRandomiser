import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestName {

    private Name testnames;

        @Before
        public void before() {
            testnames = new Name();
        }

        @Test
        public void hasNames() {
            assertEquals(6, testnames.getNames().size());
        }

        @Test
        public void canAddMoreNames() {
            testnames.add("Camberwick Green");
            assertEquals(7, testnames.getNames().size());
        }

        @Test
        public void canDeleteNames() {
            testnames.remove("Barney McGrew");
            assertEquals(5, testnames.getNames().size());
        }

        @Test
        public void canFindByIndex() {
            assertEquals("Barney McGrew", testnames.find(2));
        }

        @Test
        public void testRandomise() {
            Name acceptedvalues = new Name();
            String result = acceptedvalues.randomise();
            assertEquals(true, acceptedvalues.getNames().contains(result));
        }
}
