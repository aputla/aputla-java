package general.templates.plain;

import java.util.Objects;

class Pair<First extends Comparable<First>, Second extends Comparable<Second>> implements Comparable<Pair<First, Second>> {
    private final First first;
    private final Second second;
    
    public Pair(First first, Second second) {
        this.first = first;
        this.second = second;
    }
    
    public First getFirst() {
        return first;
    }
    
    public Second getSecond() {
        return second;
    }
    
    @Override
    public String toString() {
        return "Pair {" +
                   "first=" + Objects.toString(first) + ", " +
                   "second=" + Objects.toString(second) +
               "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Pair)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        Pair<First, Second> other = (Pair<First, Second>) obj;
        return Objects.equals(first, other.first) &&
               Objects.equals(second,  other.second);
    }

    @Override
    public int compareTo(Pair<First, Second> other) {
        if (!first.equals(other.first)) {
            return first.compareTo(other.first);
        }
        return second.compareTo(other.second);
    }
}

public class PairExample {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(1, 2);
        System.out.println(pair);
    }
}
