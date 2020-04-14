package strategypattern.stockexample;

import java.util.ArrayList;
import java.util.List;

public class BadfilterUtil {

	public List<Stock> filterStockBySymbol(List<Stock> allStocks , String symbol){
		
		List<Stock> filteredStock = new ArrayList<Stock>();
		
		for(Stock stock : allStocks) {
			if(symbol.equalsIgnoreCase(stock.getSymbol())) {
				filteredStock.add(stock);
			}
		}
		
		return filteredStock;
	}
	
public List<Stock> filterStockByPrice(List<Stock> allStocks , double price){
		
		List<Stock> filteredStock = new ArrayList<Stock>();
		
		for(Stock stock : allStocks) {
			if(price == stock.getRate()) {
				filteredStock.add(stock);
			}
		}
		
		return filteredStock;
	}
}
