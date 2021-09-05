import instruments.DrumKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void before(){
        drumKit = new DrumKit("Mapex", "Percussion", "Satin Black", "Maple Walnut", 1000, 1499, 5);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Mapex", drumKit.getManufacturer());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals("Percussion", drumKit.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Satin Black", drumKit.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Maple Walnut", drumKit.getMaterial());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(1000, drumKit.getPurchasePrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1499, drumKit.getSellingPrice());
    }

    @Test
    public void hasNumberOfPieces(){
        assertEquals(5, drumKit.getNumberOfPieces());
    }

    @Test
    public void canPlayDrumKit(){
        assertEquals("Badum psssh", drumKit.play());
    }

    @Test
    public void canCalculateMarkupValue(){
        assertEquals(499, drumKit.calculateMarkup(), 0.01);
    }

}
