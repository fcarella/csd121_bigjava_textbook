package ch05.sec03;

//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Test;

public class EarthquakeTest {
    @Test
    public void testLevel4()
    {
        Earthquake quake = new Earthquake(4);
        Assert.assertEquals("Felt by many people, no destruction",
                quake.getDescription());
    }
}