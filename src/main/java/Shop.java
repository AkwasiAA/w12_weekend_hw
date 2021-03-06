import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int takeStockInventory(){
        return this.stock.size();
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public void removeStock(ISell item){
        this.stock.remove(item);
    }

    public double totalPotentialProfit(){
        double profit = 0;
        for(ISell item : stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
