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
    }


    private List<Integer> primeFactorsOf(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        return factors;
    }
}
