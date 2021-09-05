package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class BassGuitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;
    private boolean acoustic;

    public BassGuitar(String manufacturer, String type, String colour, String material, int purchasePrice, int sellingPrice, int numberOfStrings, boolean acoustic) {
        super(manufacturer, type, colour, material, purchasePrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
        this.acoustic = acoustic;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public boolean isAcoustic() {
        return acoustic;
    }

    public void setAcoustic(boolean acoustic) {
        this.acoustic = acoustic;
    }

    @Override
    public String play() {
        return "Bow chika wow wow";
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - getPurchasePrice();
    }
}
