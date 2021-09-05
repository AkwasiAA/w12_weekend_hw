package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Oboe extends Instrument implements IPlay, ISell {

    private String style;

    public Oboe(String manufacturer, String type, String colour, String material, int purchasePrice, int sellingPrice, String style) {
        super(manufacturer, type, colour, material, purchasePrice, sellingPrice);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String play() {
        return "Toot toot";
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - getPurchasePrice();
    }
}
