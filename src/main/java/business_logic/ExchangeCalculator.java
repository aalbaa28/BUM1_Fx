package business_logic;

public interface ExchangeCalculator {

    String[] getCurrencyLongNames();

    double getChangeValue(String origCurrency, double amount, String endCurrency) throws Exception;

    double calculateCommission(double amount, String origCurrecy) throws Exception;

    static BarcenaysCalculator getCalculator(){
        return (new BarcenaysCalculator());
    }

}
