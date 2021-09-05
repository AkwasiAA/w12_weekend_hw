import accessories.OboeCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeCaseTest {

    OboeCase oboeCase;

    @Before
    public void before(){
        oboeCase = new OboeCase("SKB", "Lightweight Oboe Case", 55, 75);
    }

    @Test
    public void accessoriesHaveBrand(){
        assertEquals("SKB", oboeCase.getBrand());
    }

    @Test
    public void accessoriesHaveDescription(){
        assertEquals("Lightweight Oboe Case", oboeCase.getDescription());
    }

    @Test
    public void accessoriesHavePurchasePrice(){
        assertEquals(55, oboeCase.getPurchasePrice(), 0.01);
    }

    @Test
    public void accessoriesHaveSellingPrice(){
        assertEquals(75, oboeCase.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkupValue(){
        assertEquals(20, oboeCase.calculateMarkup(), 0.01);
    }

}
