import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {
    @Test
    public void shouldSayThat15IsInRange() {
        Range range = new Range(10, 20);
        Assert.assertTrue(range.isInRange(35));
    }
}