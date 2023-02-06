package business_logic;

public class BarcenaysCalculator implements ExchangeCalculator{


    @Override
    public String[] getCurrencyLongNames() {
        return new String[0];
    }

    @Override
    public double getChangeValue(String origCurrency, double amount, String endCurrency) throws Exception {
        ForexOperator operator = new ForexOperator(origCurrency,amount,endCurrency);
        return operator.getChangeValue();
    }

    @Override
    public double calculateCommission(double amount, String origCurrecy) throws Exception {
        CommissionCalculator calculator = new CommissionCalculator(amount,origCurrecy);
        return calculator.calculateCommission();
        
    }
}
