package general.templates.plain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Graph<VertexType extends Comparable<VertexType>, WeightType extends Comparable<WeightType>> {
    
    private final boolean isBiDirectional;
    private Map<VertexType, Set<VertexType>> adjacencyMap = new HashMap<>();
    private Map<Pair<VertexType, VertexType>, WeightType> weightedMap = new HashMap<>();

    private Graph(boolean isBiDirectional) {
        this.isBiDirectional = isBiDirectional;
    }
    
    public static <VertextType extends Comparable<VertextType>, WeightType extends Comparable<WeightType>> Graph<VertextType, WeightType> biDirectional() {
        return new Graph<>(true);
    }
    
    public static <VertextType extends Comparable<VertextType>, WeightType extends Comparable<WeightType>> Graph<VertextType, WeightType> uniDirectional() {
        return new Graph<>(false);
    }
    
    public void add(VertexType from, VertexType to, WeightType w) {
        updateAdjacencyMap(from, to);
        weightedMap.put(new Pair<>(from, to), w);
        if (isBiDirectional) {
            updateAdjacencyMap(to, from);    
            weightedMap.put(new Pair<>(to, from), w);
        }
    }
    
    public WeightType getWeight(int from, int to) {
        return weightedMap.get(new Pair<>(from, to));
    }
    
    public Set<VertexType> toList(VertexType from) {
        Set<VertexType> result = adjacencyMap.get(from);
        if (result == null) {
            return Collections.emptySet();
        }
        return result;
    }
    
    private void updateAdjacencyMap(VertexType from, VertexType to) {
        Set<VertexType> adjacencyList = adjacencyMap.get(from);
        if (adjacencyList == null) {
            adjacencyList = new TreeSet<>();
            adjacencyMap.put(from, adjacencyList);
        }
        adjacencyList.add(to);
    }
    
    @Override
    public String toString() {
        return weightedMap.toString();
    }
}

public class GraphExample {
    public static void main(String[] args) {
        Graph<Integer, Integer> graph = Graph.biDirectional();
        graph.add(1, 2, 10);
        graph.add(2, 3, 20);
        System.out.println(graph);
        System.out.println(graph.toList(1));
    }
}
