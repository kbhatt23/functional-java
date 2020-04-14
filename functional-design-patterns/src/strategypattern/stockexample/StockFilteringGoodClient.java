package strategypattern.stockexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StockFilteringGoodClient {
public static void main(String[] args) {
	List<Stock> allStocks = populateStockData();

	GoodFilterStrategy util  =new GoodFilterStrategy();
	
	//using strategy
	Function<List<Stock>, List<Stock>> strategy1 = (items) -> {
		return 
				items.stream()
					 .filter(item -> item.getSymbol().equals("ram"))
					 .collect(Collectors.toList());
	};
	
	util.filterStockByStrategy(allStocks, strategy1)
		.forEach(System.out::println);
	;
	
	System.out.println("==============using predicate starts====================");
	//using predicate
	Predicate<Stock> filterByPrice = (stock) -> stock.getRate()==199.99;
	util.filterStockByPredicate(allStocks, filterByPrice)
	.forEach(System.out::println);
		;
		System.out.println("==============using stream predicate=============");
	
		util.filterStockStreamByPredicate(allStocks, filterByPrice)
		.forEach(System.out::println);
			;
	
}

private static List<Stock> populateStockData() {
	Stock stock1 = new Stock("ram bhakt hanuman", "ram", 199.99);
	Stock stock2 = new Stock("ram bhakt lakshman", "ram", 99.99);
	Stock stock3 = new Stock("ram bhakt sugreev", "ram", 69.99);
	Stock stock4 = new Stock("ram bhakt angad", "ram", 599.99);
	Stock stock5 = new Stock("krishna bhakt hanuman", "krishna", 199.99);
	Stock stock6 = new Stock("uma maheshwar bhakt nandi", "shambhu", 169.99);
	Stock stock7 = new Stock("brahma bhakt ravan", "brahmna", 159.99);
	
	List<Stock> allStocks = new ArrayList<Stock>();
	allStocks.add(stock1);
	allStocks.add(stock2);
	allStocks.add(stock3);
	allStocks.add(stock4);
	allStocks.add(stock5);
	allStocks.add(stock6);
	allStocks.add(stock7);
	return allStocks;
}
}
