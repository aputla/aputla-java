package lava.util.stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeforeStreams {
    private static class Transaction {
        public static final String GROCERY = "grocery";
        
        private final String id;
        private final String type;
        private final Integer value;
        
        public Transaction(String id, String type, int value) {
            this.id = id;
            this.type = type;
            this.value = value;
        }
        
        public String getId() {
            return id;
        }
        
        public String getType() {
            return type;
        }
        
        public Integer getValue() {
            return value;
        }
    }
    
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("one", "grocery", 10),
                new Transaction("one", "electronics", 10),
                new Transaction("two", "grocery", 20)
        );
        
        List<Transaction> groceryTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getType() == Transaction.GROCERY) {
                groceryTransactions.add(transaction);
            }
        }
        Collections.sort(groceryTransactions, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction t1, Transaction t2) {
                return t2.getValue().compareTo(t1.getValue());
            }
        });
        List<String> transactionIds = new ArrayList<>();
        for (Transaction transaction : groceryTransactions) {
            transactionIds.add(transaction.getId());
        }
        System.out.println(transactionIds);
    }
}
