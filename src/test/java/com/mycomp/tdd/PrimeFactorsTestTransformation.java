package com.mycomp.tdd;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTestTransformation {

    private Matcher<? super List<Integer>> isListOf(Integer... ints) {
        return is(asList(ints));
    }

    @Test
    public void factors() throws Exception {
        assertThat(primeFactorsOf(1), isListOf());
        assertThat(primeFactorsOf(2), isListOf(2));
        assertThat(primeFactorsOf(3), isListOf(3));
        assertThat(primeFactorsOf(4), isListOf(2, 2));
        assertThat(primeFactorsOf(5), isListOf(5));
        assertThat(primeFactorsOf(6), isListOf(2, 3));
        assertThat(primeFactorsOf(7), isListOf(7));
        assertThat(primeFactorsOf(8), isListOf(2, 2, 2));
        assertThat(primeFactorsOf(9), isListOf(3, 3));
        assertThat(primeFactorsOf(2 * 2 * 3 * 3 * 5 * 7 * 11 * 11 * 13), isListOf(2, 2, 3, 3, 5, 7, 11, 11, 13));
    }


    private List<Integer> primeFactorsOf(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int divisior = 2; n > 1; divisior++)
            for (; n % divisior == 0; n /= divisior)
                factors.add(divisior);

        return factors;
    }
}
