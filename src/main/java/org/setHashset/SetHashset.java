package org.setHashset;

import java.util.HashSet;
import java.util.Set;

public class SetHashset {
    public static void main(String[] args) {
        Set<Integer> empIds = new HashSet<>();
        empIds.add(123);
        System.out.println(empIds);

        HashSet<Integer> empDetails = new HashSet<>();
        empDetails.add(124);
        System.out.println(empDetails);

    }
}
