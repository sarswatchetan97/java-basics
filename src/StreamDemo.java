import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // Immutable list allows null
        var immutableList = Stream.of("red", "green", null).toList();
        System.out.println(immutableList);

        // Modifiable list allows null
        var modifiableList = Stream.of("red", "green", null).collect(Collectors.toList());
        modifiableList.add("white");
        modifiableList.set(2, "yellow");
        System.out.println(modifiableList);

        record Product (String name,
                        String category,
                        int price) {};

        Stream<Product> productStream = Stream.of(
                new Product("Laptop", "Electronics", 1000),
                new Product("TV",
                        "Electronics", 1500),
                new Product("Sofa",
                        "Furniture", 700),
                new Product("Table",
                        "Furniture", 300),
                new Product("Lamp",
                        "Home Decor", 50)
        );

        // Grouping maps by category

//        Map<String, List<Product>> groupProductsByCategory = productStream.collect(Collectors.groupingBy(Product::category));
//        System.out.println(groupProductsByCategory);

        //Aggregation: Calculating total price of products by category

//        Map<String, Integer> totalPriceByCategory = productStream.collect(Collectors.groupingBy(Product::category,
//                Collectors.summingInt(Product::price)));
//
//        System.out.println(totalPriceByCategory);

        // Average

//        Map<String, Double> avgPriceByCategory = productStream.collect(Collectors.groupingBy(Product::category,
//                Collectors.averagingInt(Product::price)));
//
//        System.out.println(avgPriceByCategory);

        // Count

//        Map<String, Long> countByCategory = productStream.collect(Collectors.groupingBy(Product::category,
//                Collectors.counting()));
//
//        System.out.println(countByCategory);

        //Filtering: Products with price gt>50

//        var filteredProducts = productStream.filter(product -> product.price>1000).toList();
//        System.out.println(filteredProducts);

        //Mapping: Extracting product names
//        var extractProductCategories  = productStream.map(Product::category)
//                .collect(Collectors.toList());
//        System.out.println(extractProductCategories);

        //Partitioning: Seperate products in expensive and cheap
//        var partitionedProducts  = productStream.collect(
//                Collectors.partitioningBy(product -> product.price > 700)
//        );
//        System.out.println(partitionedProducts);

        //Using SummaryStatistics for product prices
        //sum, average, min, max, count (5 metrics)

        Map<String, IntSummaryStatistics> summaryStatisticsMap = productStream.collect(Collectors.groupingBy(
                Product::category,
                Collectors.summarizingInt(Product::price)
                )
        );

        System.out.println(summaryStatisticsMap);

    }
}
