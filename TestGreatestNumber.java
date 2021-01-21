import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGreatestNumber {
   
    @Test
    public void testGreatestNumber() {
        assertEquals(25, GreatestNumber.greatest(12, 25, 23));
        assertEquals(5, GreatestNumber.greatest(3, 5, 5));
    }

}
