package org.maps;

import java.util.HashMap;

public class Maps {
    public static void main (String[] args){

        HashMap<Integer, String> empIds = new HashMap<>();
        empIds.put(1209, "John");
        System.out.println(empIds);

        System.out.println(empIds.get(1209));
        System.out.println(empIds.containsValue("John"));
    }

}
