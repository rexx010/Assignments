package geoZone;

import org.junit.jupiter.api.Test;

import static geoZone.PoliticalZone.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PoliticalZoneTest {
    @Test
    public void checkYourPoliticalZone() {
        PoliticalZone politicalZone = PoliticalZone.getPoliticalZone("FCT");
        assertEquals(NORTH_CENTRAL, politicalZone);
    }
}
