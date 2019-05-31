package com.mycomp.tdd;

import org.hamcrest.Matcher;
import org.junit.Assert;
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
    }


    private List<Integer> primeFactorsOf(int n) {
        return new ArrayList<>();
    }
}
