import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    void testTimeConversion(){

        TimeConversion timeConversion = new TimeConversion();

        String timeIn12HourFormat = "06:40:22AM";

        String convertedTime = timeConversion.timeConversion(timeIn12HourFormat);
        assertEquals("00:40:22", convertedTime);
    }
}