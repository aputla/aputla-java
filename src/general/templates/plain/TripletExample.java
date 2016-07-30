package general.templates.plain;

import java.util.Objects;

class Triplet<First extends Comparable<First>, Second extends Comparable<Second>, Third extends Comparable<Third>> 
        implements Comparable<Triplet<First, Second, Third>> {
    
    private final First first;
    private final Second second;
    private final Third third;
    
    public Triplet(First first, Second second, Third third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public First getFirst() {
        return first;
    }
    
    public Second getSecond() {
        return second;
    }
    
    public Third getThird() {
        return third;
    }
    
    @Override
    public String toString() {
        return "Triplet {" +
                   "first=" + Objects.toString(first) + ", " +
                   "second=" + Objects.toString(second) + ", " + 
                   "third=" + Objects.toString(third) +
               "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Triplet)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        Triplet<First, Second, Third> other = (Triplet<First, Second, Third>) obj;
        return Objects.equals(first, other.first) &&
               Objects.equals(second,  other.second) &&
               Objects.equals(third, other.third);
    }

    @Override
    public int compareTo(Triplet<First, Second, Third> other) {
        if (!first.equals(other.first)) {
            return first.compareTo(other.first);
        }
        if (!second.equals(other.second)) {
            return second.compareTo(other.second);
        }
        return third.compareTo(other.third);
    }
}

public class TripletExample {
    public static void main(String[] args) {
        Triplet<Integer, Integer, Integer> triplet = new Triplet<>(1, 2, 3);
        System.out.println(triplet);
    }
}
