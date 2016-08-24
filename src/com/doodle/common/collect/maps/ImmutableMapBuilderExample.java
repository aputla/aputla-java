package com.doodle.common.collect.maps;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class ImmutableMapBuilderExample {
    public static void main(String[] args) {
        Map<String, Integer> wordsToInteger = ImmutableMap.<String, Integer>builder()
                .put("one", 1)
                .put("two", 2)
                .build();
        System.out.println(wordsToInteger);
    }
}
