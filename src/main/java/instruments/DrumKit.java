package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class DrumKit extends Instrument implements IPlay, ISell {

    private int numberOfPieces;

    public DrumKit(String manufacturer, String type, String colour, String material, int purchasePrice, int sellingPrice, int numberOfPieces) {
        super(manufacturer, type, colour, material, purchasePrice, sellingPrice);
        this.numberOfPieces = numberOfPieces;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }

    @Override
    public String play() {
        return "Badum psssh";
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - getPurchasePrice();
    }
}
