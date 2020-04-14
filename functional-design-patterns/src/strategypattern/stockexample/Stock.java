package strategypattern.stockexample;

public class Stock {

	private String name;
	private String symbol;
	private Double rate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Stock(String name, String symbol, Double rate) {
		this.name = name;
		this.symbol = symbol;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Stock [name=" + name + ", symbol=" + symbol + ", rate=" + rate + "]";
	}
}
