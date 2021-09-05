import accessories.KickPedal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KickPedalTest {

    KickPedal kickPedal;

    @Before
    public void before(){
        kickPedal = new KickPedal("Mapex", "P400TW Double Pedal", 89, 102);
    }

    @Test
    public void accessoriesHaveBrand(){
        assertEquals("Mapex", kickPedal.getBrand());
    }

    @Test
    public void accessoriesHaveDescription(){
        assertEquals("P400TW Double Pedal", kickPedal.getDescription());
    }

    @Test
    public void accessoriesHavePurchasePrice(){
        assertEquals(89, kickPedal.getPurchasePrice(), 0.01);
    }

    @Test
    public void accessoriesHaveSellingPrice(){
        assertEquals(102, kickPedal.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkupValue(){
        assertEquals(13, kickPedal.calculateMarkup(), 0.01);
    }

}
