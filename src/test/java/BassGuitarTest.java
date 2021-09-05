import instruments.BassGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {

    private BassGuitar bassGuitar;

    @Before
    public void before(){
        bassGuitar = new BassGuitar("Fender", "Strings", "Firemist Gold", "Alder Wood", 716, 916, 4, false);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Fender", bassGuitar.getManufacturer());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals("Strings", bassGuitar.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Firemist Gold", bassGuitar.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Alder Wood", bassGuitar.getMaterial());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(716, bassGuitar.getPurchasePrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(916, bassGuitar.getSellingPrice());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(4, bassGuitar.getNumberOfStrings());
    }

    @Test
    public void hasTrueOrFalseAcousticValue(){
        assertEquals(false, bassGuitar.isAcoustic());
    }

    @Test
    public void canPlayBassGuitar(){
        assertEquals("Bow chika wow wow", bassGuitar.play());
    }

    @Test
    public void canCalculateMarkupValue(){
        assertEquals(200, bassGuitar.calculateMarkup(), 0.01);
    }

}
