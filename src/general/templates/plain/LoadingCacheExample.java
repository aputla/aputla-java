package general.templates.plain;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

public class LoadingCacheExample {
    private static class LoadingCache<Key, Value> {
        private final ConcurrentMap<Key, Value> cache = new ConcurrentHashMap<>();
        
        public Value get(Key key, Function<Key, Value> function) {
            Value output = cache.get(key);
            if (output == null) {
                System.out.println("Miss");
                output = function.apply(key);
                if (output != null) {
                    cache.put(key, output);
                }
            }
            return output;
        }
    }
    
    private static class Image {
        private final Map<String, Integer> slowMap = new HashMap<>();
        private final LoadingCache<String, Integer> cache = new LoadingCache<>();
        
        public Image() {
            slowMap.put("one", 1);
            slowMap.put("two", 2);
        }
        
        public Integer get(String key) {
            return cache.get(key, this::lookup);
        }
        
        private Integer lookup(String key) {
            return slowMap.get(key);
        }
    }
    
    public static void main(String[] args) {
        Image image = new Image();
        System.out.println(image.get("one"));
        System.out.println(image.get("one"));
    }
}
