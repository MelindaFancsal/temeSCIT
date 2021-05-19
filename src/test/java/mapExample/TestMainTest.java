package mapExample;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class TestMainTest {

    @Test
    public void testRetriveNrAparitii_verificareNotNull() {
        String sir = "a b a";
        Map<String, Integer> result = TestMain.retriveNrAparitii(sir);
        assertNotNull(result);
    }

    @Test
    public void testRetriveNrAparitii_verificareNrAparitii() {
        String sir = "a b a";
        Map<String, Integer> result = TestMain.retriveNrAparitii(sir);
       assertEquals(2, result.size());
       assertTrue(result.containsKey("a"));
       assertEquals(Integer.valueOf(2), result.get("a"));
    }
}