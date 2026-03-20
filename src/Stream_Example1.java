import java.util.Arrays;
import java.util.List;

class Transaction {

    private String category;
    private int amount;

    public Transaction(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }
}

public class Stream_Example1 {
    public static void main(String[] args) {

        List<Transaction> transactionList = Arrays.asList(
            new Transaction("Grocery", 2500),
            new Transaction("Entertainment", 500),
                new Transaction("Grocery", 1500),
                new Transaction("Utilities", 1200),
                new Transaction("Utilites", 500),
                new Transaction("Entertainment", 1500)
        );

//        Calculate total amount spent on groceries
        int amount = transactionList.stream()
                .filter(c -> c.getCategory().equals("Grocery"))
                .mapToInt(Transaction::getAmount)
                .sum();

        System.out.println(amount);

//        Find average expense across all categories

        double averageExpense = transactionList.stream()
                .mapToDouble(Transaction::getAmount)
                .average().orElse(0.0);

        System.out.println(Math.round(averageExpense));
    }
}
