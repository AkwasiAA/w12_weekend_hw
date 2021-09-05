import instruments.Oboe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {

    Oboe oboe;

    @Before
    public void before(){
        oboe = new Oboe("Buffet", "Woodwind", "Black", "African Blackwood", 2500, 2929, "Conservatoire");
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Buffet", oboe.getManufacturer());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals("Woodwind", oboe.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", oboe.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("African Blackwood", oboe.getMaterial());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(2500, oboe.getPurchasePrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(2929, oboe.getSellingPrice());
    }

    @Test
    public void hasOboeStyle(){
        assertEquals("Conservatoire", oboe.getStyle());
    }

    @Test
    public void canPlayDrumKit(){
        assertEquals("Toot toot", oboe.play());
    }

    @Test
    public void canCalculateMarkupValue(){
        assertEquals(429, oboe.calculateMarkup(), 0.01);
    }

}
