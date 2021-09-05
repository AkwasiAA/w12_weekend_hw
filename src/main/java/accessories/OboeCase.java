package accessories;

import behaviours.ISell;

public class OboeCase implements ISell {

    private String brand;
    private String description;
    private double purchasePrice;
    private double sellingPrice;

    public OboeCase(String brand, String description, double purchasePrice, double sellingPrice) {
        this.brand = brand;
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - getPurchasePrice();
    }
}
