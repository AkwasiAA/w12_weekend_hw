import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("E50 Music Shop");
    }

    @Test
    public void canGetShopName(){
        assertEquals("E50 Music Shop", shop.getName());
    }

    @Test
    public void canGetCurrentStock(){
    }

    @Test
    public void canAddStock(){

    }

    @Test
    public void canRemoveStock(){

    }
}
