public class Stock {

    private String symbol;
    private int totalShsares;
    private double totalCost;

    //initializes a new stock with no shares purchased

    public Stock(String symbol){
        this.symbol = symbol;
        totalShsares = 0;
        totalCost = 0.0;
    }

public double getProfit(double currentPrice){
        double marketValue = totalShsares*currentPrice;
        return marketValue - totalCost;
    }

    public void purchase(int shares, double pricePerShare) {

        totalShsares+= shares;
        totalCost += shares*pricePerShare;
    }

    public int getTotalShsares(){
        return totalShsares;
    }
}
