public class DividendStock extends Stock {

    private double dividens;

    public DividendStock (String symbol){
        super(symbol);
        dividens = 0.0;
    }

    public double getProfit(double currentPrice){
        return super.getProfit(currentPrice) + dividens;
    }

    public void payDividend(double amaountPerShare){

        dividens += amaountPerShare * getTotalShsares();
    }
}
