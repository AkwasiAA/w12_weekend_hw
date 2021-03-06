import accessories.BassGuitarStrings;
import accessories.KickPedal;
import accessories.OboeCase;
import instruments.BassGuitar;
import instruments.DrumKit;
import instruments.Oboe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    BassGuitar bassGuitar;
    DrumKit drumKit;
    Oboe oboe;
    BassGuitarStrings bassGuitarStrings;
    KickPedal kickPedal;
    OboeCase oboeCase;

    @Before
    public void before(){
        shop = new Shop("E50 Music Shop");
        bassGuitar = new BassGuitar("Fender", "Strings", "Firemist Gold", "Alder Wood", 716, 916, 4, false);
        drumKit = new DrumKit("Mapex", "Percussion", "Satin Black", "Maple Walnut", 1000, 1499, 5);
        oboe = new Oboe("Buffet", "Woodwind", "Black", "African Blackwood", 2500, 2929, "Conservatoire");
        bassGuitarStrings = new BassGuitarStrings("Fender", "Super 8250M Bass Guitar Strings", 14.49, 24.49);
        kickPedal = new KickPedal("Mapex", "P400TW Double Pedal", 89, 102);
        oboeCase = new OboeCase("SKB", "Lightweight Oboe Case", 55, 75);
    }

    @Test
    public void canGetShopName(){
        assertEquals("E50 Music Shop", shop.getName());
    }

    @Test
    public void canGetCurrentStock(){
        assertEquals(0, shop.takeStockInventory());
    }

    @Test
    public void canAddStock(){
        shop.addStock(bassGuitar);
        shop.addStock(drumKit);
        shop.addStock(oboe);
        shop.addStock(bassGuitarStrings);
        shop.addStock(kickPedal);
        shop.addStock(oboeCase);
        assertEquals(6, shop.takeStockInventory());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(bassGuitar);
        shop.addStock(drumKit);
        shop.addStock(oboe);
        shop.addStock(bassGuitarStrings);
        shop.addStock(kickPedal);
        shop.addStock(oboeCase);
        shop.removeStock(oboe);
        shop.removeStock(oboeCase);
        assertEquals(4, shop.takeStockInventory());
    }

    @Test
    public void canGetTotalPotentialProfit(){
        DrumKit drumKit = new DrumKit("Mapex", "Percussion", "Satin Black", "Maple Walnut", 1000, 1499, 5);
        shop.addStock(drumKit);
        assertEquals(499, shop.totalPotentialProfit(), 0.01);

    }
}
