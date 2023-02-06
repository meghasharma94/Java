package com.ilearn.junit;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ArraysAndIterableTest {

    @Test
    void test_array_compare() {
        String[] s1 = {"Hello Mario !!", "Junit5", "Java"};
        String[] s2 = {"Hello Mario !!", "Junit5", "Java"};

        assertArrayEquals(s1, s2);
    }


    @Test
    void test_iterables() {
        List<Integer> il1 = List.of(1, 2, 3);
        List<Integer> il2 = List.of(1, 2, 3);

        assertIterableEquals(il1, il2);

        Set<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);

        assertIterableEquals(il1, hs1);

    }

}
