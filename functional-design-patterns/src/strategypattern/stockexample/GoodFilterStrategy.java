package strategypattern.stockexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GoodFilterStrategy {

	public List<Stock> filterStockByPredicate(List<Stock> allStocks , Predicate<Stock> predicate){
		
		List<Stock> filteredStock = new ArrayList<Stock>();
		
		for(Stock stock : allStocks) {
			if(predicate.test(stock)) {
				filteredStock.add(stock);
			}
		}
		
		return filteredStock;
	}
	
public List<Stock> filterStockStreamByPredicate(List<Stock> allStocks , Predicate<Stock> predicate){
	return allStocks
	.stream()
	.filter(predicate)
	.sorted(Comparator.comparing(Stock::getName))
	.collect(Collectors.toList());
	}
	
	
public List<Stock> filterStockByStrategy(List<Stock> allStocks , Function<List<Stock>, List<Stock>> strategy){
		
	return strategy.apply(allStocks);
	
}
}
