package general.templates.guava;

import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableMap;

public class LoadingCacheExample {
    private static class Image {
        private final Map<String, Integer> map = ImmutableMap.of("one", 1, "two", 2);
        Cache<String, Integer> cache = CacheBuilder.newBuilder().build();
        
        public Integer get(String key) {
            try {
                return cache.get(key, () -> {
                    System.out.println("miss");
                    return map.get(key); 
                });
            } catch (ExecutionException e) {
            }
            return null;
        }
    }
    
    public static void main(String[] args) {
        Image image = new Image();
        System.out.println(image.get("one"));
        System.out.println(image.get("one"));
    }
}
