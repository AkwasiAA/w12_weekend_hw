import accessories.BassGuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarStringsTest {

    BassGuitarStrings bassGuitarStrings;

    @Before
    public void before(){
        bassGuitarStrings = new BassGuitarStrings("Fender", "Super 8250M Bass Guitar Strings", 14.49, 24.49);
    }

    @Test
    public void accessoriesHaveBrand(){
        assertEquals("Fender", bassGuitarStrings.getBrand());
    }

    @Test
    public void accessoriesHaveDescription(){
        assertEquals("Super 8250M Bass Guitar Strings", bassGuitarStrings.getDescription());
    }

    @Test
    public void accessoriesHavePurchasePrice(){
        assertEquals(14.49, bassGuitarStrings.getPurchasePrice(), 0.01);
    }

    @Test
    public void accessoriesHaveSellingPrice(){
        assertEquals(24.49, bassGuitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkupValue(){
        assertEquals(10, bassGuitarStrings.calculateMarkup(), 0.01);
    }
}
