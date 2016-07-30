package lava.util.stream.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AfterStreams {
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
        
        List<String> transactionIds = transactions.stream()
                    .filter(t -> t.getType() == Transaction.GROCERY)
                    .sorted(Comparator.comparing(Transaction::getValue).reversed())
                    .map(t -> t.getId())
                    .collect(Collectors.toList());
        System.out.println(transactionIds);
    }
}
